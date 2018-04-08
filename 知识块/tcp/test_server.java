package tcp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class test_server {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(5555);
		Socket s = ss.accept();
		
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String info;
		while(true){
			info = dis.readUTF();
			System.out.println("client: "+info);
			if(info.equals("bye") || info.equals("goodbye")){
				break;
			}
			info = br.readLine();
			dos.writeUTF(info);
			System.out.println("server: "+info);
			if(info.equals("bye") || info.equals("goodbye")){
				break;
			}
		}
	}
	
}
