package P1;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Math.pow(2, 22));
		double N=Double.parseDouble(in.readLine());
		//if no integers
		if (N<=0) {
			System.out.println(0);
		}else if (N%1==0) {
			System.out.println((int)(N-1));
		}else {
			System.out.println((int)(Math.floor(N)));
		}
		in.close();
	}
}
