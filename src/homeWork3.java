import java.util.Scanner;

public class homeWork3 {
    public static void main(String args[]) {
//        arithmeticOperations();
//        assignmentOperators();
//        autoOperatorDemo();
//        logicalOperatorDemo();
//        ternaryOperatorDemo();
//        ifStatementExample();
//        nestedIfExample();
//        ifElseExample();
//        ifElseIfExample();
//        switchCaseExample();
//        forLoopExample();
//        forLoopExample2();
//        whileLoopExample();
//        whileLoopExample2();
//        doWhileLoopExample();
//        doWhileLoopExample2();
//        continueExample();
//        breakExample();
//       //Homework exercise #1
//        dayOfTheWeek();
//       //exercise #2*/
//          ageCheck();
//        //exercise #3
//          saleWithDiscount();
//        //exercise #4
//          findLargestNum();
//        //exercise #5
//          vacantion();
//        //exercise #6
//        findInList();
//        //exercise #7
          //reverseList();


    }


    public static void arithmeticOperations() {
        int num1 = 100;
        int num2 = 20;
        System.out.println("num1 + num2: " + (num1 + num2)
        );
        System.out.println("num1 - num2: " + (num1 - num2));
        System.out.println("num1 * num2: " + (num1 * num2)
        );
        System.out.println("num1 / num2: " + (num1 / num2));
        System.out.println("num1 % num2: " + (num1 % num2));
        System.out.println("          ");

    }

    public static void assignmentOperators() {
        int num1 = 10;
        int num2 = 20;
        num2 = num1;
        System.out.println("= Output: " + num2);
        num2 += num1;
        System.out.println("+= Output: " + num2);
        num2 -= num1;
        System.out.println("-= Output: " + num2);
        num2 *= num1;
        System.out.println("*= Output: " + num2);
        num2 /= num1;
        System.out.println("/= Output: " + num2);
        num2 %= num1;
        System.out.println("%= Output: " + num2);
        System.out.println("          ");
    }

    public static void autoOperatorDemo() {
        int num1 = 100;
        int num2 = 200;
        num1++;
        num2--;
        System.out.println("num1++ is: " + num1);
        System.out.println("num2-- is: " + num2);
        System.out.println("          ");
    }

    public static void logicalOperatorDemo() {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("!(b1 && b2): " + !(b1 && b2));
        System.out.println("          ");
    }

    public static void ternaryOperatorDemo() {
        int num1, num2;
        num1 = 25;
        /* num1 is not equal to 10 that's why
         * the second value after colon is assigned
         * to the variable num2
         */
        num2 = (num1 == 10) ? 100 : 200;
        System.out.println("num2: " + num2);
        /* num1 is equal to 25 that's why
         * the first value is assigned
         * to the variable num2
         */
        num2 = (num1 == 25) ? 100 : 200;
        System.out.println("num2: " + num2);
    }

    public static void ifStatementExample() {
        int num = 70;
        if (num < 100) {
            System.out.println("number is less than 100");
        }
    }

    public static void nestedIfExample() {
        int num = 70;
        if (num < 100) {
            System.out.println("number is less than 100");
            if (num > 50) {
                System.out.println("number is greater than 50");
            }
        }
    }

    public static void ifElseExample() {
        int num = 120;
        if (num < 50) {
            System.out.println("num is less than 50");
        } else {
            System.out.println("num is greater than or equal 50");
        }
    }

    public static void ifElseIfExample() {
        int num = 7654;
        if (num < 100 && num >= 1) {
            System.out.println("Its a two digit number");
        } else if (num < 1000 && num >= 100) {
            System.out.println("Its a three digit number");
        } else if (num < 10000 && num >= 1000) {
            System.out.println("Its a four digit number");
        } else {
            System.out.println("number is not between 1 & 99999");
        }
    }

    public static void switchCaseExample() {
        int i = 1;
        switch (i) {
            case 1:
                System.out.println("Case1 ");
                break;
            case 2:
                System.out.println("Case2 ");
                break;
            case 3:
                System.out.println("Case3 ");
                break;
            default:
                System.out.println("Default ");
        }
    }

    public static void forLoopExample() {
        ;
        for (int i = 16; i > 1; i--) {
            System.out.println("The value of i is: " + i);
        }
    }

