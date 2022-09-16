interface PhoneInterface{
    final int TIMEOUT = 10000; //인터페이스에 상수 필드 선언 
    void sendCall(); //인터페이스에서는 abstract 생략하여도 추상 메서드로 인식 
    void receiveCall(); //추상 메서드
    default void printLogo(){ //default메소드
        System.out.println("** Phone **");
    }
}

interface MobilePhoneInterface extends PhoneInterface{
    void sendSMS(); //추상메서드
    void receiveSMS(); //추상메서드
}
interface  MP3Interface{
    public void play();
    public void stop();
}

class PDA{
    public int calculate(int x,int y){
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
    //MobilePhoneInterface의 추상 메소드 구현

    @Override
    public void sendCall() {
        System.out.println("전화 걸기");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 받기");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자 보내기");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자 받기");
    }

    @Override
    public void play() {
        System.out.println("MP3 재생");
    }

    @Override
    public void stop() {
        System.out.println("MP3 중지");
    }

    //추가로 작성한 메소드
    public void schedule(){
        System.out.println("일정 관리");
    }
}

class SansungPhone implements PhoneInterface{ //시험문제 implements 빈칸 만들어넣고 무엇을 넣어야 하는가
    //PhoneInterfac의 모든 추상 메서드 구현해야 함!

    @Override
    public void sendCall() {
        System.out.println("띠리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    //삼성폰에만 있는 메서드
    public void flash(){
        System.out.println("전화기의 불이 켜졌습니다.");
    }
}

public class InterfaceEx {
    public static void main(String args[]){
        SansungPhone phone = new SansungPhone();
        phone.printLogo(); //인터페이스에 존재하는 디폴트 메서드
        phone.sendCall(); //삼성폰에서 재정의한 메서드
        phone.receiveCall(); //삼성폰에서 재정의한 메서드
        phone.flash(); //삼성폰에만 있는 메서드

        SmartPhone sPhone = new SmartPhone();
        sPhone.printLogo(); //PhoneInterface에 존재하는 메서드
        sPhone.sendCall(); //PhoneInterface에 존재하는 추상 메서드
        sPhone.play();//MP3Interface에 존재하는 추상메서드
        System.out.println("3과 5를 더하면 "+sPhone.calculate(3,5)); //PDA클래스에 존재하는 메서드
        sPhone.schedule(); //SmartPhone에 존재하는 메서드
    }
}
