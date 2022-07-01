import java.io.*;
import java.util.*;

public class blockedbillboard {
	public static void main(String[]args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int xl1 = Integer.valueOf(st.nextToken()), yl1 = Integer.valueOf(st.nextToken()), xl4 = Integer.valueOf(st.nextToken()), yl4 = Integer.valueOf(st.nextToken()), xl2 = xl4, yl2 = yl1, xl3 = xl1, yl3 = yl4;
		st = new StringTokenizer(in.readLine());
		int xf1 = Integer.valueOf(st.nextToken()), yf1 = Integer.valueOf(st.nextToken()), xf4 = Integer.valueOf(st.nextToken()), yf4 = Integer.valueOf(st.nextToken()), xf2 = xf4, yf2 = yf1, xf3 = xf1, yf3 = yf4;

		//case where good b is completely covering bad b
		if (xf3 < xl3 && yf3 < yf3 && xf2 > xl2 && yf2 > yl2) {
			System.out.println("0");
		}
		//case where billboards partially obscure eachother but need to cover whole area of billboard

		//case where good b is completely not covering bad b
		
		//find in between cords for both bad and good billboards
		//find diff between those cords
	}
}