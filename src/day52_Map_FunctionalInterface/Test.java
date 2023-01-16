package day52_Map_FunctionalInterface;

public class Test {
    public static void main(String[] args) {
        // create a function that can display if a num is odd
        MyFirstFunctionalInterface oddOrEvenNumber = n -> {
            if(n%2==0){
                System.out.println(n + " is even number");
            }else{
                System.out.println(n+" is an odd number");
            }
        };
        oddOrEvenNumber.apply(20);

        // create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol;
        eligibleToBuyAlcohol =age -> {
            if(age>=21){
                System.out.println("A person that is "+age+" years old, is eligible to buy alcohol");
            }else{
                System.out.println(age+" is not old enough to buy alcohol");
            }
        };
        eligibleToBuyAlcohol.apply(34);
        // create a function that can display the cube of a num
        MyFirstFunctionalInterface cubeANum;
        cubeANum = (n) -> {
            System.out.println(n * n * n);
        };
        cubeANum.apply(3);

        //create a function that can check if a num is evenly divisible by 3 and 5
        MyFirstFunctionalInterface divisibleBy3And5 = n ->{
            if(n%3==0&&n%5==0){
                System.out.println(n+" is divisible by 3 and 5");
            }else if(n%3==0){
                System.out.println(n+" is only divisible by 3");
            }else if(n%5==0){
                System.out.println(n+" is only divisible by 5");
            }else{
                System.out.println(n+" is not evenly divisible by either 3 or 5");
            }
        };
        divisibleBy3And5.apply(15);
    }
}
