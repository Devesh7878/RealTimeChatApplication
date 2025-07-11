package ChatSocketProject.Client;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ChatSocketClient {
    private Socket socket = null;
    private InputStream inStream = null;
    private OutputStream outStream = null;

    public ChatSocketClient() {
    }

    public void createSocket() {
        try {
            socket = new Socket("localhost", 3339); // Corrected host name to "localhost"
            System.out.println("Connected");
            inStream = socket.getInputStream();
            outStream = socket.getOutputStream();
            createReadThread();
            createWriteThread();
        } catch (UnknownHostException u) {
            u.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public void createReadThread() {
        Thread readThread = new Thread() {
            public void run() {
                while (socket.isConnected()) {
                    try {
                        byte[] readBuffer = new byte[200];
                        int num = inStream.read(readBuffer);

                        if (num > 0) {
                            byte[] arrayBytes = new byte[num];
                            System.arraycopy(readBuffer, 0, arrayBytes, 0, num);
                            String recvedMessage = new String(arrayBytes, "UTF-8");

                            if (recvedMessage.equalsIgnoreCase("Server: I'm busy")) {
                                System.out.println("Server:Busy");
                                System.out.println("Available after 16:00");
                            } else {
                                System.out.println("Received message: " + recvedMessage);
                            }
                        }

                    } catch (SocketException se) {
                        System.exit(0);
                    } catch (IOException i) {
                        i.printStackTrace();
                    }
                }
            }
        };

        readThread.setPriority(Thread.MAX_PRIORITY);
        readThread.start();
    }

    public void createWriteThread() {
        Thread writeThread = new Thread() {
            public void run() {
                while (socket.isConnected()) {
                    try {
                        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
                        sleep(100);
                        String typedMessage = inputReader.readLine();
                        if (typedMessage != null && typedMessage.length() > 0) {
                            synchronized (socket) {
                                outStream.write(typedMessage.getBytes("UTF-8"));
                                sleep(100);
                            }
                        }
                    } catch (IOException i) {
                        i.printStackTrace();
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
            }
        };

        writeThread.setPriority(Thread.MAX_PRIORITY);
        writeThread.start();
    }

    public static void main(String[] args) throws Exception {
        ChatSocketClient myChatClient = new ChatSocketClient();
        myChatClient.createSocket();
    }
}
