package com.maciek.login;
import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {

    private JLabel usernameLabel;
    private JLabel passwordLabel;

    private JTextArea usernameTextArea;
    private JTextArea passwordTextArea;

    private JButton loginButton;

    public LoginWindow() {
        init();
    }

    private void init() {
        setWindow();

        Color backgroundColor = new Color(203, 228, 239);
        setBackground(backgroundColor);

        setUsernameLabel();
        setPasswordLabel();

        setUsernameTextArea();
        setPasswordTextArea();

        setLoginButton();

        showWindow();
    }

    @Override
    public void setBackground(Color bgColor) {
        super.setBackground(bgColor);

        getContentPane().setBackground(bgColor);
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
        usernameTextArea.setBounds(150, 43, 140,24);
        usernameTextArea.setFont(new Font("Arial", Font.BOLD, 18));
        add(usernameTextArea);
    }

    private void setPasswordTextArea() {
        passwordTextArea = new JTextArea();
        passwordTextArea.setBounds(150, 123, 140, 24);
        passwordTextArea.setFont(new Font("Arial", Font.BOLD, 18));
        add(passwordTextArea);
    }

    private void setLoginButton() {
        loginButton = new JButton();
        loginButton.setBounds(190, 190, 150, 40);
        loginButton.setText("Log In");
        loginButton.setFont(new Font("Arial", Font.BOLD, 15));
        add(loginButton);
    }

    private void showWindow() {
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
    }

    private void setWindow() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400,300);
        setTitle("Login");
    }


    public JTextArea getUsernameTextArea() {
        return usernameTextArea;
    }

    public JTextArea getPasswordTextArea() {
        return passwordTextArea;
    }

    public JButton getLoginButton() {
        return loginButton;
    }
}
