package ru.vaszol;

import ru.vaszol.frame.ClientFrame;
import ru.vaszol.logic.Client;

import javax.swing.*;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * Created by vas on 13.04.2015.
 */
public class ClientTest {
    public static void main(String[] args) throws UnknownHostException, SocketException {

        Client client = new Client();
        System.out.println(client);

        ClientFrame cf = new ClientFrame(client);
        cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cf.setVisible(true);
    }
}
