import java.util.*;
import java.io.*;

public class wordprocessor {
	public static void main(String[]args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("word.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("word.out")));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(in.readLine());
		StringBuilder sb = new StringBuilder("");
		int count = 0;
		
		while (st.hasMoreElements()) {
			String next = st.nextToken();

			if (count+next.length() <= k) {
				count+=next.length();
				sb.append(next+" ");
			}
			else {
				out.println(sb.toString().substring(0, sb.length()-1));
				sb.setLength(0);
				count = 1;
				sb.append(next+" ");
			}
			
			if (!st.hasMoreElements()) {
				out.println(next);
			}
		}
		
		in.close();
		out.close();
	}
}
