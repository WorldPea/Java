package One;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	static int iCount = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ServerSocket ss = new ServerSocket(5555);
			System.out.println("服务端启动成功");
			Socket s = null;
			while(true){
				s = ss.accept();
				Thread server = new Thread(new ServerThread(s));
				server.start();
				iCount++;
				System.out.println("当前连接数为：" + iCount);
				
			}
		}catch(Exception e){
			System.out.println("连接失败："+e.getMessage());
		}
		
	}
}
class ServerThread implements Runnable{
	Socket s;
	DataInputStream dinput;
	DataOutputStream doutput;
	
	public ServerThread(Socket socket) throws Exception{
		super();
		s = socket;
		System.out.println("客户端端连接成功");
		/*输入流*/
		dinput = new DataInputStream(s.getInputStream());
		/*输出流*/
		doutput = new DataOutputStream(s.getOutputStream());
		/*
		 键盘录入
		BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));
		*/
	}
	@Override
	public void run(){
		// TODO Auto-generated method stub
		String client_say;
		String change;
		try{
			while(true){
				/*将客户端传来的消息转换*/
				client_say = dinput.readUTF();
				if(client_say.equals("bye")){
					System.out.println("客户端说拜拜!");
					break;
				}else{
					change = client_say.toUpperCase();
					System.out.println(client_say);
					doutput.writeUTF(change);
					System.out.println("server: 转换大写为->" + change);
					doutput.flush();
				}
			}
			/*doutput.close();
			dinput.close();
			s.close();*/
		}catch(Exception e){
			System.out.println("连接断开："+e.getMessage());
		}
	
	}

}