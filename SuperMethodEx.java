class Point {
    int x, y;

    // 생성자
    Point() {
        // 생성자의 첫줄에 다른 생성자를 호출하지 않았기 때문에
        // 컴파일러가 이 부분에 자동으로 super()를 호출
        // 부모 클래스(최상위 클래스)인 Object 클래스의 super()가 호출
        this.x = 10;
        this.y = 20;
    }
}

class Point3D extends Point {
    int z = 30;

    // 생성자
    Point3D(int z) {
        super();	// 부모 클래스 생성자 호출
        this.z = z;
    }
}

public class SuperMethodEx {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);

        Point3D p3d = new Point3D(30);
        System.out.println("p3d.x = " + p3d.x);
        System.out.println("p3d.y = " + p3d.y);
        System.out.println("p3d.z = " + p3d.z);
    }
}