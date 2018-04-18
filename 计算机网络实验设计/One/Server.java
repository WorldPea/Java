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
			System.out.println("����������ɹ�");
			Socket s = null;
			while(true){
				s = ss.accept();
				Thread server = new Thread(new ServerThread(s));
				server.start();
				iCount++;
				System.out.println("��ǰ������Ϊ��" + iCount);
				
			}
		}catch(Exception e){
			System.out.println("����ʧ�ܣ�"+e.getMessage());
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
		System.out.println("�ͻ��˶����ӳɹ�");
		/*������*/
		dinput = new DataInputStream(s.getInputStream());
		/*�����*/
		doutput = new DataOutputStream(s.getOutputStream());
		/*
		 ����¼��
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
				/*���ͻ��˴�������Ϣת��*/
				client_say = dinput.readUTF();
				if(client_say.equals("bye")){
					System.out.println("�ͻ���˵�ݰ�!");
					break;
				}else{
					change = client_say.toUpperCase();
					System.out.println(client_say);
					doutput.writeUTF(change);
					System.out.println("server: ת����дΪ->" + change);
					doutput.flush();
				}
			}
			/*doutput.close();
			dinput.close();
			s.close();*/
		}catch(Exception e){
			System.out.println("���ӶϿ���"+e.getMessage());
		}
	
	}

}