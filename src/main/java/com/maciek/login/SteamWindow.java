package com.maciek.login;

import javax.swing.*;
import java.awt.*;

public class SteamWindow extends JFrame {

    private JButton showShopButton;
    private JButton showLibraryButton;
    private JButton showCommunityButton;
    private JButton showUserButton;

    private JMenuBar menuBar;
    private JMenu steamMenu;
    private JMenu viewMenu;
    private JMenu friendsMenu;
    private JMenu gamesMenu;
    private JMenu helpMenu;

    private String username;





    public SteamWindow() {
        init();
    }

    private void init() {
        setWindow();
        setMenu();

        getContentPane().setBackground(new Color(203,228,239));

        setShowShopButton();
        setShowLibraryButton();
        setShowCommunityButton();
        setShowUserButton();

        showWindow();
    }

    private void setMenu() {
        menuBar = new JMenuBar();
        steamMenu = new JMenu("Steam");
        viewMenu = new JMenu("View");
        friendsMenu = new JMenu("Friends");
        gamesMenu = new JMenu("Games");
        helpMenu = new JMenu("Help");

        menuBar.add(steamMenu);
        menuBar.add(viewMenu);
        menuBar.add(friendsMenu);
        menuBar.add(gamesMenu);
        menuBar.add(helpMenu);

        add(menuBar);
        setJMenuBar(menuBar);
    }

    private void setShowShopButton() {
        showShopButton = new JButton();
        showShopButton.setBounds(30, 30, 260, 50);
        showShopButton.setText("Shop");
        showShopButton.setFont(new Font("Arial",Font.BOLD,15));
        showShopButton.setBackground(new Color(68,140,213));
        showShopButton.setForeground(Color.white);
        add(showShopButton);
    }

    private void setShowLibraryButton() {
        showLibraryButton = new JButton();
        showLibraryButton.setBounds(310, 30, 260, 50);
        showLibraryButton.setText("Library");
        showLibraryButton.setFont(new Font("Arial",Font.BOLD,15));
        showLibraryButton.setBackground(new Color(68,140,213));
        showLibraryButton.setForeground(Color.white);
        add(showLibraryButton);
    }

    private void setShowCommunityButton() {
        showCommunityButton = new JButton();
        showCommunityButton.setBounds(590, 30, 260, 50);
        showCommunityButton.setText("Community");
        showCommunityButton.setFont(new Font("Arial",Font.BOLD,15));
        showCommunityButton.setBackground(new Color(68,140,213));
        showCommunityButton.setForeground(Color.white);
        add(showCommunityButton);
    }

    private void setShowUserButton() {
        showUserButton = new JButton();
        showUserButton.setBounds(870, 30, 260, 50);
        showUserButton.setText(username);
        showUserButton.setFont(new Font("Arial",Font.BOLD,15));
        showUserButton.setBackground(new Color(68,140,213));
        showUserButton.setForeground(Color.white);
        add(showUserButton);
    }

    private void setWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1175,700);
        setTitle("Steam");
    }

    private void showWindow() {
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    public void setUsername(String username) {
        this.username = username;
        showUserButton.setText(username);
    }
}
