import java.io.*;
import java.math.*;
import java.util.*;


class Result {

    /*
     * Complete the 'calculateGrade' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY students_marks as parameter.
     */
    public static ArrayList<String> fina = new ArrayList<>();
    public static String[] calculateGrade(int[][] students_marks) {
//        String[] fina = new String[students_marks.length];
        for (int i = 0; i < students_marks.length; i++) {
            double sum = 0;
            for (int j = 0; j < students_marks[i].length; j++) {
                sum+=students_marks[i][j];
            }
            double avg = sum/students_marks[i].length;
            if(avg >= 90){
                fina.add("A+");
            }
            else if (avg >= 80 && avg < 90) {
                fina.add("A");
            }
            else if (avg >= 70 && avg < 80) {
                fina.add("B");
            }
            else if (avg >= 60 && avg < 70) {
                fina.add("C");
            } else if (avg >= 50 && avg < 60) {
                fina.add("D");
            } else if (avg < 50) {
                fina.add("F");
            }
        }

        String[] total = new String[fina.size()];
        for(int k =0;k<fina.size();k++){
            total[k] = fina.get(k);
        }
        return total;
    }
}