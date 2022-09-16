package IO_Test;

import java.io.IOException;

public class Echo2Exam {
    public static void main(String[] args) {
        int bt;
        try {
            while ((bt = System.in.read()) != -1){
                System.out.print((char)bt);
            }
        }catch (IOException e){
            System.out.print(e);
        }
    }
}
