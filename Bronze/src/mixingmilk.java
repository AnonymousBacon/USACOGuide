import java.io.*;
import java.util.*;

public class mixingmilk {
//	static Scanner in;
	static BufferedReader in;
	static PrintWriter out;
	static int m1, m2, m3, c1, c2, c3;
	
	public static void main(String[]args) throws IOException {
//		in = new Scanner(new File(".in"));
		in = new BufferedReader(new FileReader(".in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter(".out")));
		
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		StringTokenizer st = new StringTokenizer(in.readLine());
		m1 = Integer.parseInt(st.nextToken());
		c1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(in.readLine());
		m2 = Integer.parseInt(st.nextToken());
		c2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(in.readLine());
		m3 = Integer.parseInt(st.nextToken());
		c3 = Integer.parseInt(st.nextToken());
	}
	
	static void solve() {
		
	}
}