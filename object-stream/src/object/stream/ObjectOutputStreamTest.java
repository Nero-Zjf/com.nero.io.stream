package object.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException {
        User user = new User("nero", 20);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test.txt"));
        outputStream.writeObject(user);
        outputStream.close();
    }
}
