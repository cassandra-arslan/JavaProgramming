package StudyHardGroupTasks;

public class num1To100_NoForLoop {
    public static void main(String[] args) {
        int num = 0;
       while(num<100){
            num++;
            System.out.print(num+" ");
        }
        System.out.println();

        int a='a' / 'a';
        String str="Ilovemymom";
        while(a <= str.length()*str.length()){
            System.out.print(a + " ");
            a++;
        }
    }
    public static int sumOfNumbers(int num){
        String str = num+"";
        int result = 0;
        for(String each: str.split("")){
            result += Integer.parseInt(each);
        }
        return result;
    }
}
