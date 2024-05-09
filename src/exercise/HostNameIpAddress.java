package exercise;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostNameIpAddress {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress inetLocalHost = InetAddress.getLocalHost();
		
		String ipAddress = inetLocalHost.getHostAddress();
		String hostName = inetLocalHost.getHostName();
		
		System.out.println("IP Address of this machine is: "+ipAddress);
		System.out.println("Device Name of this machine is: "+hostName);

	}

}
