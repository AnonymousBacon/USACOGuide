import java.io.*;
import java.util.*;

public class blocks {
//	static Scanner in;
	static BufferedReader in;
	static PrintWriter out;
	static int n, a[], b[], c[];
	
	public static void main(String[]args) throws IOException {
//		in = new Scanner(System.in);
		in = new BufferedReader(new FileReader("blocks.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
		
		
		init();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		a = new int[26];
		b = new int[26];
		c = new int[26];
		
		for (int i = 0; i < n; i++) solve();
		
		for (int i = 0; i < c.length; i++) {
			out.println(c[i]);
		}
		
		in.close();
		out.close();
	}
	
	static void solve() throws IOException {
		a = new int[26];
		b = new int[26];
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		
		for (int i = 0; i < s1.length(); i++) {
			a[s1.charAt(i)-'a']++;
		}
		for (int i = 0; i < s2.length(); i++) {
			b[s2.charAt(i)-'a']++;
		}
		for (int i = 0; i < 26; i++) {
			c[i] += Math.max(a[i], b[i]);
		}
	}
}