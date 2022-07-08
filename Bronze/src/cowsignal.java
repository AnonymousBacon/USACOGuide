import java.io.*;
import java.util.*;

public class cowsignal {
	public static void main(String[]args) throws IOException {
//		Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new FileReader("cowsignal.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int lines = Integer.valueOf(st.nextToken());
		st.nextToken();
		int times = Integer.valueOf(st.nextToken());

		for (int i = 0; i < lines; i++) {
			st = new StringTokenizer(in.readLine());
			StringBuilder original = new StringBuilder(st.nextToken());
			StringBuilder sb = new StringBuilder("");
			
			for (int a = 0; a < original.length(); a++) {
				for (int b = 0; b < times; b++) {
					sb.append(original.charAt(a));
				}
			}
			for (int b = 0; b < times; b++) {
				out.println(sb.toString());
			}
			
			original.setLength(0);
			sb.setLength(0);
		}
		
		in.close();
		out.close();
		
	}
}
