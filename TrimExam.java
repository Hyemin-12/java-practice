public class TrimExam {
    public static void main(String args[]){
        String strData1 = " I Love You ";
        String strData2;
        strData2 = strData1.trim(); //공백을 제외하여서 I Love You이다.]
        System.out.println("strData1 ->" + strData1);
        System.out.println("strData2.trim() ->" + strData2);
        if(strData1.equals(strData2)) //공백이 있고 없고 차이가 있기 때문에 같지 않다.
            System.out.println("같음");
        else System.out.println("다름");
    }
}
