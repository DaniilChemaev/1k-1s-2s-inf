import java.io.IOException;

public class CopyThread extends Thread {
    private String filepath;
    private int n;

    public CopyThread(String filepath, int n) {
        this.filepath = filepath;
        this.n = n;
    }

    public void run() {
        // TODO: do correct filenaming with respect to extensions
        String newfilepath = filepath + n;

        try {
            Task1.copy(filepath, newfilepath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
