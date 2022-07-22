import java.io.*;
import java.util.*;

public class mowing {
	static Scanner in;
//	static BufferedReader in;
	static PrintWriter out;
	static int n, x, y;
	static  ArrayList<Integer>xcords, ycords, time;
	
	public static void main(String[]args) throws IOException {
		in = new Scanner(System.in);
//		in = new BufferedReader(new FileReader("mowing.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("mowing.out")));
		
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		n = Integer.valueOf(in.nextLine());
		xcords = new ArrayList<Integer>();
		ycords = new ArrayList<Integer>();
		time = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(in.nextLine());
			String s = st.nextToken();
			int duration = Integer.valueOf(st.nextToken());
			
			if (s.equals("N")) {
				for (int a = 0; a < duration; a++, y++) {
					xcords.add(x);
					ycords.add(y);
				}
			}
			if (s.equals("E")) {
				for (int a = 0; a < duration; a++, x++) {
					xcords.add(x);
					ycords.add(y);
				}
			}
			if (s.equals("S")) {
				for (int a = 0; a < duration; a++, y--) {
					xcords.add(x);
					ycords.add(y);
				}
			}
			if (s.equals("W")) {
				for (int a = 0; a < duration; a++, x--) {
					xcords.add(x);
					ycords.add(y);
				}
			}
		}
	}
	
	static void solve() {
		xcords.remove(0);
		ycords.remove(0);
		
		for (int i = 0; i < xcords.size(); i++) {
			time.add(i);
		}
		
		System.out.println(xcords.toString());
		System.out.println(ycords.toString());
		System.out.println(time.toString());
		
		for (int i = 0; i < xcords.size()-1; i++) {
			for (int a = i+1; a < xcords.size(); a++) {
				if (xcords.get(a) < xcords.get(i)) {
					int temp = xcords.get(i);
					xcords.set(i, xcords.get(a));
					xcords.set(a, temp);
					
					temp = ycords.get(i);
					ycords.set(i, ycords.get(a));
					ycords.set(a, temp);
					
					temp = time.get(i);
					time.set(i, time.get(a));
					time.set(a, temp);
				}
			}
		}
		
		int stopindex = 0;
		
		for (int i = 0; i < ycords.size()-1; i++) {
			
			for (int a = i+1; a < xcords.size(); a++) {
				if (xcords.get(a) != xcords.get(i)) {
					stopindex = a;
				}
			}
			
			for (int a = i; a < stopindex-1; a++) {
				for (int b = a+1; b < stopindex; b++) {
					if (ycords.get(b) < ycords.get(a)) {
						int temp = ycords.get(a);
						ycords.set(a, ycords.get(b));
						ycords.set(b, temp);
					}
				}
			}
			
			i = stopindex-1;
		}
		
		System.out.println();
		System.out.println(xcords.toString());
		System.out.println(ycords.toString());
		System.out.println(time.toString());
	}
}