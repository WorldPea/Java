package Test1;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger[][] array = new BigInteger[n][2];
		for(int i=0;i<n;i++){
			array[i][0] = new BigInteger(sc.next());
			array[i][1] = new BigInteger(sc.next());
		}
		for(int i=0;i<n;i++){
			System.out.println("Case "+(i+1)+":");
			BigInteger result = array[i][0].add(array[i][1]);
			System.out.println(array[i][0]+" + "+array[i][1]
					+" = "+result);
			System.out.println();
		}
	}
	public static int Sum(int a){
		int result=0;
		for(int i=1;i<=a;i++){
			result += i;
		}
		return result;
	}
}
