package d33_p17;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket s = ss.accept();

        // 1. 流的包装放在循环外面！只包装一次
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        // 2. 核心逻辑：读一行，回一行
        while ((line = br.readLine()) != null) {
            System.out.println("客户端说：" + line);

            // 收到消息立刻回话
            bw.write("我听见了：" + line);
            bw.newLine(); // 别忘了给 Client 发个换行，不然 Client 的 readLine 也会卡住
            bw.flush();   // 强制冲刷，确保消息发出去
        }

        // 3. 释放资源
        bw.close();
        br.close();
        s.close();
        ss.close();

    }
}
