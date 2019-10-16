package P4;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));		
		//Read in first line
		String[] tokens=in.readLine().split(" ");
		//Split into N, S, Q
		int N=Integer.parseInt(tokens[0]);
		int S=Integer.parseInt(tokens[1]);
		int Q=Integer.parseInt(tokens[2]);
		//Create an array of size N tracking views
		int[] videos=new int[N];
		//Loop Q times
		for (int y=0;y<Q;y++) {
			//Read in Q, split into t, v, x
			tokens=in.readLine().split(" ");
			int t=Integer.parseInt(tokens[0]);
			int v=Integer.parseInt(tokens[1])-1;
			int x=Integer.parseInt(tokens[2]);
				
			//Find video v. If t<s, update x,
			if (videos[v]==0) {
				videos[v]=x;
			}else {
				if (t<=S) {
					videos[v]=videos[v]+x;
				}
			}
		}
		//Print out the value for each V
		for (int counter=0;counter<videos.length;counter++) {
			if (videos[counter]==0) {
				System.out.print("-1 ");
			}else {
				System.out.print(videos[counter]+" ");
			}
		}
		
			
	}

}
