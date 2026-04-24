package d33_p18;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        File f = new File("d33网络编程/d33_p18/src/小说.txt");
        Socket s = new Socket("localhost", 10086);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.flush();
        s.shutdownOutput();
        bis.close();

        String line = br.readLine();
        System.out.println("服务器说：" + line);

        s.close();

    }
}
