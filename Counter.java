import javax.swing.*;
import java.awt.*;

public class Counter {
    JFrame frame;
    JPanel panel1,panel2;
    JTextField monitor;
    JButton increase,decrease,reset;
    JLabel title;
    int counter=0;

    public Counter(){
        frame=new JFrame();
        frame.setSize(150,200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        title=new JLabel("COUNTER");
        frame.add(title);

        label();
        frame.setVisible(true);
    }
    public void label(){
        monitor=new JTextField(10);
        frame.add(monitor);
        panels();

    }
    public void panels(){
        panel1=new JPanel();
        panel2=new JPanel();
        buttons();
    }
    public void buttons(){
        increase=new JButton("INCREASE");
        decrease=new JButton("DECREASE");
        panel1.add(increase);
        panel1.add(decrease);
        panel1.setLayout(new GridLayout(2,1));
        frame.add(panel1);

        reset=new JButton("RESET");
        panel2.add(reset);
        panel2.setLayout(new GridLayout(2,1));
        frame.add(panel2);
        buttonAction();
    }
    public void buttonAction(){
        increase.addActionListener(e -> {
            ++counter;
            monitor.setText(counter+"");
        });
        decrease.addActionListener(lambda ->{
            if(counter>0)
            {
                --counter;
                monitor.setText(counter+"");
            }

        });
        reset.addActionListener(e -> {
            counter=0;
            monitor.setText(counter+"");
        });

    }
}
