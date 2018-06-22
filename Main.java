//import java.util.concurrent.ThreadLocalRandom;

public class Main {


    public static void main(String[] args) {


        printStarts(7);

    }

    private static int  printStarts(int starsToPrint) {

        if (starsToPrint>0) {
            System.out.println(starsToPrint+" stars");
            for (int i=0; i< starsToPrint; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
            printStarts(--starsToPrint);
        }

        return 0;
    }


}


     /*   int x = 0;

        while (true) {

            x = ThreadLocalRandom.current().nextInt(origin:0, bound:100);

            if (x == 20) {

                System.out.println("X found, found: " + x);
                break;

            } else {
                System.out.println("20 not found, found: " + x);
            }

        }*/





    /*    int i = 7;

        for (;i>0;i--) {

            System.out.println(i+" stars");

            int j = 0;
            for (;j<i;j++) {

                System.out.print("*");
            }
            System.out.println();
        }
*/

//        7 stars
//                *******
//
//        1star
//                *






//        printNumbers( 0, 10);
//
//    }
//
//    public static int printNumbers(int cN, int mN) {
//
//        if (cN < mN) {
//
//            System.out.println(cN);
//            return printNumbers(++cN, mN);
//        }
//        System.out.println("Finished");
//        return 0;
//    }



//    }





        //int result = multiplyNumbers(5,5);
        //System.out.println("Result is :" + result);


       /* for (int i = 2; true; i= i+2)
        {
            System.out.println(i);
            break;
            //int j = 0;
        }*/

   // }

   /* private static int multiplyNumbers(int firstNumber, int secondNumber) {
        int temporaryVariable = firstNumber * secondNumber;
        return temporaryVariable;
    }*/




    //public static void main(String[] args) {



    /*  int i = 1;

      for (;i<10;i++) {
          System.out.println(i);
          i++;
      }*/



        /*String month;

        month = args[0];

        switch (month) {
            case "1":
                System.out.println("January");
                break;
            case "2":
                System.out.println("Feb");
                break;
            case "3":
                System.out.println("Ma");
                break;
            case "4":
                System.out.println("Apr");
                break;


            case "5":
                System.out.println("May");
                break;
            case "6":
                System.out.println("June");
                break;
            case "7":
                System.out.println("July");
                break;
            case "8":
                System.out.println("August");
                break;
            case "9":
                System.out.println("September");
                break;
            case "10":
                System.out.println("Oct");
                break;
            case "11":
                System.out.println("Nov");
                break;
            case "12":
                System.out.println("Dec");
                break;

            default: System.out.println("Month not found for a given number: "+ month);

        }*/

        /*int x = 1;
        int y = 2;
        int z;

        z = x;
        x = y;
        y = z;

        System.out.println(x + " "+y);
*/
        /*final char CONSTANT;
        CONSTANT = 'B';
        short val1 = 1;
        int val2 = 2;

        byte value = 1;
        int value2= 129;

        value = (byte)value2;



        //val1 = val2;
        System.out.println('B');
        System.out.println(value);  //funny:  -127 !!

        System.out.println(1 == 2);

        if (1== 2) {
        System.out.println("A");
    }else if (2==2){
            System.out.println("B");
        }
        else if (3==3){
            System.out.println("C");
        }
    else{
            System.out.println("E");
        }*/

//    }

//}
