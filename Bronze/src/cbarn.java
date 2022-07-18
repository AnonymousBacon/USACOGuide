import java.io.*;
import java.util.*;

public class cbarn {
//	static Scanner in;
	static BufferedReader in;
	static PrintWriter out;
	static int[] nums;
	static int sum = 0, n = 0, min = Integer.MAX_VALUE;
	
	public static void main(String[]args) throws IOException {
//		in = new Scanner(System.in);
		in = new BufferedReader(new FileReader("cbarn.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("cbarn.out")));
		
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		StringTokenizer st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		nums = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			nums[i] = Integer.parseInt(st.nextToken());
		}
	}
	
	static void solve() {
		for (int i = 0; i < n; i++) {
			sum = 0;
			int count = 0;
			for (int a = i; a < n; a++, count++) {
				sum += nums[a]*count;
			}
			for (int a = 0; a < i; a++, count++) {
				sum += nums[a]*count;
			}
			if (sum < min) {
				min = sum;
			}
		}
		out.println(min);
	}
}