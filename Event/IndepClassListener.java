package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepClassListener extends JFrame {
    IndepClassListener() {
        setTitle("Action 이벤트 리스너 에제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                // 버튼이 눌리게 되면 ActionEvent 객체가 생성이 되고
                // 그 정보를 getSourse를 통해서 전달
                if (b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");
            }
        });
        c.add(btn);
        setSize(250, 120);
        setVisible(true);
    } // 생성자 작성 완료

    // 내부 클래스로 Action 리스너 작성
//    private class MyActionListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            JButton b = (JButton) e.getSource();
//            // 버튼이 눌리게 되면 ActionEvent 객체가 생성이 되고
//            // 그 정보를 getSourse를 통해서 전달
//            if(b.getText().equals("Action"))
//                b.setText("액션");
//            else
//                b.setText("Action");
//        }
//    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}

// 독립된 클래스로 이벤트 리스너 작성
//class MyActionListener implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JButton b = (JButton) e.getSource();
//        // 버튼이 눌리게 되면 ActionEvent 객체가 생성이 되고
//        // 그 정보를 getSourse를 통해서 전달
//        if(b.getText().equals("Action"))
//            b.setText("액션");
//        else
//            b.setText("Action");
//    }
//}