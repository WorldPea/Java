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
			System.out.println("�ͻ��������ɹ���");
			s = new Socket("127.0.0.1",5555);
			System.out.println("���ӷ���˳ɹ���");
			/*������*/
			DataInputStream dinput = new DataInputStream(s.getInputStream());
			/*�����*/
			DataOutputStream doutput = new DataOutputStream(s.getOutputStream());
			/*����¼��*/
			BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));
			String readline = buffread.readLine();
			while(!readline.equals("bye")){
				doutput.writeUTF(this.name + ": " + readline);
				System.out.println(this.name + ": " + readline);
				doutput.flush();
				System.out.println("server: ת����дΪ->" + dinput.readUTF());
	            readline = buffread.readLine(); // ��ϵͳ��׼�������һ�ַ���
			} // ����ѭ��
			dinput.close();
			doutput.close();
			buffread.close();
			s.close();
		}catch(Exception e){
			System.out.println("����ʧ�ܣ�" + e.getMessage());
		}
		
	}
}
