class Animal {
    public void bark() {
        System.out.println("동물이 내는 소리");
    }
}

class Cat extends Animal {
    // Animal의 bark를 오버라이딩하여 재정의함
    @Override
    public void bark() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    // Animal의 bark를 오버라이딩하여 재정의함
    @Override
    public void bark() {
        // Animal의 bark에 접근
        super.bark();
        System.out.println("멍멍");
    }
}

public class OverridingEx2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.bark();

        Cat c = new Cat();
        c.bark();

        Dog d = new Dog();
        d.bark();
    }
}
