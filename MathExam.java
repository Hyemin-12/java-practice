public class MathExam {
    public static void main(String args[]){
        //abs() 절대값
        System.out.println("절대값");
        System.out.println(Math.abs(25));
        System.out.println(Math.abs(-25));
        System.out.println(Math.abs(2.5));
        System.out.println(Math.abs(-2.5));

        //round()반올림
        System.out.println("반올림");
        System.out.println(Math.round(25)); //25
        System.out.println(Math.round(25.3)); //25
        System.out.println(Math.round(25.5)); //26
        System.out.println(Math.round(-25.4));//-25
        System.out.println(Math.round(-25.5)); //-25 더 큰쪽으로 가기 때문이다.
        System.out.println(Math.round(-25.6)); //-26

        //pow() 거듭제곱
        System.out.println("거듭제곱");
        System.out.println(Math.pow(3,2));
        System.out.println(Math.pow(3.0f,2.0f));
        System.out.println(Math.pow(5.0,2));
        System.out.println(Math.pow(-5.0,3.0));

        //sqrt() 제곱근]
        System.out.println("제곱근");
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(9.0f));
        System.out.println(Math.sqrt(9.0));
        System.out.println(Math.sqrt(-9.0));

        //random() 난수
        System.out.println("난수");
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println((int)Math.random()*5); //항상 0이 나온다.
        System.out.println((int)(Math.random()*5)); //0 ~ 4까지 정수
        System.out.println((int)(Math.random()*10)); //0 ~ 9까지 정수
        System.out.println((int)(Math.random()*10)); // 0 ~ 99까지 정수
        System.out.println((int)(Math.random()*10)+1); // 1 ~ 100까지의 정수
    }
}
