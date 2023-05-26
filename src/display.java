import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class display extends JFrame implements ActionListener{
    private JButton pomodoroButton;
    private JButton shortBreakButton;
    private JButton longBreakButton;
    private JButton button4;
    private JPanel Time;
    private JPanel Start;

    public display(){
        super("Pomodoro");
        setup();
    }

    private void setup(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,320);
        setLocation(600,300);
        setVisible(true);

        JPanel Top = new JPanel();
        Top.add(pomodoroButton);
        Top.add(shortBreakButton);
        Top.add(longBreakButton);

        JPanel Time = new JPanel();
        Time.add();


        pomodoroButton.addActionListener(this);
        shortBreakButton.addActionListener(this);
        longBreakButton.addActionListener(this);

        add(Top, BorderLayout.NORTH);



    }
}
