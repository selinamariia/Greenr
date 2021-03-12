package TestIP;
import java.io.IOException;
import java.net.InetAddress;


public class TestAzureCloudIP {
	
	public static void main(String[] args) throws IOException
	{
		String ip = "172.31.82.137";
	    InetAddress inet = InetAddress.getByName(ip);
	    System.out.println("Sending Ping Request to " + ip);
	    if (inet.isReachable(5000))
	    {
	        System.out.println(ip+" is up and running");
	    }
	    else
	    {
	    	System.out.println(ip+" is not running, try starting up the server from your Azure Cloud Account");
	    }
	    

	}
	}
