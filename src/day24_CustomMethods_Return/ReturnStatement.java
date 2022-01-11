package day24_CustomMethods_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        int number = 0;
        String day = "";
        if (!(number>0&&number<=7)){
            return;}
        day = number==1?"Monday":number==2?"Tuesday":number==3?"Wednesday":number==4?"Thursday":number==5?"Friday":number==6?"Saturday":"Sunday";
        System.out.println(day);
    }
}
