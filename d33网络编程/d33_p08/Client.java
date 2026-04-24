package d33_p08;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        byte[] bytes = "你好！".getBytes();
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        ds.send(dp);
    }
}
