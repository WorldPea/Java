package One;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client2 {
	public static String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client2 client2 = new Client2("client2");
		//Client1 client2 = new Client1("client2");
		client2.Connection();
		//client2.Connection();
	}
	Client2(String name){
		this.name = name;
	}
	public void Connection(){
		try{
			Socket s;
			System.out.println("客户端启动成功！");
			s = new Socket("127.0.0.1",5555);
			System.out.println("连接服务端成功！");
			/*输入流*/
			DataInputStream dinput = new DataInputStream(s.getInputStream());
			/*输出流*/
			DataOutputStream doutput = new DataOutputStream(s.getOutputStream());
			/*键盘录入*/
			BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));
			String readline = buffread.readLine();
			while(!readline.equals("bye")){
				doutput.writeUTF(this.name + ": " + readline);
				System.out.println(this.name + ": " + readline);
				doutput.flush();
				System.out.println("server: 转换大写为->" + dinput.readUTF());
	            readline = buffread.readLine(); // 从系统标准输入读入一字符串
			} // 继续循环
			dinput.close();
			doutput.close();
			buffread.close();
			s.close();
		}catch(Exception e){
			System.out.println("连接失败：" + e.getMessage());
		}
		
	}
}
