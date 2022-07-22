import java.io.*;
import java.util.*;

public class measurement {
//	static Scanner in;
	static BufferedReader in;
	static PrintWriter out;
	static int n, b, e, m, output, day[], adjust[];
	static String[]names;
	
	public static void main(String[]args) throws IOException {
//		in = new Scanner(System.in);
		in = new BufferedReader(new FileReader("measurement.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("measurement.out")));
		
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		n = Integer.parseInt(in.readLine());
		b = 7; e = 7; m = 7;
		
		day = new int[n];
		names = new String[n];
		adjust = new int[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			day[i] = Integer.parseInt(st.nextToken());
			names[i] = st.nextToken();
			adjust[i] = Integer.parseInt(st.nextToken());
		}
	}
	
	static void solve() {
		for (int i = 0; i < n-1; i++) {
			for (int a = i+1; a < n; a++) {
				if (day[a] < day[i]) {
					int temp = day[i];
					day[i] = day[a];
					day[a] = temp;
					
					String tem = names[i];
					names[i] = names[a];
					names[a] = tem;
					
					temp = adjust[i];
					adjust[i] = adjust[a];
					adjust[a] = temp;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (names[i].equals("Bessie")) {
				b += adjust[i];
			}
			else if (names[i].equals("Elsie")) {
				e += adjust[i];
			}
			else if (names[i].equals("Mildred")) {
				m += adjust[i];
			}
			
			if (b > e && b > m) {
				output++;
			}
			else if (e > b && e > m) {
				output++;
			}
			else if (m > b && m > e) {
				output++;
			}
		}
		
		out.println(output);
	}
}