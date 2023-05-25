import javax.swing.*;
import java.awt.*;

public class display extends JFrame{
    private JButton pomodoroButton;
    private JButton shortBreakButton;
    private JButton longBreakButton;
    private JButton button4;
    private JPanel Top;
    private JPanel Time;
    private JPanel Start;

    public display(){
        super("Pomodoro");
        setup();
    }

    private void setup(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,320);
        frame.setLocation(600,300);
        frame.setVisible(true);

        pomodoroButton = new JButton("ypp");
        pomodoroButton.setVisible(true);
        Top.add(pomodoroButton);
        Top.add(shortBreakButton);
        Top.add(longBreakButton);

        add(Top, BorderLayout.NORTH);
    }
}
