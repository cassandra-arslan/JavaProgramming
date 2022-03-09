package StudyHardGroupTasks;

public class FindSecondMax {
    public static void main(String[] args) {
        int[] arr = {1,2,6,9,11,4};
        System.out.println(secondLargest(arr, arr.length));
    }
    public static int secondLargest(int[] arr, int n){
        int max = 0;
        int secondMax = -1;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[max]){
                    max=i;
                }
        }
        for(int i=0; i<n; i++){
            if(arr[i] != arr[max]){
                if(secondMax ==-1){
                    secondMax = i;
                }else if(arr[i] > arr[secondMax]){
                        secondMax = i;
                }
            }
        }
        return arr[secondMax];
    }
}
