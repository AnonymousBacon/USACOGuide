import java.io.*;
import java.util.*;

public class measurement {
//	static Scanner in;
	static BufferedReader in;
	static PrintWriter out;
	static int n, b, e, m, output, day[], adjust[];
	static String[]names;
	static boolean[]maxes, maxes1;
	
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
		
		maxes = new boolean[3];
		maxes1 = new boolean[3];
		
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
			
			int max = Math.max(Math.max(b, e), m);
			
			for (int a = 0; a < 3; a++) {
				if (b == max) {
					maxes[0] = true;
				}
				else {
					maxes[0] = false;
				}
				if (e == max) {
					maxes[1] = true;
				}
				else {
					maxes[1] = false;
				}
				if (m == max) {
					maxes[2] = true;
				}
				else {
					maxes[2] = false;
				}
			}
			
			if (!Arrays.equals(maxes1, maxes)) {
				output++;
			}
			
			maxes1[0] = maxes[0];
			maxes1[1] = maxes[1];
			maxes1[2] = maxes[2];
			
		}
		
		out.println(output);
	}
}