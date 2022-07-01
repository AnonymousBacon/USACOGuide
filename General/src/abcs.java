import java.util.*;
import java.io.*;

public class abcs {
	public static void main(String[]args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		ArrayList<Integer> ints = new ArrayList<Integer>();
		int a = 0, b = 0, c = 0, aindex = 0;
		
		while (st.hasMoreTokens()) {
			ints.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(ints);
		
		a = ints.get(0);
		b = ints.get(1);
		c = ints.get(ints.size()-1);
		
		System.out.println(a+" "+b+" "+(c-a-b));
	}
}
