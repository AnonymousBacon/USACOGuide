import java.util.*;
import java.io.*;

public class teleportation {
	
	static Scanner in;
	static PrintWriter out;
	static int a, b, x, y;
	
	public static void main(String[]args) throws IOException {
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		in = new Scanner(new File ("teleport.in"));
		
		a = in.nextInt();
		b = in.nextInt();
		x = in.nextInt();
		y = in.nextInt();
		
	}
	
	static void solve() throws IOException {
		out = new PrintWriter("teleport.out");
		int outint = Math.min(Math.abs(b-a), Math.min(Math.abs(a-x), Math.abs(a-y)) + Math.min(Math.abs(b-x), Math.abs(b-y)));
		out.println(outint);
	}
}
