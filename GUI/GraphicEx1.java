package GUI;

import javax.swing.*;
import java.awt.*;

public class GraphicEx1 extends JFrame {
    private MyPanel panel = new MyPanel();
    public GraphicEx1() {
        setTitle("Graphics 예제1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료와 동시에 프로그램 종료
        setContentPane(panel);
        setSize(250, 220);
        setVisible(true);
    } // JFrame 설정 끝

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.pink);
            g.drawRect(10, 10, 50, 50);
            g.drawRect(50, 50, 50, 50);
            g.setColor(Color.yellow);
            g.drawRect(90, 90, 50, 50);
        } // JPanel 설정 끝
    }

    public static void main(String[] args) {
        new GraphicEx1();
    }
}
