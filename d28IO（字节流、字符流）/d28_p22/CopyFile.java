package d28_p22;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("d28IO（字节流、字符流）/d28_p22/abc");
        File f2 = new File("d28IO（字节流、字符流）/d28_p22/def");
        copyFile(f1,f2);
    }

    public static void copyFile(File src, File dest) throws IOException {
        File newDir = new File(dest, src.getName());//要把 abc 拷贝到 def，实际上是在 def 里创建一个 abc 文件夹
        newDir.mkdirs();
        File[] files = src.listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            if (file.isFile()) {
                File destFile = new File(newDir, file.getName());
                try (FileInputStream fis = new FileInputStream(file);
                     FileOutputStream fos = new FileOutputStream(destFile);){
                    byte[] b = new byte[1024 * 8];
                    int len;
                    while ((len=fis.read(b))!=-1){
                        fos.write(b,0,len);
                    }
                }
            }else {
                copyFile(file,newDir);
            }
        }
    }
}
