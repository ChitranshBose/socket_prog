//Name : Ketan Joshi

import java.io.*;
import java.net.*;
import java.util.*;
public class Client {
	public static void main(String str[])
	 {
		 try
		 {
			Scanner sc=new Scanner(System.in);
			String st;
			Socket so=new Socket("localhost",9000);
			DataOutputStream ds=new DataOutputStream(so.getOutputStream());
			System.out.println("Enter message\n");
			st=sc.nextLine(); 	
			ds.writeUTF(st);
			ds.close();
			sc.close();
			so.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception is "+e.toString());
		 } 
	 }
}
