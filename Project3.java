//(The Location class)

//Write the following method that returns the location of the largest element in a two-dimensional array a:

//public static Location locateLargest(double[][] a)
//The return value is an instance of Location.

//Write a class named Location. The class contains three public data fields row (int), column (int), 
//and maxValue (double). maxValue stores the maximal value in the two-dimensional array. 
//row and column are the row and column indices for maxValue in the array.

//Write a main method that prompts the user to enter a two-dimensional array and displays the 
//location of the largest element in the array. If there is more than one largest element, 
//return the smallest row index and then the smallest column index.

//When you create a new submission, you will notice a template code. 
//Complete the missing parts where you see "Write your code" to complete the assignment.

//Sample Run

//Enter the number of rows and columns of the array: 3 4
//Enter the array:
//23.5 35 2 10
//4.5 3 45 3.5
//35 44 5.5 9.6
//The largest element is 45, located at (1,2)

// fill in the parts where you see "Write your code" to complete the assignment 

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] a = new double[rows][columns];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        Location location = locateLargest(a);
        System.out.println("The largest element is " + location.maxValue + ", located at (" + location.row + "," + location.column + ")");
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location(0,0,a[0][0]);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > location.maxValue) {
                    location.row = i;
                    location.column = j;
                    location.maxValue = a[i][j];
                }
            }
        }

        return location;
    }

}

class Location {
    public int row;
    public int column;
    public double maxValue;

    Location() {
        this(0,0,0);
    }
    Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
}