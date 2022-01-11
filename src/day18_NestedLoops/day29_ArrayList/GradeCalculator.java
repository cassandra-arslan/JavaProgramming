package day18_NestedLoops.day29_ArrayList;
import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores);
        gradeOfA.removeIf(p-> !(p>=90&&p<=100));
        System.out.println(gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores);
        gradeOfB.removeIf(p-> !(p>=80&&p<90));
        System.out.println(gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores);
        gradeOfC.removeIf(p-> !(p>=70&&p<80));
        System.out.println(gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores);
        gradeOfD.removeIf(p-> !(p>=60&&p<70));
        System.out.println(gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores);
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println(gradeOfF);

        System.out.println("Total Number of A = " + gradeOfA.size());
        System.out.println("Total Number of B = " + gradeOfB.size());
        System.out.println("Total Number of C = " + gradeOfC.size());
        System.out.println("Total Number of D = " + gradeOfD.size());
        System.out.println("Total Number of F = " + gradeOfF.size());

    }

}
