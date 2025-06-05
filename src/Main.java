import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//        LocalTime timeNow = LocalTime.now();
//        LocalTime timeNow = now.format(timeFormatter);

        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setSize(800, 600);

        JLabel timeLabel = new JLabel("Выберите функцию");
        panel.add(timeLabel);
        timeLabel.setBounds(0, 0, 800, 100);

        JButton timeNowButton = new JButton("Сколько время");
        panel.add(timeNowButton);
        timeNowButton.setBounds(100, 100, 150, 70);
        timeNowButton.setFont(new Font("Arial", Font.PLAIN, 15));
        timeNowButton.addActionListener(e -> {
            LocalTime timeNow = LocalTime.now();
            timeLabel.setText("Время " + timeNow.format(timeFormatter));
        });

        JButton resetButton = new JButton("Сбросить");
        panel.add(resetButton);
        resetButton.setBounds(100, 200, 150, 70);
        resetButton.setFont(new Font("Arial", Font.PLAIN, 15));
        resetButton.addActionListener(e -> {
            timeLabel.setText("Выберите функцию");
        });

        frame.setVisible(true);
    }
}