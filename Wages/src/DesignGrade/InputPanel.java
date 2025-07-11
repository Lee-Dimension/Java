package DesignGrade;

import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel {
    public InputPanel() {
        setBackground(Colors.VIOLET);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        //패널제목(박스 위)
        JLabel inputLabel = new JLabel("입력", SwingConstants.CENTER);
        inputLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        inputLabel.setOpaque(true);
        inputLabel.setBackground(Colors.GREEN);
        inputLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        inputLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        add(inputLabel);
        add(Box.createVerticalStrut(10));
        
        //이름, 성적 기입하는 곳(박스 중간)
        JPanel inMiddle = new JPanel(new GridLayout(5, 2, 10, 10));
        inMiddle.setBackground(Colors.VIOLET);

        JTextField nameField = new JTextField();
        JTextField stuIdField = new JTextField();
        JTextField korField = new JTextField();
        JTextField engField = new JTextField();
        JTextField matField = new JTextField();

        inMiddle.add(new JLabel("이름"));
        inMiddle.add(nameField);
        inMiddle.add(new JLabel("학번"));
        inMiddle.add(stuIdField);
        inMiddle.add(new JLabel("국어점수"));
        inMiddle.add(korField);
        inMiddle.add(new JLabel("영어점수"));
        inMiddle.add(engField);
        inMiddle.add(new JLabel("수학점수"));
        inMiddle.add(matField);

        add(inMiddle);
        //저장버튼(박스 아래)
        JButton saveBtn = new JButton("저장");
        saveBtn.setBackground(Colors.BLUE);
        saveBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(10));
        add(saveBtn);

        // 저장 버튼 이벤트 나중에 예외처리하기
        saveBtn.addActionListener(e -> {
            String name = nameField.getText();
            String stuId = stuIdField.getText();
            int kor = Integer.parseInt(korField.getText());
            int eng = Integer.parseInt(engField.getText());
            int mat = Integer.parseInt(matField.getText());
            StudentManager.addStudent(new Student(name, stuId, kor, eng, mat));
            //파일로 저장
            FileManager.saveFile(StudentManager.getStudents());
            //알림
            JOptionPane.showMessageDialog(this, "저장되었습니다.");
            // 입력값 클리어
            nameField.setText(""); korField.setText(""); engField.setText(""); matField.setText("");
        });
    }
}
