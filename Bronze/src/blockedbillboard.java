import java.io.*;
import java.util.*;

public class blockedbillboard {
	public static void main(String[]args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		char[][] a = new char[2000][2000];
		int ax1 = Integer.valueOf(st.nextToken())+1000, ay1 = Integer.valueOf(st.nextToken())+1000, ax2 = Integer.valueOf(st.nextToken())+1000, ay2 = Integer.valueOf(st.nextToken())+1000;
		int bx1 = Integer.valueOf(st.nextToken())+1000, by1 = Integer.valueOf(st.nextToken())+1000, bx2 = Integer.valueOf(st.nextToken())+1000, by2 = Integer.valueOf(st.nextToken())+1000;
		
		int ymin = Math.min(Math.min(ay1, ay2), Math.min(by1, by2));
		int ymax = Math.max(Math.max(ay1, ay2), Math.max(by1, by2));
		int xmin = Math.min(Math.min(ax1, ax2), Math.min(bx1, bx2));
		int xmax = Math.max(Math.max(ax1, ax2), Math.max(bx1, bx2));
		
		
	}
}