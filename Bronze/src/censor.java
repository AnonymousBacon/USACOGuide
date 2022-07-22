import java.io.*;
import java.util.*;

public class censor {
//	static Scanner in;
	static BufferedReader in;
	static PrintWriter out;
	static String s, t;
	
	public static void main(String[]args) throws IOException {
//		in = new Scanner(System.in);
		in = new BufferedReader(new FileReader("censor.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("censor.out")));
		
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		s = in.readLine();
		t = in.readLine();
	}
	
	static void solve() {
		StringBuilder sb = new StringBuilder(s);
		while(sb.indexOf(t) != -1) {
			int i = sb.indexOf(t);
			sb.delete(i, i+t.length());
		}
		
		out.println(sb.toString());
	}
}