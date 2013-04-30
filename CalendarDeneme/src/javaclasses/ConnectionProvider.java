package javaclasses;

import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectionProvider {
	
	private static final String ServerIP = "139.179.103.220"; 
	private static final int portNumber = 9000;
		
	public static HttpURLConnection getUrlConnection(int option ) throws IOException{
		URL url = null;
		if( option == 1)	
			 url = new URL("http://" + ServerIP + ":" + portNumber + "/login");
		else if( option == 2)
			url = new URL("http://" + ServerIP + ":" + portNumber + "/register");
		else if ( option == 3 )
			url = new URL("http://" + ServerIP + ":" + portNumber + "/forgot");
		else if ( option == 4)
			url = new URL("http://" + ServerIP + ":" + portNumber + "/calendar");
		return ( HttpURLConnection) url.openConnection();
   	}//end of doPost

}
