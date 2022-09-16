public class StringEqualExam {
    public static void main(String args[]){
        String R1 = new String("JAVA");
        String R2 = new String("JAVA");
        String R3 = new String ("java");
        System.out.println("R1 == R2 --> "+(R1==R2)); //주소를 비교하는 것이므로 내용이 같더라도 다른 것을 가르킴 false
        System.out.println("R1.equals(R2) --> "+(R1.equals(R2))); //문자열의 내용만을 비교하는 것으로 같으므로 true
        System.out.println("R1 == R3 --> "+(R1==R3)); //주소를 비교하는 것이므로 다른 것을 가르킴 false
        System.out.println("R1.equals(R3) --> "+(R1.equals(R3))); //문자열의 내용이 다르므로 (대소문자 구분) false
    }
}
