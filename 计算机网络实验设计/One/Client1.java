package One;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client1 {
	public static String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client1 client1 = new Client1("client1");
		client1.Connection();
	}
	Client1(String name){
		this.name = name;
	}
	public void Connection(){
		try{
			//ip��ַ 192.168.43.1
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
			byte[] a = {10,5,6,7,9,4};
			doutput.write(a);
			doutput.flush();
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
