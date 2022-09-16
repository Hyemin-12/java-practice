public class EqualExam {
    public static void main(String args[]){
        String str1 = "Mirim";
        String str2 = "Mirim";
        String str3 = new String("highschool");
        String str4 = new String("highschool");
        String str5 = "test";
        String str6 = new String("test");

        //문자열을 만들어서 비교
        if(str1 == str2) System.out.println("주소 같다");
        else System.out.println("주소 다르다.");
        //생성자를 이용해서 생성한 문자열
        if(str3 == str4) System.out.println("주소 같다");
        else System.out.println("주소 다르다.");
        //내용만 비교하는 것
        if(str1.equals(str2)) System.out.println("내용 같다");
        else System.out.println("내용 다르다.");
        if(str3.equals(str4)) System.out.println("내용 같다");
        else System.out.println("내용 다르다.");
        //내용은 같은데 생성자와 문자열로 비교
        if(str5 == str6) System.out.println("주소 같다");
        else System.out.println("주소 다르다.");
        if(str5.equals(str6)) System.out.println("내용 같다");
        else System.out.println("내용 다르다.");
    }
}
