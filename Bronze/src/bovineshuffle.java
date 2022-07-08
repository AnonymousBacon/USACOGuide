import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bovineshuffle {
	public static void main(String[]args) throws IOException {
//		Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new FileReader("shuffle.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int nums = Integer.valueOf(st.nextToken());
		int[] order = new int[nums];
		String[] id = new String[nums];
		
		st = new StringTokenizer(in.readLine());
		for (int i = 0; i < nums; i++) {
			order[i] = Integer.valueOf(st.nextToken());
		}
		
		st = new StringTokenizer(in.readLine());
		for (int i = 0; i < nums; i++) {
			id[i] = st.nextToken();
		}
		
		for (int i = 0; i < nums; i++) {
			for (int a = i; a < nums; a++) {
				if (order[a] < order[i]) {
					int temp = order[i];
					order[i] = order[a];
					order[a] = temp;

					String tempo = id[i];
					id[i] = id[a];
					id[a] = tempo;
				}
			}
			
		}
		
		for (int a = 0; a < nums; a++) {
			out.println(id[a]);
		}
		
		in.close();
		out.close();
	}
}

