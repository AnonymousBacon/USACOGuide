import java.util.Scanner;

public class whitesheet {
	static long area;
	static point a, b, c;
	static Scanner in;
	
	static void init() {
		in = new Scanner(System.in);
		a = new point(in.nextLong(), in.nextLong(), in.nextLong(), in.nextLong());
		b = new point(in.nextLong(), in.nextLong(), in.nextLong(), in.nextLong());
		c = new point(in.nextLong(), in.nextLong(), in.nextLong(), in.nextLong());
	}
	
	static void solve() {
		area = (a.x2-a.x1) * (a.y2-a.y1);
		long overlap = ol(a, b) + ol(a, c) - ol(a, b, c);
		
		if (overlap < area) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	static long ol(point a, point b) {
		long lx = Math.max(a.x1, b.x1);
		long ly = Math.max(a.y1, b.y1);
		long rx = Math.min(a.x2, b.x2);
		long ry = Math.min(a.y2, b.y2);
		
		return (rx-lx) * (ry-ly);
	}
	
	static long ol(point a, point b, point c) {
		long lx = Math.max(Math.max(a.x1, b.x1), c.x1);
		long ly = Math.max(Math.max(a.y1, b.x1), c.y1);
		long rx = Math.min(Math.min(a.y2, b.y2), c.y2);
		long ry = Math.min(Math.min(a.x2, b.x2), c.x2);
		
		return (rx-lx) * (ry-ly);
	}
	
	static class point {
		
		long x1;
		long y1;
		long x2;
		long y2;
		
		public point(long a, long b, long c, long d){
			x1 = a;
			y1 = b;
			x2 = c;
			y2 = d;
		}
	}
}
