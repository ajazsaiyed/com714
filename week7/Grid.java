package week7;

import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.Dimension;

import javax.swing.JComboBox;

public class Grid extends JFrame {

    private static final long serialVersionUID = 1L;
    private GridBagConstraints constraints;

    public Grid() {

        this.setSize(500, 500);
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        constraints = new GridBagConstraints();

        addHeadingLabel();
        addNameLabel();
        addTypeLabel();
        addDropdown();
        addtextbox();
        addageLabel();
        addagetextbox();
        addButton();

    }

    private void addHeadingLabel() {

        JLabel headingLabel = new JLabel("Living Things");

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;

        this.add(headingLabel, constraints);

    }

    private void addTypeLabel() {

        JLabel typeJLabel = new JLabel("Type:");

        constraints.gridwidth = 0;
        constraints.gridx = 1;
        constraints.gridy = 1;

        this.add(typeJLabel, constraints);
    }

    private void addDropdown() {

        JComboBox<String> typecombobox = new JComboBox<String>();
        typecombobox.addItem("Human");
        typecombobox.addItem("Plant");
        typecombobox.addItem("Animal");

        constraints.gridwidth = 1;
        constraints.gridx = 1;
        constraints.gridy = 1;
        this.add(typecombobox, constraints);

    }

    private void addNameLabel() {

        JLabel namelabel = new JLabel("Name");

        constraints.gridwidth = 1;
        constraints.gridx = 0;
        constraints.gridy = 1;

        this.add(namelabel, constraints);
    }

    private void addtextbox() {
        JTextField textbox = new JTextField();

        textbox.add(textbox);

        constraints.gridwidth = 1;
        constraints.gridx = 0;
        constraints.gridy = 1;

        this.add(textbox, constraints);

    }

    private void addageLabel() {

        JLabel ageLabel = new JLabel("Age");

        constraints.gridwidth = 1;
        constraints.gridx = 0;
        constraints.gridy = 1;

        this.add(ageLabel, constraints);
    }

    private void addagetextbox() {
        JTextField agetextbox = new JTextField();
        agetextbox.setPreferredSize(new Dimension(200, 50));
        agetextbox.add(agetextbox);

        constraints.gridwidth = 1;
        constraints.gridx = 0;
        constraints.gridy = 1;

        this.add(agetextbox, constraints);

    }

    private void addButton() {
        JButton Button1 = new JButton(" Submit ");
        Button1.add(Button1);

        constraints.gridwidth = 1;
        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(Button1, constraints);

    }

    public static void main(String[] args) {
        Grid grid = new Grid();
        grid.setVisible(true);
    }
}