package Ïß³Ì;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException  {
        
        MyThread thread1 = new MyThread(0);
        MyThread thread2 = new MyThread(20);
        
        thread1.start();
        thread2.start();
    } 
}
class MyThread extends Thread{
	int i;
	MyThread(int k){
		i = k;
	}
	public void run(){
		while(i<50){
			System.out.println(i);
			i++;
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}