package StudyHardGroupTasks;

public class IntArrayMinMaxValues {
    public static void main(String[] args) {
        int[] arr1 = {7,-2000,99,26,5};
        System.out.println(returnMinMax(arr1));
    }
    public static String returnMinMax(int[] arr1){
        int min = arr1[0];
        int max = arr1[0];
        for(int i=0; i<arr1.length; i++){
                if(arr1[i]<min){
                    min=arr1[i];
                }else if(arr1[i]>max){
                    max=arr1[i];
                }
            }
        return ("Min value is: "+min+" and max value is: "+max);
    }
}
