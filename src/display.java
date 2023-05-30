import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class display extends JFrame implements ActionListener{
    private JPanel top;
    private JButton button4;
    private JPanel time;
    private JButton pomodoroButton;
    private JButton shortBreakButton;
    private JButton longBreakButton;
    private JPanel start;
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
        pomodoro x = new pomodoro();

        add(Top, BorderLayout.NORTH);


    }

    private void setupListeners() {
        pomodoroButton.addActionListener(this);
        shortBreakButton.addActionListener(this);
        longBreakButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

    }
}
