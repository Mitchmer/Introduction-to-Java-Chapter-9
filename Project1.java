//Write a main method that creates two Rectangle objects—one with width 4 and height 40 and the other 
//with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.

class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    Rectangle() {
        this(1, 2);
    }

    double getArea() {
        return this.width * this.height;
    }

    double getPerimeter() {
        return (2 * this.height) + (2 * this.width);
    }
}


public class Project1 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println(rect1.width);
        System.out.println(rect1.height);
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());
        System.out.println(rect2.width);
        System.out.println(rect2.height);
        System.out.println(rect2.getArea());
        System.out.println(rect2.getPerimeter());
    }
}


