package Thread;

class Top2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 30; i++) {
            System.out.print((Thread.currentThread()).getName() + i + "\t");
        }
    }
}

public class Runnable3Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        Top2 t = new Top2();
        Thread thd1 = new Thread(t, "a");
        Thread thd2 = new Thread(t, "b");
        thd1.setPriority(9);
        thd1.setName("new_a");
        thd2.setName("new_b");
        System.out.println(thd1.getPriority());
        // 따로 지정하지 않았을 경우 우선순위 5로 자동 지정
        System.out.println(thd2.getPriority());
        thd1.start();
        thd2.start();
        System.out.println("프로그램 종료");
    }
}