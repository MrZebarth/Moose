package P3;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));		
		//Read in N and K
		String[] tokens=in.readLine().split(" ");
		int N=Integer.parseInt(tokens[0]);
		int K=Integer.parseInt(tokens[1]);
		tokens=in.readLine().split(" ");
		int[] d=new int[N];
		for (int x=0;x<d.length;x++) {
			d[x]=Integer.parseInt(tokens[x]);
		}
		
		tokens=in.readLine().split(" ");
		//Get the e list
		int[] e=new int[K];
		for (int x=0;x<e.length;x++) {
			e[x]=Integer.parseInt(tokens[x]);
		}
		
		for (int x=0;x<e.length;x++) {
			boolean check=true;
			for (int y=0;y<d.length;y++) {
				if (e[x]==d[y]) {
					check=false;
				}
			}
			if (check==true) {
				System.out.println("Good");
			}else {
				System.out.println("baf");
			}
		}
		
		
	}

}
