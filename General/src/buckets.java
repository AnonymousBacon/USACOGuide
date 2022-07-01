import java.io.*;
import java.util.*;

public class buckets {
	public static void main(String[]args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("buckets.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("buckets.System.out")));
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0, x3 = 0, y3 = 0;
		boolean keepgoing = true;
		
		for (int i = 0; i < 10 && keepgoing; i++) {
			String[]st = in.readLine().split("");
			for (int a = 0; a < 10; a++) {
				if (x1 != 0 && x2 != 0 && y1 != 0 && y2 != 0) {
					keepgoing = false;
					break;
				}
				String str = st[a];
				if (str.equals("B")) {
					x1 = i; y1 = a;
				}
				if (str.equals("L")) {
					x2 = i; y2 = a;
				}
				if (str.equals("R")) {
					x3 = i; y3 = a;
				}
			}
		}
		
		if (x1 == x2 && x2 == x3 && x1<x3 && x2>x3) {
			System.out.println(y2-y1+1);
		}
		else if (y1 == y2 && y2 == y3 && y1<y3 && y2>y3) {
			System.out.println(x2-x1+1);
		}
		else {
			System.out.println(Math.abs(x2-x1)+Math.abs(y2-y1)-1);
		}
		in.close();
		out.close();
	}
}