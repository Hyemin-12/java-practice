package GUI;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.util.*;

public class ListChangeEx extends JFrame {
    private JTextField tf = new JTextField(10);
    private Vector<String> v = new Vector<String>();
    // 컬렉션 -> 크기가 정해지지 않은 배열
    private JList<String> nameList = new JList<String>(v);

    public ListChangeEx() {
        setTitle("리스트 변경 예제");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane(); // 컨텐트팬 얻기
        c.setLayout(new FlowLayout()); // 배치관리자 설정

        c.add(new JLabel("이름 입력 후 <Enter> 키"));
        c.add(tf);

        v.add("황기태");
        v.add("이재문");

        nameList.setVisibleRowCount(5);
        nameList.setFixedCellWidth(100);

        c.add(new JScrollPane(nameList)); // 스크롤이 있는 패널 추가

        setSize(300, 300);
        setVisible(true);

        // JTextField에 ActionLister 등록. <Enter>키 처리
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JTextField t = (JTextField) e.getSource();

                v.add(t.getText());
                t.setText("");

                nameList.setListData(v);
            }
        });
    }
    public static void main(String[] args) {
        new ListChangeEx();
    }
}