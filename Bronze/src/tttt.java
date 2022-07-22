import java.io.*;
import java.util.*;

public class tttt {
//	static Scanner in;
	static BufferedReader in;
	static PrintWriter out;
	static String[] one, two, three;
	static int count1, count2;
	
	public static void main(String[]args) throws IOException {
//		in = new Scanner(System.in);
		in = new BufferedReader(new FileReader("tttt.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("tttt.out")));
		
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	static void init() throws IOException {
		one = new String[3];
		two = new String[3];
		three = new String[3];
		String st = in.readLine();
		one[0] = st.charAt(0)+"";
		one[1] = st.charAt(1)+"";
		one[2] = st.charAt(2)+"";
		st = in.readLine();
		two[0] = st.charAt(0)+"";
		two[1] = st.charAt(1)+"";
		two[2] = st.charAt(2)+"";
		st = in.readLine();
		three[0] = st.charAt(0)+"";
		three[1] = st.charAt(1)+"";
		three[2] = st.charAt(2)+"";
	}
	
	static void solve() {
		if (one[0].equals(one[1]) && one[1].equals(one[2])) {
			count1++;
		}
		if (two[0].equals(two[1]) && two[1].equals(two[2])) {
			count1++;
		}
		if (three[0].equals(three[1]) && three[1].equals(three[2])) {
			count1++;
		}
		
		if (one[0].equals(two[1]) && two[1].equals(three[2])) {
			count1++;
		}
		if (one[2].equals(two[1]) && two[1].equals(three[0])) {
			count1++;
		}
		
		
		if (one[0].equals(one[1]) || one[0].equals(one[2]) || one[1].equals(one[2])) {
			if (!(one[0].equals(one[1]) && one[1].equals(one[2]))) {
				count2++;
			}
		}
		if (two[0].equals(two[1]) || two[0].equals(two[2]) || two[1].equals(two[2])) {
			if (!(two[0].equals(two[1]) && two[1].equals(two[2]))) {
				count2++;
			}
		}
		if (three[0].equals(three[1]) || three[0].equals(three[2]) || three[1].equals(three[2])) {
			if (!(three[0].equals(three[1]) && three[1].equals(three[2]))) {
				count2++;
			}
		}
		
		if (one[0].equals(two[1]) || one[0].equals(three[2]) || two[1].equals(three[2])) {
			if (!(one[0].equals(two[1]) && two[1].equals(three[2]))) {
				count2++;
			}
		}
		if (one[2].equals(two[1]) || one[2].equals(three[0]) || two[1].equals(three[0])) {
			if (!(one[2].equals(two[1]) && two[1].equals(three[0]))) {
				count2++;
			}
		}
		
		out.println(count1);
		out.println(count2);
	}
}