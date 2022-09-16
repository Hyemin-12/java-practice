package exception;

public class ThrowExam {
    public static void arrayMethod() throws ArrayIndexOutOfBoundsException {
        String[] irum = new String[3];
        irum[3] = "홍길동"; // 에러 발생
    }

    public static void main(String[] args) {
        ThrowExam ts = new ThrowExam();
        try {
            arrayMethod(); // 에러 처리 실행
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("배열 예외 발생");
        }
    }
}
