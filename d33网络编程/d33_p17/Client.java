package d33_p17;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 10086);

        // 1. 把流的包装提出来，只做一次！
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if ("886".equals(str)) break;

            // 2. 发送消息
            bw.write(str);
            bw.newLine();
            bw.flush();

            // 3. 接收反馈：不要用 while，只读一行！
            // 因为 Server 发了 newLine，这里 readLine 读到换行符就会立刻返回
            String feedback = br.readLine();
            System.out.println("服务端反馈：" + feedback);
        }

        bw.close();
        br.close(); // 记得关闭
        s.close();
    }
}
