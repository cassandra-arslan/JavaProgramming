package day22_MultiDimensionalArrays;
public class LunchTask3_PrintElementsOfArray {
    public static void main(String[] args) {
        int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };
        for(int[][][][][][][] each7D: arr8D){
            for(int[][][][][][] each6D: each7D){
                for(int[][][][][] each5D :each6D){
                    for(int[][][][] each4D: each5D){
                        for(int[][][] each3D: each4D){
                            for(int[][] each2D: each3D){
                                for(int[] each1D: each2D){
                                    for(int each: each1D){
                                        System.out.println(each);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
/*3. Given the array:
            int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };


        Use for each loop to print each element*/