
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

    public double distance( MyPoint another) {
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

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
