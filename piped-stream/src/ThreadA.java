import java.io.*;

public class ThreadA implements Runnable{
    private PipedInputStream in;

    public ThreadA() throws IOException {
        in= new PipedInputStream(Main.out);
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
