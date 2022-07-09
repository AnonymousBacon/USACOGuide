import java.io.*;
import java.util.*;

public class template {
	static Scanner in;
//	static BufferedReader in;
	static PrintWriter out;
	
	public static void main(String[]args) throws IOException {
		in = new Scanner(System.in);
//		in = new BufferedReader(new FileReader(".in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter(".out")));
		
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		StringTokenizer st = new StringTokenizer(in. nextLine());
	}
	
	static void solve() {
		
	}
}