package javatest;

class Point {
	private int xPos;
	private int yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	@Override
	public boolean equals(Object obj) {
		if( this.xPos == ((Point)obj).xPos && this.yPos == ((Point)obj).yPos)
			return true;
		else 
			return false;
	}
}
class Rectangle {
	private Point upperLeft; //좌측 상단 좌표
	private Point lowerRight; //우측 하단 좌표
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1,y1);
		lowerRight = new Point(x2, y2);
	}
	@Override
	public boolean equals(Object obj) {
	//	System.out.println(upperLeft + " " + ((Rectangle)obj).upperLeft);
	//	System.out.println(upperLeft.equals(((Rectangle)obj).upperLeft) + " " + lowerRight.equals(((Rectangle)obj).lowerRight));
		if ( upperLeft.equals(((Rectangle)obj).upperLeft) && lowerRight.equals(((Rectangle)obj).lowerRight))
			return true;
		else
			return false;
	}
}
public class Q19_1 {
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,3);
		Point p3 = new Point(1,2);
		
		Rectangle t1 = new Rectangle(1, 2, 3, 4);
		Rectangle t2 = new Rectangle(2, 3, 4, 5);
		Rectangle t3 = new Rectangle(1, 2, 3, 4);
		
		if ( p1.equals(p2)) {
			System.out.println("p1과 p2 내용이 동일하다.");
		}
		else
			System.out.println("p1과 p2 내용 다르다.");
		
		if ( p1.equals(p3)) {
			System.out.println("p1과 p3 내용이 동일하다.");
		}
		else
			System.out.println("p1과 p3 내용 다르다.");	
		
		
		if ( t1.equals(t2)) {
			System.out.println("t1과 t2 내용이 동일하다.");
		}
		else
			System.out.println("t1과 t2 내용 다르다.");
		
		if ( t1.equals(t3)) {
			System.out.println("t1과 t3 내용이 동일하다.");
		}
		else
			System.out.println("t1과 t3 내용 다르다.");	
	}
}
