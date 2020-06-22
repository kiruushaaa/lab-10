package by.learn.lifo.runner;

import by.learn.lifo.entity.StackArray;
import by.learn.lifo.exception.InvalidOperationException;
import by.learn.lifo.exception.WrongStackIndexException;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws InvalidOperationException, IOException, WrongStackIndexException {
        StackArray<Byte> stackArray = new StackArray<>();

        File file = new File("in.bin");
        if (!file.exists()) {
            file.createNewFile();
        }

        BufferedInputStream bif = new BufferedInputStream(new FileInputStream(file));
        while (bif.available() != 0) {
            stackArray.push((byte)bif.read());
        }
        bif.close();

        System.out.println(stackArray);
        System.out.println(stackArray.peek(4));
    }
}
