
/**
 * Write a description of class course here.
 *
 * @author (Khemraj Singh Thakuri)
 * @version (1.0)
 */
public class course
{
    // instance variables for Course class
    private String CourseID; 
    private String Course_Name;
    private String Course_leader;
    private int Duration;
    //Creating constructor to initialize the value of CourseID, CourseName and Duration  

    public course(String CourseID, String Course_Name, int Duration){

        this.CourseID = CourseID;
        this.Course_Name = Course_Name;
        this.Course_leader = "";
        this.Duration = Duration;

    }

    // creating get and set method which is used to read and set the values of variables
    public String getcourseid(){

        return CourseID;   
    }

    public String getcoursename(){

        return Course_Name;   
    }

    public String getcourseleader(){

        return Course_leader;   
    }

    public int getduration(){

        return Duration;   
    }

    public void setCourseLeader(String Course_Leader){

        this.Course_leader = Course_Leader;
    }
    //creating methid for displaing the information 
    public void Display(){

        System.out.println("---------------------------------");
        System.out.println("\nDetails of the Course");
        System.out.println("---------------------------------");
        System.out.println("CourseID:" +CourseID);
        System.out.println("Course Name:" +Course_Name);
        System.out.println("Duration:" +Duration);
        if (Course_leader == ""){

        }
        else{
            System.out.println("Course Leader:" +Course_leader);  
            System.out.println("---------------------------------");
        }

    }

}