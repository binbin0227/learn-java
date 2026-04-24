package d33_p08;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 10086;
        DatagramSocket ds = new DatagramSocket(port);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        while (true) {
            ds.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());
            System.out.println("来自" + dp.getAddress() + "(" + dp.getPort() + ")的消息：" + str);
        }
    }
}
