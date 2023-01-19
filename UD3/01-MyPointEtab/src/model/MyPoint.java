package model;

public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        double dx, dy, d;

        dx = Math.pow(this.x - 0, 2);
        dy = Math.pow(this.y - 0, 2);

        d = Math.sqrt(dx + dy);

        return d;
    }

    public double distance(MyPoint another) {
        double dx, dy, d;

        dx = Math.pow(this.x - another.x, 2);
        dy = Math.pow(this.y - another.y, 2);

        d = Math.sqrt(dx + dy);

        return d;
    }

    public double distance(int x, int y) {
        double dx, dy, d;

        dx = Math.pow(x - 0, 2);
        dy = Math.pow(y - 0, 2);

        d = Math.sqrt(dx + dy);

        return d;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
 
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyPoint other = (MyPoint) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
    
}
