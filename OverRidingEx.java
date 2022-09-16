class Shape{ //draw() 메소드를 가지고 있다.
    //draw()메소드는 Shape를 출력
    public Shape next;  //객체

    public Shape(){
        next = null;
    }
    public void draw(){
        System.out.println("shape");
    }
}

class Line extends Shape{
    @Override  //컴파일러가 읽도록 하는 주석 = 어노테이션
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println();
    }
}
class Circle2 extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle2");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}


public class OverRidingEx {
    static void paint(Shape p){
        p.draw(); //p가 가리키는 객체 내에 오버라이딩된 draw() 호출
        //동적 바인딩이다
    }

    public static void main(String args[]){
        Line line = new Line();
        paint(line);  //길게 쓴거
        paint(new Shape());
        paint(new Line()); //짧게 쓴거
        paint(new Rect());
        paint(new Circle2());
        paint(new Triangle());
    }
}
