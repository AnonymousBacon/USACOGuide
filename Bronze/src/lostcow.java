import java.io.*;
import java.util.*;

public class lostcow {
//	static Scanner in;
	static BufferedReader in;
	static PrintWriter out;
	static int x, y, a, b, c, curpos, prevpos, dist;
	
	public static void main(String[]args) throws IOException {
//		in = new Scanner(System.in);
		in = new BufferedReader(new FileReader("lostcow.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("lostcow.out")));
		
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		StringTokenizer st = new StringTokenizer(in.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		curpos = x; prevpos = x;
		a = 1; b = -2; c = 4;
	}
	
	static void solve() {
		while (curpos < y) {
			prevpos = curpos;
			curpos = x + a;
			dist += Math.abs(curpos-prevpos);

			prevpos = curpos;
			curpos = x + b;
			dist += Math.abs(curpos-prevpos);

			prevpos = curpos;
			curpos = x + c;
			dist += Math.abs(curpos-prevpos);

			prevpos = curpos;
			
			if (curpos > y) {
				dist += y-curpos;
			}
			
			a*=2;
			b*=2;
			c*=2;
		}
		out.println(dist);
	}
}