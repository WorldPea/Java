package tcp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class test_client {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1",5555);
		
		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		//InputStreamReader isr = new InputStreamReader(System.in); 
		//BufferedReader br = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);
		String info;
		while(true){
			info = sc.nextLine();
			System.out.println("client: "+ info);
			dos.writeUTF(info);
			if(info.equals("bye")){
				break;
			}
			info = dis.readUTF();
			System.out.println("server: " + info);
			if(info.equals("bye")){
				break;
			}
		}
	}
}
