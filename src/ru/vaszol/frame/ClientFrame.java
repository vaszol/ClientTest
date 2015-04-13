package ru.vaszol.frame;

import ru.vaszol.logic.Client;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by vas on 13.04.2015.
 */
public class ClientFrame extends JFrame
{
    public ClientFrame(Client client, String url) throws IOException {
        // Устанавливаем заголовок окна
        setTitle("Client Frame");
        JPanel panel = new JPanel();
        //Построчное расположение
        panel.setLayout(new FlowLayout());
        //создаем текстовые поля
        JLabel lblName = new JLabel("Имя клиента: "+client.getName());
        JLabel lblIpByte = new JLabel("адрес клиента: "+client.getIp());
        JLabel lblIp = new JLabel("ip клиента: "+client.getIp4());
        //создаем панель для html
        JEditorPane editorPane = new JEditorPane(url);
        editorPane.setEditable(false);

        panel.add(lblName);
        panel.add(lblIpByte);
        panel.add(lblIp);
        panel.add(editorPane);
        add(panel);
        // Устанавливаем размеры окна
        setBounds(100, 100, 500, 500);
    }
}