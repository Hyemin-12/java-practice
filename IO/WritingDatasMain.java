package IO;

import javafx.util.Builder;

import java.io.*;
import java.util.StringTokenizer;

class MDataRWExam{
    int length;
    String[] name = new String[10];
    String[] address = new String[10];
    double[] math = new double[10];
    double[] english = new double[10];
    double[] total = new double[10];
    double[] avg = new double[10];
    public void writingData(String fname, boolean append) throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(new File(fname));
            bw = new BufferedWriter(fw);
            for(int i = 0; i < length; i++){
                bw.write(name[i]+"\t"+address[i]+"\t"+math[i]+"\t"+english[i]+"\t"+total[i]+"\t"+avg[i]+"\t");
                bw.newLine();
            }
            bw.close();
            fw.close();
        }catch (FileNotFoundException fe) {
            System.out.println("잘못된 파일 이름을 입력 ");
        }
    }
    public void readingData(String fname) throws IOException {
        try {
            String csvStr = "";
            String tmpStr = "";
            FileReader fr = new FileReader(new File(fname));
            BufferedReader br = new BufferedReader(fr);
            //BufferdReader br = new BufferdReader(new FileReader(new File(fname)));
            do {
                tmpStr = br.readLine();
                if (tmpStr != null){
                    csvStr += tmpStr +"\t";
                }
            }while (tmpStr != null);
            StringTokenizer parse = new StringTokenizer(csvStr, "\t");
            length = parse.countTokens()/4;
            for (int i = 0; i < length; i++) {
                name[i] = parse.nextToken();
                address[i] = parse.nextToken();
                math[i] = Double.valueOf(parse.nextToken()).doubleValue();
                english[i] = Double.valueOf(parse.nextToken()).doubleValue();
                total[i] = math[i] + english[i];
                avg[i] = total[i]/2.0;
            }
        }catch (FileNotFoundException fe){
            System.out.println("잘못된 파일 이름을 입력");
        }
    }
}


public class WritingDatasMain {
    public static void main(String[] args) {
        MDataRWExam mrw = new MDataRWExam();
        try {
           mrw.readingData("writed.txt");
           mrw.writingData("writing.txt", false);
           //append값 false는 파일 이어쓰기를 하지 않음. 현재는 의미 없음

        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
