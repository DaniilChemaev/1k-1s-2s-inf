import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task1 {
    public static void copy(String filename1, String filename2) throws IOException {
        FileInputStream fis = new FileInputStream(filename1);
        FileOutputStream fos = new FileOutputStream(filename2);
        int x = fis.read();
        while (x != -1) {
            fos.write(x);
            x = fis.read();
        }
        fis.close();
        fos.close();
    }

    public static void copyNTimesWithThread(String filepath, int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            Thread t1 = new CopyThread(filepath, i);
            t1.start();
            if (i + 1 < n) {
                Thread t2 = new CopyThread(filepath, i + 1);
                t2.start();
                t1.join();
            }
            t1.join();
        }
    }

    public static void main(String[] args) throws IOException {
        String filepath;
        int n = 20;
//        copyNTimesWithThread("files/file.txt", "files/file_copied.txt");
    }
}
