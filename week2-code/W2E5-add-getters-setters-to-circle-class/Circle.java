public class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle(){
        this(0, 0, 0);
    }

    public Circle(int x, int y, double radius){
        setX(x);
        setY(y);
        setRadius(radius); //TODO: You need to update this line too
    }

    //TODO: Add your code here
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public double getRadius() {
        return this.radius;
    }

    public int getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return (int)area;
    }
}
