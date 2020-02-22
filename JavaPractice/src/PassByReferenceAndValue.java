public class PassByReferenceAndValue {
 
	public static void swap(Point arg1, Point arg2)
	{
	  Point temp = arg1;
	  arg1 = arg2;
	  arg2 = temp;
	  arg1.x = 100;
	  arg1.y = 100;
	  arg2.x = 200;
	  arg2.y = 200;
	}
	
	public static void main(String [] args)
	{
	  Point pnt1 = new Point();
	  Point pnt2 = new Point();
	  pnt1.x = 100;
	  pnt1.y = 100;
	  pnt2.x = 200;
	  pnt2.y = 200;
	  System.out.println("Point1 X: " + pnt1.x + " Y: " +pnt1.y); 
	  System.out.println("Point2 X: " + pnt2.x + " Y: " +pnt2.y);
	  System.out.println(" ");
	  swap(pnt1,pnt2);
	  System.out.println("Point1 X: " + pnt1.x + " Y:" + pnt1.y); 
	  System.out.println("Point2 X: " + pnt2.x + " Y: " +pnt2.y);  
	}

}


class Point {
   public int x, y;
}