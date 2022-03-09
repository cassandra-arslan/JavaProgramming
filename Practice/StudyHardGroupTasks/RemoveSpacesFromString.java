package StudyHardGroupTasks;

public class RemoveSpacesFromString {
    public static String removeExtraSpaces(String str){
        str=str.trim();
        while(str.contains("  ")){
            str= str.replace("  "," ");
        }
       return str;
    }

    public static void main(String[] args) {
        String exp= " I     heart   Java ";
        System.out.println(removeExtraSpaces(exp));
    }
}
