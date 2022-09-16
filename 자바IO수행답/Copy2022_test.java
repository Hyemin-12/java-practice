package 자바IO수행답;

import java.io.*;
import java.util.Objects;

public class Copy2022_test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("mirim.txt");
        FileOutputStream fos = new FileOutputStream("copy.txt");
        int c;
        while((c = fis.read()) != -1) {
            fos.write((byte)c);
        }
            fis.close();
            fos.close();
    }
}