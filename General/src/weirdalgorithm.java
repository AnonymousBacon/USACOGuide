import java.util.*;
public class weirdalgorithm {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long add = n;
		StringBuilder sb = new StringBuilder(n+" ");
		while (add != 1) {
			if (add % 2 == 0) {
				add = add / 2;
			}
			else {
				add = add*3+1;
			}
			sb.append(add+" ");
		}
		System.out.println(sb.toString());
	}
}