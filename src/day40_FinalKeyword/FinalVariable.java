package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    public FinalVariable(String birthDay){
        this.birthDay = birthDay;
    }
    public static void main(String[] args) {
        final double pi = 3.14;
        //pi = 4.14; final variables cannot be reassigned
        //pi = 5.4

        final String name;
        name = "Java";
        // name = "Wooden Spoon";
        System.out.println(name);
        System.out.println("-------------------------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
        System.out.println(obj.birthDay);



    }
}
