import java.io.*;
import java.util.*;

public class mixingmilk {
//	static Scanner in;
	static BufferedReader in;
	static PrintWriter out;
	static int m1, m2, m3, c1, c2, c3;
	
	public static void main(String[]args) throws IOException {
//		in = new Scanner(System.in);
		in = new BufferedReader(new FileReader("mixmilk.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		StringTokenizer st = new StringTokenizer(in.readLine());
		c1 = Integer.parseInt(st.nextToken());
		m1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(in.readLine());
		c2 = Integer.parseInt(st.nextToken());
		m2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(in.readLine());
		c3 = Integer.parseInt(st.nextToken());
		m3 = Integer.parseInt(st.nextToken());
	}
	
	static void solve() {
		for (int i = 1; i <= 33; i++) {
			int temp = 0;
			if (m2+m1 > c2) {
				temp = m1;
				m1 = (m2+m1)-c2;
				m2 = c2;
			}
			else {
				m2 += m1;
				m1 = 0;
			}
			
			if (m2+m3 > c3) {
				temp = m2;
				m2 = (m2+m3)-c3;
				m3 = c3;
			}
			else {
				m3 += m2;
				m2 = 0;
			}
			
			if (m3+m1 > c1) {
				temp = m3;
				m3 = (m1+m3)-c1;
				m1 = c1;
			}
			else {
				m1 += m3;
				m3 = 0;
			}
		}
		int temp = 0;
		if (m2+m1 > c2) {
			temp = m1;
			m1 = (m2+m1)-c2;
			m2 = c2;
		}
		else {
			m2 += m1;
			m1 = 0;
		}
		out.println(m1);
		out.println(m2);
		out.println(m3);
	}
}