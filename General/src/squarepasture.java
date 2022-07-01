import java.io.*;
import java.util.*;

public class squarepasture {
	public static void main(String[]args) throws IOException {
//		BufferedReader in = new BufferedReader(new FileReader("square.in"));
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
		StringTokenizer st = new StringTokenizer(in.nextLine());
		
		int ax3 = Integer.valueOf(st.nextToken()), ay3 = Integer.valueOf(st.nextToken()), ax2 = Integer.valueOf(st.nextToken()), ay2 = Integer.valueOf(st.nextToken()), ax1 = ax3, ay1 = ay2, ax4 = ax2, ay4 = ay3;
		st = new StringTokenizer(in.nextLine());
		int bx3 = Integer.valueOf(st.nextToken()), by3 = Integer.valueOf(st.nextToken()), bx2 = Integer.valueOf(st.nextToken()), by2 = Integer.valueOf(st.nextToken()), bx1 = bx3, by1 = by2, bx4 = bx2, by4 = by3;
		
		if (ax1 <= bx1 && by1 >= by2) {
			int x = Math.abs(bx4-ax1);
			int y = Math.abs(by4-ay1);
			if (x > y) {
				System.out.println(x*x);
			}
			else {
				System.out.println(y*y);
			}
		}
		else {
			int x = Math.abs(ax4-bx1);
			int y = Math.abs(ay4-by1);
			if (x > y) {
				System.out.println(x*x);
			}
			else {
				System.out.println(y*y);
			}
		}
		
		in.close();
		out.close();
	}
}
