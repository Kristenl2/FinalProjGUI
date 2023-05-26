import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class pomodoro extends JFrame implements ActionListener {
    private JButton start;
    private JButton reset;
    private JLabel time_label;
    private JLabel Title;
    private int sessiontime = 1500;
    private int elapsedtime = sessiontime*1000;
    private int hour = elapsedtime/3600000;
    private int min = (elapsedtime/600000) % 60;
    private int sec = elapsedtime/1000 % 60;
    boolean startClicked = false;
    String hour_string = String.format("%02d", hour);
    String min_string = String.format("%02d", min);
    String sec_string = String.format("%02d", sec);

    public pomodoro(){
        this.setSize(420, 420);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.Title = new JLabel("Pomodoro Timer");
        setBounds(120, 50, 250, 100);
        this.Title.setFont(new Font("Sans-serif", Font.BOLD, 18));
        this.add(this.Title);

        this.start = new JButton("Start");
        this.reset = new JButton("Reset");
        this.start.setBounds(100, 200, 100, 50);
        this.reset.setBounds(200, 200, 100, 50);
        this.start.addActionListener(this);
        this.reset.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

    }

}
