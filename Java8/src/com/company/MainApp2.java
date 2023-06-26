package com.company;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;

public class MainApp2 extends JFrame {
    public JButton button = new JButton("Click!");
    public JTextField input = new JTextField("");
    public JLabel label = new JLabel("Input:");
    public JRadioButton radio1 = new JRadioButton("1");
    public JRadioButton radio2 = new JRadioButton("2");
    public JCheckBox check = new JCheckBox("Check", false);

    MainApp2(){
        super("Example form");
        int width = 300;
        int height = 200;
        int x;
        int y;
        x = 1920/2 - (width /2);
        y = 1080/2 - (height/2);
        this.setBounds(x,y,width,height);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        Font myfont = new Font("Dialog", Font.ITALIC,20);
        label.setFont(myfont);
        label.setForeground(Color.BLUE);
        Border thisBorder =  BorderFactory.createMatteBorder(5,5,5,5,Color.GREEN);
        label.setBorder(thisBorder);
        label.setHorizontalAlignment(JLabel.CENTER);
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        radio1.setSelected(true);
        group.add(radio2);
        container.add(radio1);
        container.add(radio2);
        container.add(check);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setMnemonic(KeyEvent.VK_A);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button pressed \n" ;
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio1 is selected \n" : "Radio2 is selected \n");
            message += "Checkbox " + (check.isSelected()? "checked" : "not checked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
