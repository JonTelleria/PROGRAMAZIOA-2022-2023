package model;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

  
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);

        if (d1 == d2 && d2 == d3) {
            return "Aldekidea";
        } else if (d1 == d2 || d1 == d3 || d2 == d3) {
            return "Isoszelea";
        }
        return "Eskalenoa";
    }

    @Override
    public String toString() {
        return "Triangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }

    public MyPoint getV1() {
        return v1;
    }

  
    public MyPoint getV2() {
        return v2;
    }

  
    public MyPoint getV3() {
        return v3;
    }

   
    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }

   
    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }

    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }
}
