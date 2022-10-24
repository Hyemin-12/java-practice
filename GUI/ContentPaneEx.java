package GUI;
import javax.swing.*;

import java.awt.*;

public class ContentPaneEx extends JFrame {
    ContentPaneEx() {
        setTitle("제목표시줄 설정"); // 프레임의 타이틀 달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료와 동시에 프로그램 종료

        Container contentPane = getContentPane(); // 컨텐트팬 알아내기 -> 내가 사용할 도화지 선택하기
        contentPane.setBackground(Color.green); // 컨텐트팬 배경색 설정 -> 도화지 색상 설정
        contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 배치 관리자 설정 -> 객체 정렬 설정

        // 배치관리자 달기
        contentPane.add(new JButton("OK")); // 컨텐트팬에 버튼 삽입 -> 도화지에 버튼 부착

        // 프레임에 대한 옵션
        setSize(300, 150); // 프레임 크기 300x150 설정
        setVisible(true); // 화면에 프레임 출력
    } // end of ContentPaneEx 생성자

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}