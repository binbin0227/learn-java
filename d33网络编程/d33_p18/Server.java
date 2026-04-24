package d33_p18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        File f = new File("d33网络编程/d33_p18/desc/收到的小说.txt");
        ServerSocket ss = new ServerSocket(10086);
        Socket s = ss.accept();
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.flush();
        bos.close();

        bw.write("接收成功！");
        bw.newLine();
        bw.flush();

        s.close();
        ss.close();


    }
}