    public static void forLoopExample2() {
        int arr[] = {53, 6, 3, 33, 746};
//i starts with 0 as array index starts with 0 too
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void whileLoopExample() {
        int i = 15;
        while (i > 3) {
            System.out.println(i);
            i--;
        }
    }

    public static void whileLoopExample2() {
        int arr[] = {74, 6, 44, 753, 2};
//i starts with 0 as array index starts with 0 too
        int i = 0;
        while (i < 5) {
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void doWhileLoopExample() {
        int i = 8;
        do {
            System.out.println(i);
            i--;
        } while (i > 1);
    }

    public static void doWhileLoopExample2() {
        int arr[] = {24, 133, 5, 91, 532, 3};
//i starts with 0 as array index starts with 0
        int i = 0;
        do {
            System.out.println(arr[i]);
            i++;
        } while (i < 3);
    }

    public static void continueExample() {
        for (int j = 0; j <= 9; j++) {
            if (j == 6) {
                continue;
            }
            System.out.print(j + " ");
        }
    }

    public static void breakExample() {
        int var;
        for (var = 201; var >= 8; var--) {
            System.out.println("var: " + var);
            if (var == 190) {
                break;
            }
        }
        System.out.println("Out of for-loop");
    }

    public static void dayOfTheWeek() {
        Scanner value = new Scanner(System.in); //create a scanner obj
        System.out.println("Enter value 1-7:");
        int day = value.nextInt(); // Read User Input
        switch (day) {
            case 1:
                System.out.println(day + "-st Monday");
                break;
            case 2:
                System.out.println(day + "-nd Tuesday");
                break;
            case 3:
                System.out.println(day + "-rd Wednesday");
                break;
            case 4:
                System.out.println(day + " -th Thursday");
                break;
            case 5:
                System.out.println(day + "-th Friday");
                break;
            case 6:
                System.out.println(day + "-th Saturday");
                break;
            case 7:
                System.out.println(day + "-th Sunday");
                break;
            default:
                System.out.println("Please enter 1-7");

        }


    }

    public static void ageCheck() {
        Scanner value = new Scanner(System.in); //create a scanner obj
        System.out.println("Enter your age here:");
        int age = value.nextInt(); // Read User Input
        if (age <= 16) {
            System.out.println("Your age is " + age + ", you're not eligible to work.");
        } else {

            System.out.println("Your age is " + age + ", you're eligible to work.");
        }
    }

    public static void saleWithDiscount() {
        double total, discount, revenueFromSale;
        int unitPrice = 25;
        int quantity = 110;
        // ** We can have user input to test the conditions **
//        Scanner number = new Scanner(System.in);
//        System.out.println("Enter quantity:");
//        int quantity = number.nextInt();
        if (quantity >= 100 && quantity <= 120) {
            total = unitPrice * quantity;
            discount = total * 0.15;
            revenueFromSale = total - discount;
            System.out.println("The revenue from the sale is $" + revenueFromSale + " and the Discount is $" + discount);

        } else if (quantity > 120) {

            total = unitPrice * quantity;
            discount = total * 0.20;
            revenueFromSale = total - discount;
            System.out.println("The revenue from the sale is $" + revenueFromSale + " and the Discount is $" + discount);

        } else {
            total = unitPrice * quantity;
            discount = 0;
            revenueFromSale = total - discount;
            System.out.println("The revenue from the sale is $" + revenueFromSale + " and the Discount is $" + discount);
        }

    }

    public static void findLargestNum() {
        int[] arr = {46, 6743, 85, 747, 634, 255, 500004};
        int largestNumber = arr[0];
        int i;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > largestNumber) largestNumber = arr[i];
        }
        System.out.println("The largest number is: " + largestNumber);
    }

    public static void vacantion() {
        Scanner string = new Scanner(System.in);
        System.out.println("Ready for vacation? Do you wish Mountain or Beach vacation? ");
        String location = string.nextLine();
        boolean matches = location.matches("Mountain"); // Function found online

        if (matches) {
            System.out.println("What is your budget per day?");
            Scanner num = new Scanner(System.in);
            int budget = num.nextInt();
            if (budget >= 30) {
                System.out.println("Mountain outside the country");
            } else {
                System.out.println("Mountain in Bulgaria");
            }
        }
        if (!matches && location.matches("Beach")) {      // IDK it's weird but it works ^.^
            System.out.println("What is your budget per day?");
            Scanner num = new Scanner(System.in);
            int budget = num.nextInt();
            if (budget >= 50) {
                System.out.println("Beach outside the country");
            } else {
                System.out.println("Beach in Bulgaria");
            }

        } else if (!matches) {
            System.out.println("Please enter Mountain or Beach");
        }

    }

    public static void findInList() {
        int[] list = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int num;
        for (int i = 0; i < list.length; i++) {
            num = list[i];
            if (num > 150) {
                break;
            }
            if ((num % 5) == 0) {
                System.out.println(num);
            }
        }
    }


    public static void reverseList() {
        int[] list = {2, 11, 45, 9};
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
    }
}