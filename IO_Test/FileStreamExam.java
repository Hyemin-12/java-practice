package IO_Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExam {
    public static void main(String[] args) {
        byte[] b = new byte[1024];
        try {
            FileInputStream fis = new FileInputStream("tin.txt");
            FileOutputStream fos = new FileOutputStream("tout.txt");
            fis.read(b);
            fos.write(b);
            fis.close();
            fos.close();
        }catch(IOException e){
            System.out.println("오류가 발생했습니다. ");
        }

    }
}
