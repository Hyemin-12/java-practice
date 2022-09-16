public class SubstringExam {
    public static void main(String args[]){
        String strData1 = "I Love You";
        String strData3;
        strData3 = strData1.substring(7); //문자열의 일부를 반환하는 메소드
        //start부터 end-1까지 문자열을 리턴
        System.out.println("strData1.substring(7) -> " + strData3);
        strData3 = strData1.substring(2,5);// 2부터 5-1까지
        System.out.println("strData1.substring(2,5) -> " +strData3 );
    }
}
