public class Testing {
//
//    Write a method which takes two numbers as arguments and prints one of:
//
//            "The first number is larger"
//            "The second number is larger"
//            "The numbers are equal"
//    as appropriate.

    //main
    // create a method
    public static void main(String[] args) {

        Integer num = 0;
        System.out.println(num);

//        compareValue(3, 2);
    }

    static void compareValue(int num1, int num2){

        // Take in two number

        //Compare numbers (if else)
        if(num1 > num2){
            // if first number is larger then return print that
            System.out.println("the first number is larger");
        } else if(num2>num1){
            //else if second number is larger that print that
            System.out.println("The second number is larger");
        } else if (num1 == num2){
            // else if numbers are equal print they are equal
            System.out.println("They are equal");
        }




    }




}
