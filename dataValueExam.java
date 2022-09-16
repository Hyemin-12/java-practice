
import java.util.StringTokenizer;

public class dataValueExam {
    public static void main(String args[]){
        String line;
        String tmpStr = "hong 용산구 10.5 20.5";
        StringTokenizer parse = new StringTokenizer(tmpStr);
        //하나의 문자열을 여러개의 문자열 토큰으로 나눠 사용하는 녀석
        String name;
        String address;
        double math;
        double english;
        double total;
        double avg;
        name = parse.nextToken();
        address = parse.nextToken();
        math = Double.valueOf(parse.nextToken()).doubleValue();
        english = Double.valueOf(parse.nextToken()).doubleValue();
        total = math + english;
        avg = total / 2.0;
        System.out.println(name + "\t" + address + "\t "+math +"\t"+english+"\t"+total +"\t"+avg);

    }
}
