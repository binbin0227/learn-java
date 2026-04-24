package d33_p16;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",10086);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.nextLine();
            if("886".equals(str)){
                break;
            }
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        s.close();
    }
}
