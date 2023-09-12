import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(3, 3));

            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    JPanel panel = new JPanel();
                    if (row == 0 && col == 0) {
                        panel.setBackground(Color.RED);
                    } else if (row == 0 && col == 1) {
                        panel.setBackground(Color.YELLOW);
                    } else if (row == 0 && col == 2) {
                        panel.setBackground(Color.GREEN);
                    } else if (row == 1 && col == 0) {
                        panel.setBackground(Color.RED);
                    } else if (row == 1 && col == 1) {
                        panel.setBackground(Color.BLUE);
                    } else if (row == 1 && col == 2) {
                        panel.setBackground(Color.GREEN);
                    } else if (row == 2 && col == 0) {
                        panel.setBackground(Color.RED);
                    } else if (row == 2 && col == 1) {
                        panel.setBackground(Color.BLACK);
                    } else if (row == 2 && col == 2) {
                        panel.setBackground(Color.ORANGE);
                    }
                    frame.add(panel);
                }
            }

            frame.setSize(300, 300); // 프레임 크기 설정
            frame.setVisible(true); // 프레임 표시
        });
    }
}
