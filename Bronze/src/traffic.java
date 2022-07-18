import java.io.*;
import java.util.*;

public class traffic {
	static Scanner in;
//	static BufferedReader in;
	static PrintWriter out;
	static int n;
	static String[][] lines;
	
	public static void main(String[]args) throws IOException {
		in = new Scanner(System.in);
//		in = new BufferedReader(new FileReader("traffic.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("traffic.out")));
		
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		StringTokenizer st = new StringTokenizer(in.nextLine());
		n = Integer.parseInt(st.nextToken());
		lines = new String[3][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(in.nextLine());
			lines[0][i] = st.nextToken();
			lines[1][i] = st.nextToken();
			lines[2][i] = st.nextToken();
		}
	}
	
	static void solve() {
		
	}
}