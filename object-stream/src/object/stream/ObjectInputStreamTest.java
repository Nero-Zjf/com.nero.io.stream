package object.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test.txt"));
        User user = (User) inputStream.readObject();
        System.out.println(user);
    }
}
