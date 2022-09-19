package Thread;

class Top implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 50; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class Runnable1Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        // 1. Runnable을 구현하는 객체 만들기
        Top p = new Top();

        // 2. Runnable을 장착한 후 진짜 스레드 만들기
        Thread thd1 = new Thread(p);
        Thread thd2 = new Thread(p);
        thd1.start();
        thd2.start();
        System.out.println("프로그램 종료");

    }
}
