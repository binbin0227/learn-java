package d28_p23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lock {
    public static void main(String[] args) throws    IOException {
        File file = new File("d28IO（字节流、字符流）/d28_p23/小说.txt");
        lockFile(file);
    }
    public static void lockFile(File unlockedFile) throws IOException {
        File lockedFile = new File(unlockedFile.getParentFile(), "加密" + unlockedFile.getName());
        try(FileInputStream fis = new FileInputStream(unlockedFile); FileOutputStream fos = new FileOutputStream(lockedFile)){
            byte[] b = new byte[1024 * 8];
            int len;
            while ((len = fis.read(b))!=-1){
                for (int i = 0; i < len; i++) {
                    b[i]= (byte) (b[i]^10);
                }
                fos.write(b,0,len);
            }
        }
    }
}
