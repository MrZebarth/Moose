package P2;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		double N=Double.parseDouble(in.readLine());
		double X=Double.parseDouble(in.readLine());
		double T=Double.parseDouble(in.readLine());
		double Y=((N/T)+X)/2;
		System.out.println(Y);
	}

}
