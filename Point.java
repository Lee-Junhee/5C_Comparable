/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable{
    private double xcor;
    private double ycor;
    
    public int compareTo( Object otherObj){
	Point otherPoint = (Point) otherObj;
	return Integer(Math.pow(xcor, 2) + Math.pow(ycor, 2)).compareTo(
	Integer(Math.pow(otherObj.xcor, 2) + Math.pow(otherObj.ycor, 2)));
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}
