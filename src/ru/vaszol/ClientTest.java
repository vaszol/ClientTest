package ru.vaszol;

import ru.vaszol.frame.ClientFrame;
import ru.vaszol.logic.Client;

import javax.swing.*;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * Created by vas on 13.04.2015.
 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        //создаем экземпляр клиента
        Client client = new Client();
//        String url = "http://localhost:8080/studentsApp2/edit";
        String url = "http://vaszol.ru";
                //печать в консоль информации о клиенте
        System.out.println(client);
        //создаем фрейм и передаем в него клиента
        ClientFrame cf = new ClientFrame(client, url);
        cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cf.setVisible(true);
    }
}
