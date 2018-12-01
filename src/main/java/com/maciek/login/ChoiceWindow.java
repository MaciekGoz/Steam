package com.maciek.login;

import javax.swing.*;
import java.awt.*;

public class ChoiceWindow extends JFrame {

    private JButton loginButton;
    private JButton registerButton;
    private JLabel label;

    public ChoiceWindow() {
        setWindow();

        getContentPane().setBackground(new Color(203,228,239));

        loginButton = new JButton();
        loginButton.setBounds(60,90,460,50);
        loginButton.setText("Login");
        loginButton.setBackground(new Color(68,140,213));
        loginButton.setForeground(Color.white);

        registerButton = new JButton();
        registerButton.setBounds(60, 260, 460,50);
        registerButton.setText("Register");
        registerButton.setBackground(new Color(68,140,213));
        registerButton.setForeground(Color.white);

        label = new JLabel("or");
        label.setBounds(285,180,50,40);
        label.setFont(new Font("Arial", Font.BOLD, 15));

        add(loginButton);
        add(registerButton);
        add(label);

        showWindow();
    }

    private void showWindow() {
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
    }

    private void setWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600,450);
        setTitle("Steam");
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

}
