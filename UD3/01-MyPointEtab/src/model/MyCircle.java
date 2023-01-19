package model;

public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle() {

    }

   
    public MyCircle(int x, int y, int radius) {
        this.radius = radius;
        this.center.setXY(x, y);
    }

    
    public MyCircle(MyPoint center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    
    public double distance(MyCircle another) {
        double d;

        d = Math.sqrt((Math.pow(another.center.getX() - this.center.getX(), 2)) + (Math.pow(another.center.getY() - this.center.getY(), 2)));

        return d;
    }

    
    public boolean isInside(MyPoint puntua) {
        boolean barruan = false;
        if (puntua.distance() < radius) {
            barruan = true;
        }

        return barruan;
    }

    
    public double getArea() {
        return radius * radius * Math.PI;
    }

   
    public MyPoint getCenter() {
        return this.center;
    }

  
    public int getCenterX() {
        return this.center.getX();
    }

   
    public int getCenterY() {
        return this.center.getY();
    }

    
    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

   
    public double getRadius() {
        return radius;
    }

    
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }

}
