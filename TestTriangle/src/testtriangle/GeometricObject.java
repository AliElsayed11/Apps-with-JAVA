package testtriangle;
public abstract class GeometricObject {
private String color ;
private boolean filled;
private java.util.Date date_Created;
public GeometricObject() {      /**Default construct*/
date_Created = new java.util.Date();
}
public GeometricObject(String color, boolean filled) {        /**Construct a geometric object*/
date_Created = new java.util.Date();
this.color = color;
this.filled = filled;   
}
public String getColor() {
return color;
}
public void setColor(String color) {
this.color = color;
}
public boolean isFilled() {
return filled;
}
public void setFilled(boolean filled) {
this.filled = filled;
}
 public abstract double getArea();
 public abstract double getPerimeter();
public java.util.Date getDateCreated() {
return date_Created;
}
public String toString() {
return "Created on " + date_Created + "\n color: " + color + " and filled ";}}