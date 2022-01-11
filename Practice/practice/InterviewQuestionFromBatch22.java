package practice;

public class InterviewQuestionFromBatch22 {
    public static void main(String[] args) {

        int a = 0;
        a = a++ + ++a - a++ + ++a;
        //  0  +    2 - 2   +   4 = 4
        System.out.println(a);
    }
}
