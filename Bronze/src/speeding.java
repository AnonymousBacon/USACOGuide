import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class speeding {
	public static void main(String[]args) throws IOException {
//		Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new FileReader("speeding.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int[] sec1 = new int[100];
		int[] sec2 = new int[100];
		int start = 0;
		int diff = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			int length = Integer.valueOf(st.nextToken());
			int speed = Integer.valueOf(st.nextToken());
			for (int a = start; a < start+length; a++) {
				sec1[a] = speed;
			}
			start += length;
		}
		
		start = 0;
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(in.readLine());
			int length = Integer.valueOf(st.nextToken());
			int speed = Integer.valueOf(st.nextToken());
			for (int a = start; a < start+length; a++) {
				sec2[a] = speed;
			}
			start += length;
		}
		
		for (int i = 0; i < sec1.length; i++) {
			if (sec1[i] > sec2[i]) {
				if (sec1[i] - sec2[i] > diff) {
					diff = sec1[i] - sec2[i];
				}
			}
		}
		
		out.println(diff);
		
		in.close();
		out.close();
//		for (int i = 0; i < sec1.length; i++) {
//			System.out.print(sec1[i]+" ");
//		}
//		
//		System.out.println("    "+diff);
	}
}