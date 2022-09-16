import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Search_test {
    int length;
    String num[] = new String[10];
    String name[] = new String[10];
    String number[] = new String[10];

    public void writingData(int fnum) throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(new File("fnum"));
            bw = new BufferedWriter(fw);
            for(int j = 0; j < length; j++){
                bw.write(num[j]+"\t"+name[j]+"\t"+ number[j]);
                bw.newLine();
            }
            bw.close();
            fw.close();
        }catch (FileNotFoundException e){
            System.out.println("잘못된 파일을 입력함");
        }
    }
    public void readingData(String fnum) throws IOException{
        try {
            String csv = "";
            String tmp = "";
            FileReader fr = new FileReader(new File(fnum));
            BufferedReader br = new BufferedReader(fr);
            do{
                tmp = br.readLine();
                if(tmp!= null){
                    csv += tmp + "\t";
                }
            }while (tmp != null);
            StringTokenizer parse = new StringTokenizer(csv, "\t");
            length = parse.countTokens();
            for(int i = 0; i < length; i++){
                name[i] = parse.nextToken();
                num[i] = parse.nextToken();
                number[i] = parse.nextToken();
            }
        }catch (FileNotFoundException e){
            System.out.println("오류발생");

        }
    }
}
