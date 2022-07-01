import java.io.*;
import java.util.*;

public class twotables {
	public static void main(String[]args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int cases = Integer.valueOf(st.nextToken());
		int W = 0, H = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0, w = 0, h = 0;
		int bigx = 0, bigy = 0;
		
		for (int i = 0; i < cases; i++) {
			st = new StringTokenizer(in.readLine());
			W = Integer.valueOf(st.nextToken());
			H = Integer.valueOf(st.nextToken());
			st = new StringTokenizer(in.readLine());
			x1 = Integer.valueOf(st.nextToken());
			y1 = Integer.valueOf(st.nextToken());
			x2 = Integer.valueOf(st.nextToken());
			y2 = Integer.valueOf(st.nextToken());
			st = new StringTokenizer(in.readLine());
			w = Integer.valueOf(st.nextToken());
			h = Integer.valueOf(st.nextToken());
			
			
		}
	}
}
//left bot corner: (x1, y1) compare to (0, 0)
//left top corner: (x1, y2) compare to (0, H)
//right bot corner: (x2, y1) compare to (W, 0)
//right top corner: (x2, y2) compare to (W, H)