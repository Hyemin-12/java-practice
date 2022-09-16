package Vector;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
    public static void main(String[] args) {
        // 정수값만 다루는 제네릭 백터 생성
        Vector<Integer> v = new Vector<Integer>();

        v.add(5); // 5 삽입, int 값임에도 자동 박싱 처리
        v.add(4); // 4 삽입
        v.add(-1); // -1 삽입
        // 5 4 -1
        // 4와 -1 사이에 삽입할 경우
        v.add(2, 100); // 두 번째방에 100을 넣겠다

        // Iterator를 이용한 모든 정수 출력하기
        Iterator<Integer> it = v.iterator();
        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }

        // Iterator를 이용하여 모든 정수 더하기
        int sum = 0;
        it = v.iterator(); // Iterator 객체 얻기
        while(it.hasNext()) {
            int n = it.next();
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
