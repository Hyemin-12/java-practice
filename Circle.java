public class Circle {
    int radius;
    String name;

    public Circle(){
        radius = 1;
        name = "";
    } //생성자1, 반지름1, 이름은 빈칸으로 초기화 시킨다.

    public Circle(int r, String n){  //매개변수 존재
        this.radius = r;
        this.name = n;
    } //생성자2, 매개변수가 존재하는 생성자

    public Circle(int r1){
        this.radius = r1;
    }  //생성자3

    public Circle(String n1){
        this.name = n1;
    }  //생성자4

    public double getARea(){  //넓이 구하기
        return 3.14 * radius * radius;
    }

    /*
    클래스는 자바 객체의 틀이다. 유사한 특징을 가진 객체들을 모아 만드는 것
    생성자와 같이 사용되는 것은 오버로딩이다.
    new 연산자를 생성하여서 객체를  생성하는 것을 오버로딩이라고 한다.
    오버로딩은 생성자들이 과하게 쌓여있다. 생성자 여러개 즉, 매개변수가 다른 생성자들이 과하게 쌓여있다.
    +오버라이딩과의 차이점을 잘 알고 있어야 한다.
    오버라이딩은 자식에게 상속으로 재정의이다. private를 제외한 모든 것을 상속
     */

    public static void main(String args[]){
        Circle pizza = new Circle(10,"자바피자");  //선언과 동시에 초기화

//        pizza.radius = 10;  //피자의 반지름 설정
//        pizza.name = "자바피자";  //피자의 이름 설정
        double area = pizza.getARea(); //피자 넓이 구하기

        System.out.println(pizza.name+"의 면적은 "+area);

//        Circle donut = new Circle();  //Circle 클래스로 도넛 객체 생성
//        donut.radius = 2;   //도넛 반지름 설정
//        donut.name = "자바도넛";  //도넛 이름 설정
//        area = donut.getARea();  // 도넛 면적 구하기
//        System.out.println(donut.name+"의 면적은 "+ area);

        //매개변수가 1개만 사용되는 경우(매개변수 r1만 사용)
        Circle pizza2 = new Circle(3);  //선언과 동시에 초기화
        pizza2.name = "pizza2";
        area = pizza2.getARea();
        System.out.println(pizza2.name+"의 면적은 "+area);

//        매개변수 1개만 사용되는 경우(매개변수 n1만 사용)
//        Circle yamyam = new Circle("얌얌");
//        yamyam.radius = 6;
//        area = yamyam.getARea();

//        System.out.println(yamyam.name+"의 면적은 "+area);
    }
}
