package Thread;

class Summing {
    private int sum;
    public synchronized void sumTo(int num) {
        sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            System.out.print("스레드 : " + Thread.currentThread().getName());
            System.out.println("의 1 ~ " + i + "까지 합은 " + sum);
            try {
                Thread.sleep(500); // 0.5초
            } catch (InterruptedException e) {
                // 실행순서 가로채기

            } // end of catch
        } // end of for
    } // end of sumTo
    public int getSum() {
        return sum;
    } // end of getSum
} // end of Summing

public class MultiThreadExam extends Thread{
    private Summing sum;
    private int num;
    public MultiThreadExam(String s, Summing sum, int num) {
        // 생성자를 이용하여 초기화
        super(s); // Thread에 s값을 전달 -> 스레드 이름 지정
        this.sum = sum;
        this.num = num;
        System.out.println("스레드 : " + getName() + "가 시작됨");
    }

    @Override
    public void run() {
        sum.sumTo(num);
        System.out.println("스레드 : " + getName() + "가 종료됨");
    }

    public static void main(String[] args) {
        Summing sum = new Summing();
        MultiThreadExam a = new MultiThreadExam("A", sum, 5);
        MultiThreadExam b = new MultiThreadExam("B", sum, 5);
        
        // 우선순위
        a.setPriority(8);
        b.setPriority(10);
        
        // 시작
        a.start();
        b.start();
    }
}
