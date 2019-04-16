//Name: Ketan Joshi

import java.net.*;
import java.io.*;

public class Server {
		  public static void main(String str[])
		  {
			  try
			  { 
				  ServerSocket se=new ServerSocket(9000);
				  Socket so=se.accept();
				  DataInputStream di=new DataInputStream(so.getInputStream());
				  String msg=(String)di.readUTF();
				  System.out.println(msg);
				  se.close();
			  }
			  catch(Exception e)
			  {
				  System.out.println("Exception is "+e.toString());
			  }
		  }
}
