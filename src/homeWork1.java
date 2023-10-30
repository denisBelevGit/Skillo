

import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        //Exercise 1
        printName();

        //Exercise 2
        printTrianglePerimeter();

        //Exercise 3
        printTriangleArea();

        //Exercise 4
        printPineTree();

        //Exercise 5.1
        trianglePerimeterInput();

        //Exercise 5.2
        triangleAreaInput();

        //Exercise 6 -I've used Google help
        quadraticEquation();

        //Exercise 7
        timeConverter();

    }

    private static void printName() {
        String firstName = "Denis";
        String middleName = "Ivaylov";
        String lastName = "Belev";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
    }

    private static void printTrianglePerimeter() {
        float a = 4.3F;
        float b = 6.22F;
        float c = 9.92F;

        float perimeter = a + b + c;
        System.out.println("The perimeter of the triangle is:" + " " + perimeter);

    }

    private static void printTriangleArea() {
        //Will calculate the area of a triangle using the formula for area = (he4
        // ight * base)/2
        double base = 64.2;
        double heightBase = 2.33;

        double area = heightBase * base / 2;
        System.out.println("The area is" + " " + area + "cm2");

    }

    private static void printPineTree() {
        String pineCone = ("*");
        System.out.println(" " + " " + " " + " " + pineCone + " " + " " + " " + " ");
        System.out.println(" " + " " + " " + pineCone + pineCone + pineCone + " " + " " + " ");
        System.out.println(" " + " " + pineCone + pineCone + pineCone + pineCone + pineCone + " " + " ");
        System.out.println(" " + pineCone + pineCone + pineCone + pineCone + pineCone + pineCone + pineCone + " ");
        System.out.println(pineCone + pineCone + pineCone + pineCone + pineCone + pineCone + pineCone + pineCone + pineCone);
        System.out.println(" " + " " + " " + " " + pineCone + " " + " " + " " + " ");
    }

    private static void trianglePerimeterInput() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter side a:");
        float a = value.nextFloat();
        System.out.println("Enter side b:");
        float b = value.nextFloat();
        System.out.println("Enter side c:");
        float c = value.nextFloat();
        float perimeter = a + b + c;
        System.out.println("The Perimeter is:" + perimeter);
    }

    private static void triangleAreaInput() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the length of the base:");
        float base = value.nextFloat();
        System.out.println("Enter the length of the height:");
        float height = value.nextFloat();
        float area = (base * height) / 2;

        System.out.println("The area of the triangle is: " + area + "cm2");
    }

    private static void quadraticEquation() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the value for a:");
        float a = value.nextFloat();
        System.out.println("Enter the value for b:");
        float b = value.nextFloat();
        System.out.println("Enter the value for c:");
        float c = value.nextFloat();

        double firstroot, secondroot;

        // determinant (b^2 - 4ac)
        double det = b * b - 4 * a * c;

        // check if determinant is greater than 0
        if (det > 0) {

            // two real and distinct roots
            firstroot = (-b + Math.sqrt(det)) / (2 * a);
            secondroot = (-b - Math.sqrt(det)) / (2 * a);

            System.out.format(
                    "First Root = %.2f and Second Root = %.2f",
                    firstroot, secondroot);
        }

        // check if determinant is equal to 0
        else if (det == 0) {

            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            firstroot =secondroot= -b / (2 * a);

            System.out.format(
                    "First Root = Second Root = %.2f;",
                    firstroot);
        }

        // if determinant is less than zero
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);

            double imaginary = Math.sqrt(-det) / (2 * a);

            System.out.printf("First Root = %.2f+%.2fi",
                    real, imaginary);
            System.out.printf("Second Root = %.2f-%.2fi",
                    real, imaginary);
            System.out.println("             ");
        }
    }



    public static void timeConverter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        long minutes = sc.nextInt();
        long years, minResidueFromYear, days, minResidueFromDays,hours,minResidueFromHour;
        years = minutes / 535600;
        minResidueFromYear = minutes % 535600;
        days = minResidueFromYear / 1440;
        minResidueFromDays= minResidueFromYear % 1440;
        hours = minResidueFromDays / 60;
        minResidueFromHour = minResidueFromDays % 60;

        System.out.print("Given minutes has " + years +"years "+ days +"days " + hours + "hours " + minResidueFromHour + "minutes");

    }
}
