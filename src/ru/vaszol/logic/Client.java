package ru.vaszol.logic;

import java.io.IOException;
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

    public Client() throws IOException {
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

        System.out.println("CanonicalHostName:   " + addr.getCanonicalHostName());
        System.out.println("AnyLocalAddress:     " + addr.isAnyLocalAddress());
        System.out.println("LinkLocalAddress:    " + addr.isLinkLocalAddress());
        System.out.println("LoopbackAddress:     " + addr.isLoopbackAddress());
        System.out.println("MCGlobal:            " + addr.isMCGlobal());
        System.out.println("MCLinkLocal:         " + addr.isMCLinkLocal());
        System.out.println("MCNodeLocal:         " + addr.isMCNodeLocal());
        System.out.println("MCOrgLocal:          " + addr.isMCOrgLocal());
        System.out.println("MCSiteLocal:         " + addr.isMCSiteLocal());
        System.out.println("MulticastAddress:    " + addr.isMulticastAddress());
        System.out.println("Reachable:           " + addr.isReachable(2000));
        System.out.println("SiteLocalAddress:    " + addr.isSiteLocalAddress());
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
