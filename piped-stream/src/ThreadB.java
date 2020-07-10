import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;

public class ThreadB implements Runnable {

    private PipedInputStream in;

    public ThreadB() throws IOException {
        in = new PipedInputStream(Main.out);
    }

    @Override
    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        try {
            String val = bufferedReader.readLine();
            System.out.println(val);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
