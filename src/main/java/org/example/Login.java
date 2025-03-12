package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel title, cardNumber, pin;
    JTextField insertCardNumber;
    JPasswordField insertPin;
    JButton signIn, clear, signUp;

    Login(){
        super("ATM System");

        ImageIcon card1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image card2 = card1.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT);
        ImageIcon card3 = new ImageIcon(card2);
        JLabel cardimage = new JLabel(card3);
        cardimage.setBounds(318, 10, 100, 100);
        add(cardimage);

        title = new JLabel("WELCOME TO THE ATM SYSTEM");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("AvantGarde", Font.BOLD, 23));
        title.setBounds(185, 125, 450, 40);
        add(title);

        cardNumber = new JLabel("Card No: ");
        cardNumber.setForeground(Color.WHITE);
        cardNumber.setFont(new Font("Ralway", Font.BOLD, 18));
        cardNumber.setBounds(185, 190, 375, 30);
        add(cardNumber);

        pin = new JLabel("PIN: ");
        pin.setForeground(Color.WHITE);
        pin.setFont(new Font("Ralway", Font.BOLD, 18));
        pin.setBounds(185, 250, 375, 30);
        add(pin);

        insertCardNumber = new JTextField(15);
        insertCardNumber.setBounds(318, 190, 230, 30);
        insertCardNumber.setFont(new Font("Arial", Font.BOLD, 14));
        add(insertCardNumber);

        insertPin = new JPasswordField(15);
        insertPin.setBounds(318, 250, 230, 30);
        insertPin.setFont(new Font("Arial", Font.BOLD, 14));
        add(insertPin);

        signIn = new JButton("SIGN IN");
        signIn.setForeground(Color.BLACK);
        signIn.setBounds(250, 305, 100, 30);
        signIn.setFont(new Font("Arial", Font.BOLD, 14));
        signIn.addActionListener(this);
        add(signIn);

        clear = new JButton("CLEAR");
        clear.setForeground(Color.BLACK);
        clear.setBounds(380, 305, 100, 30);
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.addActionListener(this);
        add(clear);

        signUp = new JButton("SIGN UP");
        signUp.setForeground(Color.BLACK);
        signUp.setBounds(250, 355, 230, 30);
        signUp.setFont(new Font("Arial", Font.BOLD, 14));
        signUp.addActionListener(this);
        add(signUp);

        ImageIcon bank1 = new ImageIcon(ClassLoader.getSystemResource("icon/bankbg.jpg"));
        Image bank2 = bank1.getImage().getScaledInstance(736, 582, Image.SCALE_DEFAULT);
        ImageIcon bank3 = new ImageIcon(bank2);
        JLabel bankimage = new JLabel(bank3);
        bankimage.setBounds(0, 0, 736, 552);
        add(bankimage);

        setLayout(null);
        setSize(736, 582);
        setLocation(450, 200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource() == signIn) {
                // insert logic
            } else if (e.getSource() == clear) {
                insertCardNumber.setText("");
                insertPin.setText("");
            } else if (e.getSource() == signUp) {
                // insert logic
            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new Login();

    }
}
