package day20_Arrays;
public class DinnerTask2_ClassMates {
    public static void main(String[] args) {
        String[] classMates = {"Aliya Gazizova","Yuliya Shea","Allison Camizci","Farangez Hikmatova","Elena Baidalo",
                "Sinem Kaya","Madina Ramazanova","Nesibe Sabanci","Magdalena Gruszka", "Hulya Keles"};

        String result = "";
        for(String each : classMates){
            for(int i= each.length()-1; i>=0; i--){
                result = ""+each.charAt(i);
                System.out.print(result);
            }
            System.out.println();
        }
    }
}
/*2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
        			*/
