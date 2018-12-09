package com.maciek.login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LoginWindow extends JFrame implements KeyListener {

    private JTextArea usernameTextArea;
    private JTextArea passwordTextArea;

    private JButton loginButton;

    private AbstractAction transferFocus;
    private AbstractAction clickLoginButton;

    public LoginWindow() {
        transferFocus = new AbstractAction () {
            public void actionPerformed ( ActionEvent e ) {
                ( ( Component ) e.getSource () ).transferFocus ();
            }
        };

        clickLoginButton = new AbstractAction () {
            public void actionPerformed ( ActionEvent e ) {
                loginButton.doClick();
            }
        };

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
        JLabel usernameLabel = new JLabel();
        usernameLabel.setBounds(30, 40, 100, 30);
        usernameLabel.setText("Username:");
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        add(usernameLabel);
    }

    private void setPasswordLabel() {
        JLabel passwordLabel = new JLabel();
        passwordLabel.setBounds(30, 120, 100, 30);
        passwordLabel.setText("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 15));
        add(passwordLabel);
    }

    private void setUsernameTextArea() {
        usernameTextArea = new JTextArea();
        usernameTextArea.setBounds(150, 43, 140,24);
        usernameTextArea.setFont(new Font("Arial", Font.BOLD, 18));
        usernameTextArea.getInputMap().put(KeyStroke.getKeyStroke ("TAB"),"transferFocus");
        usernameTextArea.getActionMap().put("transferFocus", transferFocus);
        usernameTextArea.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "clickLoginButton");
        usernameTextArea.getActionMap().put("clickLoginButton", clickLoginButton);
        add(usernameTextArea);
    }

    private void setPasswordTextArea() {
        passwordTextArea = new JTextArea();
        passwordTextArea.setBounds(150, 123, 140, 24);
        passwordTextArea.setFont(new Font("Arial", Font.BOLD, 18));
        passwordTextArea.getInputMap ().put ( KeyStroke.getKeyStroke ( "TAB" ), "transferFocus" );
        passwordTextArea.getActionMap ().put ( "transferFocus", transferFocus );
        passwordTextArea.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "clickLoginButton");
        passwordTextArea.getActionMap().put("clickLoginButton", clickLoginButton);
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
        getRootPane().setDefaultButton(loginButton);
        setSize(400,300);
        addKeyListener(this);
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            loginButton.doClick();
        }
    }
}
