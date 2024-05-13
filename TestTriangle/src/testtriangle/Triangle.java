package testtriangle;
public class Triangle extends GeometricObject implements Comparable<Triangle> {
private double side1 = 1.0;
private double side2 = 1.0;
private double side3 = 1.0;
public Triangle() {
}
public Triangle(double side1, double side2, double side3) 
throws IllegalTriangleException {
if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
throw new IllegalTriangleException("Any two sides added together" + 
" must be greater than the remaining side.  NO side may equal 0!");
}
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}
public double getSideOne() {
return this.side1;
}
public double getSideTwo() {
return this.side2;
}
public double getSideThree() {
return this.side3;
}
public double getArea() {
double half_perimeter = (side1 + side2 + side3)/2;
return Math.sqrt(half_perimeter*(half_perimeter-side1)*(half_perimeter-side2)*(half_perimeter-side3));
}
public double getPerimeter() {
return(side1 + side2 + side3) ;
}
public String toString() {
return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2+ " Side 3 = " + side3; 
}
@Override
public int compareTo(Triangle o) {
if(getArea()> o.getArea()) {
return 1;}
else if(getArea()< o.getArea()) {
return -1;
}
else
return 0;
}}