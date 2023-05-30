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

        this.time_label = new JLabel(hour_string + ":" + min_string + ":" + sec_string);
        this.time_label.setBounds(175,100,100,100);
        this.add(this.time_label);
    }
        Timer timer = new Timer(1000, new ActionListener());
            @Override
            public void actionPerformed(ActionEvent e) {
                if(elapsedtime != 0){
                    elapsedtime = elapsedtime -1000;
                    hour = (elapsedtime/3600000);
                    min = (elapsedtime/60000)%60;
                    sec = (elapsedtime/1000)%60;
                    String hour_string = String.format("%02d", hour);
                    String min_string = String.format("%02d", min);
                    String sec_string = String.format("%02d", sec);

                    time_label.setText(hour_string + ":" + min_string + ":" + sec_string);
                }else{
                    stopTimerInZero();
                }
            }
        }
    public void actionPerformed(ActionEvent e){
    if(e.getSource() == start){
        if(startClicked == false){
            start.setText("STOP");
            startClicked = true;
            timer.start();
        }
        }else{
        start.setText("Start");
        startClicked = false;
        timer.stop();
    }
    }

}
