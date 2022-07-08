import java.io.*;
import java.util.*;

public class blist {
	public static void main(String[]args) throws IOException {
//		Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new FileReader("blist.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.valueOf(st.nextToken());
		ArrayList<Integer> nums1 = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();
		ArrayList<Integer> start = new ArrayList<>();
		ArrayList<Integer> stop = new ArrayList<>();
		ArrayList<Integer> all = new ArrayList<>();
		int buckets = 0;
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			for (int a = 0; a < 3; a++) {
				nums1.add(Integer.valueOf(st.nextToken()));
			}
		}
		
		while (nums1.size() > 0) {
			int smallindex = 0;
			for (int i = 0; i < nums1.size(); i+=3) {
				if (nums1.get(i) < nums1.get(smallindex)) {
					smallindex = i;
				}
			}
			nums.add(nums1.get(smallindex));
			all.add(nums1.get(smallindex));
			start.add(nums1.remove(smallindex));
			nums.add(nums1.get(smallindex));
			all.add(nums1.get(smallindex));
			stop.add(nums1.remove(smallindex));
			nums.add(nums1.remove(smallindex));
		}
		
		Collections.sort(all);
		
		for (int i = 0; i < all.size(); i++) {
			int startindex = Collections.binarySearch(start, all.get(i));
			if (startindex > -1) {
				buckets += nums.get(startindex*3+2);
				if (buckets > max) {
					max = buckets;
				}
			}
			int stopindex = Collections.binarySearch(stop, all.get(i));
			if (stopindex > -1) {
				buckets -= nums.get(stopindex*3+2);
			}
		}
		
		out.println(max);
		
		in.close();
		out.close();
	}
}
