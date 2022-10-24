package GUI;

import javax.swing.*;
import java.awt.*;

public class LayoutEx extends JFrame{
    LayoutEx() {
        setTitle("배치관리자 실습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

//        //FlowLayout 사용
//        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

        // 레이아웃 관리자 hap = 수평 여백, vgap = 수직 여백

        //BorderLayout 사용
        contentPane.setLayout(new BorderLayout(30, 20));

        contentPane.add(new JButton("add"), BorderLayout.CENTER);
        contentPane.add(new JButton("sub"), BorderLayout.NORTH);
        contentPane.add(new JButton("mul"), BorderLayout.SOUTH);
        contentPane.add(new JButton("div"), BorderLayout.EAST);
        contentPane.add(new JButton("Calculate"), BorderLayout.WEST);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutEx();
    }
}