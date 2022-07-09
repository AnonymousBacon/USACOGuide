import java.io.*;
import java.util.*;

public class shell {
	static Scanner in;
	static PrintWriter out;
	static int n, data[][], max;
	static boolean shell[];
	
	public static void main(String[]args) throws IOException {
		in = new Scanner(new File("shell.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	static void init() {
		n = in.nextInt();
		data = new int[n][];
		
		for (int i = 0; i < n; i++) {
			data[i] = new int[] {in.nextInt()-1, in.nextInt()-1, in.nextInt()-1};
		}
		
		max = Integer.MIN_VALUE;
	}
	
	static void solve() {
		
		int score = 0;
		
		for (int i = 0; i < 3; i++) {
			shell = new boolean[3];
			shell[i] = true;
			max = Math.max(max, game(i));
		}
		
		out.println(max);
		
	}
	
	static int game(int num) {
		int score = 0;
		for (int i = 0; i < n; i++) {
			boolean temp = false;
			int a = data[i][0];
			int b = data[i][1];
			int g = data[i][2];
			
			temp = shell[a];
			shell[a] = shell[b];
			shell[b] = temp;
			
			if (shell[g] == true) score++;
		}
		return score;
	}
}