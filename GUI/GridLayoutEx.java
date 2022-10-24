package GUI;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
    GridLayoutEx() {
        setTitle("GridLayout 실습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        // 1 * 10 그리드 레이아웃 관리자
        contentPane.setLayout(new GridLayout(3, 3));

        for (int i = 1; i < 10; i++) {
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            // JButton에는 String 값만 들어갈 수 있다.
            // int i 값을 객체 타입의 Interger 값으로 변경하여 String 형태로 캐스팅
            contentPane.add(button);
        }

        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
