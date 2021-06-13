package ch6.dahye.item41;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.math.BigDecimal;

public class SerializableTest {

    @Test
    void serializableTest() throws IOException {

        File f= new File("test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(f));
        objectOutputStream.writeObject(new Item(1L, "item A", new BigDecimal(30000)));
    }
}
