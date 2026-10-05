package part1;

import java.util.Scanner;
public class Assignment6Part1 {

    static Scanner cin = new Scanner(System.in); //scanner initialization

    public static char getUserYes(){ //
        char a;
        do {
            a = cin.next().charAt(0);
            if (a !=  'y' && a!= 'n') {
                System.out.println("Pleas enter only letter y and n !!! Try again!");
            }
        } while (a !=  'y' && a!= 'n');
        return a;
    };

    public static int sidesInput() {
        int a;
        do {
            a = cin.nextInt();
            if (a <= 0) {
                System.out.println("side should be more than 0 !!! Try again!");
            }
        } while (a <= 0);
        return a;
    }

    public static int largestSide(int side1, int side2, int side3) {
        int bigest = 0;
        if (side1 > side2) {
            if (side1 > side3) {
                bigest = side1;
            } else bigest = side3;
        } else if (side2 > side3) {
            bigest = side2;
        } else bigest = side3;
        return bigest;
    }

    public static int shortestSide(int side1, int side2, int side3) {
        int shortest = 0;
        if (side1 < side2) {
            if (side1 < side3) {
                shortest = side1;
            } else shortest = side3;
        } else if (side2 < side3) {
            shortest = side2;
        } else shortest = side3;
        return shortest;
    }

    public static boolean isEquilateral(int side1, int side2, int side3) {
        if (side1 == side2 && side1 == side3 ) {
            return true;
        } else return false;
    }

    public static boolean isIsosceles(int side1, int side2, int side3) {
        if (side1 == side2 || side1 == side3 || side3 == side2) {
            return true;
        } else return false;
    }

    public static boolean isScalene(int side1, int side2, int side3) {
        if (side1 != side2 && side1 != side3 && side2 != side3) {
            return true;
        } else return false;
    }

    public static String triangleInfo(int side1, int side2, int side3){
        int biggestSide = largestSide(side1, side2, side3);
        int smallestSide = shortestSide(side1, side2, side3);
        boolean equilateral = isEquilateral(side1,side2,side3);
        boolean isosceles =  isIsosceles( side1, side2, side3);
        boolean scalene =  isScalene( side1, side2, side3);

        return " Triangle info \n" +
                "Sides: " + side1 + " " + side2 + " " + side3 + " \n" +
                "the biggest side :" + biggestSide + "\n" +
                "the smallest side :" + smallestSide + " \n" +
                "the triangle is" + (equilateral ? "" : " NOT") + " Equilateral " + " \n" +
                "the triangle is" + (isosceles ? "" : " NOT") + " Isosceles " + " \n" +
                "the triangle is" + (scalene ? "" : " NOT") + " Scalene " + " \n";
    }
    static void main(String[] args) {

        int tooBigSide = 0;
        int side1,side2,side3;
        char cont;
        do {
            do {
                System.out.println("One side cannot be larger than the other two! Also, a side cannot be less than zero!");
                System.out.println("Enter sids :");
                side1 = sidesInput();
                side2 = sidesInput();
                side3 = sidesInput();
                if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side2 + side1) {
                    tooBigSide = 0;
                    System.out.print("Impossible sides, try again");
                } else tooBigSide = 1;
            } while (side1 < 0 || side2 < 0 || side3 < 0 || tooBigSide == 0);
            System.out.println(triangleInfo(side1,side2,side3));
            System.out.print("Check another Triangle (y/n)? ");
            cont = getUserYes();
        }while (cont == 'y');

    }
}