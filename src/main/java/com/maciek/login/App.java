package com.maciek.login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    private static Database database;

    private static ChoiceWindow choiceWindow;
    private static LoginWindow loginWindow;
    private static RegisterWindow registerWindow;
    private static SteamWindow steamWindow;

    public static void main(String[] args) {
        database = new Database();
        choiceWindow = new ChoiceWindow();
        loginWindow = new LoginWindow();
        registerWindow = new RegisterWindow();
        steamWindow = new SteamWindow();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                choiceWindow.setVisible(true);

                choiceWindow.getLoginButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        loginWindow.setVisible(true);
                    }
                });

                choiceWindow.getRegisterButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        registerWindow.setVisible(true);
                    }
                });

                loginWindow.getLoginButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (database.login(loginWindow.getUsernameTextArea().getText(), loginWindow.getPasswordTextArea().getText())) {
                            steamWindow.setUsername(loginWindow.getUsernameTextArea().getText());

                            choiceWindow.setVisible(false);
                            registerWindow.setVisible(false);
                            loginWindow.setVisible(false);
                            steamWindow.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(loginWindow, "Can't login", "Failure",
                                JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

                registerWindow.getRegisterButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (database.register(registerWindow.getUsernameTextArea().getText(), registerWindow.getPasswordTextArea().getText())) {
                            steamWindow.setUsername(registerWindow.getUsernameTextArea().getText());

                            choiceWindow.setVisible(false);
                            registerWindow.setVisible(false);
                            loginWindow.setVisible(false);
                            steamWindow.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(loginWindow, "Can't register this account", "Failure",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });
            }
        });
    }
}
