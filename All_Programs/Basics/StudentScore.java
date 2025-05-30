import java.util.*;
public class StudentScore{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the student Score: ");
        double score =sc.nextDouble();
        StudentScore obj=new StudentScore();
        String result= obj.CheckStudentScore(score);
        System.out.println(result);
    }

    public String CheckStudentScore(double score){
        return ((score>=50 && score<=80)? "Moderate" : (score<50? "Low" : "High"));
    }
}