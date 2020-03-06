package week6;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Gui extends JFrame {

    JPanel greetingPanel;
    JPanel greetingPanel1;

    public Gui() {

        this.setSize(new Dimension(500, 500));
        this.setLayout(new BorderLayout());

        addGreetingpanel();
        addGreetingLabel();
        addGreetingPanel1();
        addGreetingButton1();
        addGreetingButton2();
        addGreetingButton3();

        addGreetingTextField();

        addGreetingButton();

    }

    private void addGreetingLabel() {

        JLabel greetingLabel = new JLabel("Enter Greeting");
        greetingPanel.add(greetingLabel);
    }

    private void addGreetingpanel() {

        greetingPanel = new JPanel();
        this.add(greetingPanel, BorderLayout.NORTH);
    }

    private void addGreetingButton() {
        JButton greetingButton = new JButton(" display Greeting ");
        greetingPanel.add(greetingButton);
    }

    private void addGreetingTextField() {
        JTextField greetingField = new JTextField();
        greetingField.setPreferredSize(new Dimension(200, 50));
        greetingPanel.add(greetingField);
    }

    private void addGreetingPanel1() {

        greetingPanel1 = new JPanel();
        this.add(greetingPanel1, BorderLayout.SOUTH);
    }

    private void addGreetingButton1() {
        JButton greetingButton1 = new JButton(" display button1 ");
        greetingPanel1.add(greetingButton1);
    }

    private void addGreetingButton2() {
        JButton greetingButton2 = new JButton(" display button2 ");
        greetingPanel1.add(greetingButton2);
    }

    private void addGreetingButton3() {
        JButton greetingButton3 = new JButton(" display button3 ");
        greetingPanel1.add(greetingButton3);
    }

    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.setVisible(true);
    }

}
