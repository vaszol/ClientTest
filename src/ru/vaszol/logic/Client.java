package ru.vaszol.logic;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by vas on 13.04.2015.
 */
public class Client {

    private InetAddress addr;
    private String name;
    private byte[] ip;
    private String ip4;
    private String hostAddress;

    public Client() throws UnknownHostException {
        addr = InetAddress.getLocalHost();
        name=addr.getHostName();
        ip = addr.getAddress();
        ip4 =addr.getHostAddress();
        /**
        for (int i=0; i<ip.length; i++){
            if(i>0) ip4+=".";
            ip4+=(ip[i] & 0xff);
        }
        System.out.println(addr.getHostAddress());
        System.out.println(ip4);**/
    }

    public String getIp4() {
        return ip4;
    }

    public byte[] getIp() {
        return ip;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", ip4='" + ip4 + '\'' +
                '}';
    }
}
