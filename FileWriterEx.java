import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        FileWriter fout = null;
        int c;
        try {
            fout = new FileWriter("tst.txt",true); //파일과 연결된 출력문자 스트림생성
            while(true){
                String line = scan.nextLine();
                if(line.length()==0) //한줄에 <Enter>키만 입력한 경우
                    break;
                fout.write(line,0,line.length());
                fout.write("\r\n",0,2); //\r\n을 파일에 기록
            }
            fout.close();
        }catch(IOException e){
            System.out.println("입출력 오류");
        }
        scan.close();
    }
}
