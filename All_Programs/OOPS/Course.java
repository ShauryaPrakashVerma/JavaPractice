import java.util.*;
public class Course
{
    static int maxCapacity;

    String courseName;
    int enrolledStudents;
    int capacity;

    static
    {
        maxCapacity = 0;
    }

    Course(String courseName, int enrolledStudents)
    {
        this.courseName=courseName;
        this.enrolledStudents=enrolledStudents;
    }

    Course(String courseName)
    {
        this(courseName , 0);
    }

    static void setMaxCapacity(int capacity)
    {
        maxCapacity = capacity;
        System.out.println("Maximum capacity is "+capacity);
    }

    public void enrollStudent(String studentName)
    {
        if (this.enrolledStudents < maxCapacity)
        {
            this.enrolledStudents++;
            System.out.println(studentName +" is successfully enrolled in course "+ this.courseName);
        }
        else
        {
            System.out.println("Sorry , The seats are unavailable.");
        }
    }

    public void unenrollStudent(String studentName)
    {
        if (this.enrolledStudents>0)
        {
            this.enrolledStudents--;
            System.out.println("Successfully unenrolled "+studentName+" from course "+this.courseName);
        }
        else
        {
            System.out.println("Already unenrolled "+studentName+" from course "+this.courseName);
        }
    }

    public static void main(String...args)
    {
        Course newCourse= new Course("Web_Development");
        Scanner sc=new Scanner(System.in);
        System.out.println("Max Capacity of students :");
        Course.setMaxCapacity(sc.nextInt());
        newCourse.enrollStudent("Saurabh");
        newCourse.unenrollStudent("Shaurya");

        
    }
}