package DesignGrade;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class DeletePanel extends JPanel {
    public DeletePanel() {
        setBackground(Colors.VIOLET);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //패널제목
        JLabel deleteLabel = new JLabel("삭제", SwingConstants.CENTER);
        deleteLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        deleteLabel.setOpaque(true);
        deleteLabel.setBackground(Colors.GREEN);
        deleteLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        deleteLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        add(deleteLabel);
        add(Box.createVerticalStrut(80));

        //학번 라벨과 입력칸
        JPanel delInputName = new JPanel(new GridLayout(1,2,10,10));
        delInputName.setBackground(Colors.VIOLET);
        JLabel delName = new JLabel("학번", SwingConstants.CENTER);
        delInputName.add(delName);
        JTextField delInput = new JTextField(10);
        delInputName.add(delInput);
        add(delInputName);
        add(Box.createVerticalStrut(80));

        //삭제 버튼
        JButton delButton = new JButton("삭제");
        delButton.setBackground(Colors.BLUE);
        delButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(10));
        add(delButton);
        
        //버튼 기능 구현
        delButton.addActionListener(e -> {
            String stuId = delInput.getText();
            boolean found = false;
            Iterator<Student> iter = StudentManager.students.iterator();
            
            while (iter.hasNext()) {
                Student s = iter.next();
                if (s.stuId.equals(stuId)) {
                    iter.remove();
                    //파일로 저장
                    FileManager.saveFile(StudentManager.students);
                    JOptionPane.showMessageDialog(this, "삭제하였습니다.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "해당 이름의 학생이 없습니다.");
            }
            delInput.setText("");
        });
    }
}
