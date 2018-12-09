package com.maciek.login;

import javax.swing.*;
import java.awt.*;

public class RegisterWindow extends JFrame {

    private JLabel usernameLabel;
    private JLabel passwordLabel;

    private JTextArea usernameTextArea;
    private JTextArea passwordTextArea;

    private JButton registerButton;

    public RegisterWindow() {
        init();
    }

    private void init() {
        setWindow();

        getContentPane().setBackground(new Color(203,228,239));

        setPasswordLabel();
        setPasswordTextArea();
        setRegisterButton();
        setUsernameLabel();
        setUsernameTextArea();

        showWindow();
    }

    private void setUsernameLabel() {
        usernameLabel = new JLabel();
        usernameLabel.setBounds(30, 40, 100, 30);
        usernameLabel.setText("Username:");
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        add(usernameLabel);
    }

    private void setPasswordLabel() {
        passwordLabel = new JLabel();
        passwordLabel.setBounds(30, 120, 100, 30);
        passwordLabel.setText("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 15));
        add(passwordLabel);
    }
    private void setUsernameTextArea() {
        usernameTextArea = new JTextArea();
        usernameTextArea.setBounds(150, 43, 140, 24);
        usernameTextArea.setFont(new Font("Arial", Font.BOLD, 18));
        add(usernameTextArea);
    }
    private void setPasswordTextArea() {
        passwordTextArea = new JTextArea();
        passwordTextArea.setBounds(150, 123, 140, 24);
        passwordTextArea.setFont(new Font("Arial", Font.BOLD, 18));
        add(passwordTextArea);
    }
    private void setRegisterButton() {
        registerButton = new JButton();
        registerButton.setBounds(50, 190, 290, 40);
        registerButton.setText("Register");
        registerButton.setFont(new Font("Arial", Font.BOLD, 15));
        add(registerButton);
    }

    private void showWindow() {
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
    }

    private void setWindow() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400,300);
        setTitle("Register");
    }

    public JTextArea getUsernameTextArea() {
        return usernameTextArea;
    }

    public JTextArea getPasswordTextArea() {
        return passwordTextArea;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }
}


