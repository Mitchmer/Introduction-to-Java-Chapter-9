//Write a main method that creates three RegularPolygon objects, 
//created using RegularPolygon(), using RegularPolygon(6, 4) and RegularPolygon(10, 4, 5.6, 7.8). 
//For each object, display its perimeter and area.
class RegularPolygon {
    private int n;
    private double side;
    private double x = 0;
    private double y = 0;

    RegularPolygon() {
        this(3, 1);
    }
    RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }
    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    int getN() {
        return this.n;
    }
    void setN(int n) {
        this.n = n;
    }
    double getSide() {
        return this.side;
    }
    void setSide(double side) {
        this.side = side;
    }
    double getX() {
        return this.x;
    }
    void setX(double x) {
        this.x = x;
    }
    double getY() {
        return this.y;
    }
    void setY(double y) {
        this.y = y;
    }

    double getArea() {
        return ((this.n * Math.pow(this.side, 2))/(4 * Math.tan(Math.PI / this.n)));
    }

    double getPerimeter() {
        return this.n * this.side;
    }

}

public class Project2 {
    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6,4);
        RegularPolygon poly3 = new RegularPolygon(10,4,5.6,7.8);


        System.out.println(poly1.getPerimeter());
        System.out.println(poly1.getArea());
        System.out.println(poly2.getPerimeter());
        System.out.println(poly2.getArea());
        System.out.println(poly3.getPerimeter());
        System.out.println(poly3.getArea());
    }
}


