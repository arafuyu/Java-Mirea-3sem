package Pract4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFrame extends JFrame{
    private JPanel Panel;
    private JButton button1;
    private JButton button2;
    private JLabel res;
    private JLabel last;
    private JLabel win;
    int x1 = 0, x2 = 0;

    public GUIFrame() {
        setContentPane(Panel);
        setSize(800,500);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                x1++;
                res.setText("Result: " + x1 +" x " + x2);
                if(x1>x2)
                    win.setText("Milan");
                else if(x1 == x2)
                    win.setText("DRAW");
                last.setText("Milan");


            }

        });
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                x2++;
                res.setText("Result: " + x1 +" x " + x2);
                if(x1<x2)
                    win.setText("Madrid");
                else if(x1 == x2)
                    win.setText("DRAW");
                last.setText("Madrid");
            }
        });
    }
    public static void main(String[] args) {
        new GUIFrame();

    }
}