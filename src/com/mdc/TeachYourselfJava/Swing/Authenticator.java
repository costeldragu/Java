package com.mdc.TeachYourselfJava.Swing;

import javax.swing.*;

/**
 * Created by CaDyMaN on 05.01.2017.
 */
public class Authenticator extends JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4, 15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    Authenticator() {
        super("Authentication");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");
        JLabel commentsLabel = new JLabel("Comments: ");

        JScrollPane scroll = new JScrollPane(comments,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        pane.add(usernameLabel);
        pane.add(username);
        pane.add(passwordLabel);
        pane.add(password);
        pane.add(commentsLabel);
        pane.add(scroll);
        pane.add(ok);
        pane.add(cancel);
        add(pane);
        setVisible(true);
    }

}
