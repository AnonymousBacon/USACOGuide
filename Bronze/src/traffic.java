import java.io.*;
import java.util.*;

public class traffic {
	static Scanner in;
//	static BufferedReader in;
	static PrintWriter out;
	static int n, low, up;
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
		low = 0;
		up = 1000;
	}
	
	static void solve() {
		for (int i = lines.length-1; i >= 0; i++) {
			if (lines[0][i].equals("on")) {
				low -= Integer.parseInt(lines[2][i]);
				up -= Integer.parseInt(lines[2][i]);
			}
			if (lines[0][i].equals("none")) {
				low = Math.max(low, Integer.parseInt(lines[2][i]));
				up = Math.min(up, Integer.parseInt(lines[3][i]));
				
			}
			if (lines[0][i].equals("off")) {
				low += Integer.parseInt(lines[2][i]);
				up += Integer.parseInt(lines[2][i]);
			}
		}
	}
}