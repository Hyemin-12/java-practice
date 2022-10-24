package Thread;

class Bank {
    private int money = 10000; // 계좌 초기 금액
    public int getMoney() {
        return this.money;
    }

    // money 세팅
    public void setMoney(int money) {
        this.money = money;
    }

    public void saveMoney(int save) { // 입금
        int m = this.getMoney();

        try {
            Thread.sleep((500)); // 0.5초 간 정지 후 실행
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setMoney(m + save); // 기존 예금액 + 입금액
    } // end of saveMoney

    public void minusMoney(int minus) { // 출금
        int m = this.getMoney();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setMoney(m - minus); // 기존 예금액 - 출금액
    } // end of minus
} // end of Bank

class Family1 extends Thread { // Thread를 상속받아서 구현
    public void run() { // Thread에서 해야 할 작업을 구현
        synchronized (BankExam.myBank) {
            BankExam.myBank.saveMoney(5000);
        }
        System.out.println("saveMoney(5000) : " + BankExam.myBank.getMoney());
    } // end of run
} // end of Family1

class Family2 extends Thread { // Thread를 상속받아서 구현
    public void run() { // Thread에서 해야 할 작업을 구현
        synchronized (BankExam.myBank) {
            BankExam.myBank.minusMoney(2000);
        }
        System.out.println("minusMoney(2000) : " + BankExam.myBank.getMoney());
    } // end of run
} // end of Family2

public class BankExam {
    public static Bank myBank = new Bank();
    public static void main(String[] args) {
        System.out.println("원금 : " + myBank.getMoney()); // 원금 : 10000
        Family1 f1 = new Family1();
        Family2 f2 = new Family2();
        
        f1.start(); // f1 스레드 시작
        
        try {
            Thread.sleep(200); // 0.2초
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        f2.start(); // f2 스레드 시작
    }
}
