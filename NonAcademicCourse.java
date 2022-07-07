
/**
 * Write a description of class NonAcademicCourse here.
 *
 * @author (KHEMRAJ SINGH THAKURI)
 * @version (1.0)
 */
public class NonAcademicCourse extends course
{
    // instance variables OF NonAcademicCourse

    private String Instructor_Name;
    private String Start_Date;
    private String Completion_Date;
    private String Exam_Date;
    private String Prerequisite;
    private boolean IsRegistered;
    private boolean IsRemoved;
    ////creating constructor to initialize the value
    public NonAcademicCourse(String CourseID,String Course_Name,int Duration, String Prerequisite){

        super(CourseID, Course_Name, Duration);
        this.Prerequisite = Prerequisite;
        this.Start_Date = "";
        this.Completion_Date = "";
        this.Exam_Date = "";

    }
    //creating get and set method which is used to read and set the values of variables
    public String getInstructorName(){

        return Instructor_Name;
    }

    public String getStartDate(){

        return Start_Date;
    }

    public String getCompletionDate(){

        return Completion_Date;
    }

    public String getExamDate(){

        return Exam_Date;
    }

    public String getPrerequisite(){

        return Prerequisite;
    }

    public boolean getIsRegistered(){

        return IsRegistered;
    }

    public boolean getIsRemoved(){

        return IsRemoved;
    }

    public void setInstructorName(String newInstructorName){

        this.Instructor_Name = newInstructorName;
        if(IsRegistered == true){
            System.out.println("Therefore not possible to change the instructor name");
        }
        else{

            this.Instructor_Name = newInstructorName;
        }
    } 

    public void Register( String Course_leader, String Instructor_Name, String Start_Date, String Completion_Date, String Exam_Date){

        if(IsRegistered == false){

            super.setCourseLeader(Course_leader);
            setInstructorName(Instructor_Name);
            this.Start_Date = Start_Date; 
            this.Completion_Date = Completion_Date;
            this.Exam_Date = Exam_Date;
            this.IsRegistered = true;
        }
        else{

            System.out.println("The course is already Registered");
        }
    }

    public void Remove(){

        if(IsRemoved == true){

            System.out.println("Course is already Removed");  
        }
        else{

            super.setCourseLeader("");
            this.Instructor_Name = "";
            this.Start_Date = "";
            this.Completion_Date = "";
            this.Exam_Date = "";
            this.IsRegistered = false;
            this.IsRemoved = true;

        }
    }
    //creating method for displaying the information
    public void Display(){

        super.Display();
        if(IsRegistered == true){

            System.out.println("---------------------------------");
            System.out.println("\nDetails of the Non-AcdemicCourse");
            System.out.println("---------------------------------");
            System.out.println("Instructor Name:" +Instructor_Name);
            System.out.println("Start Date:" +Start_Date);
            System.out.println("Completion Date:" +Completion_Date);
            System.out.println("Exam Date:" +Exam_Date);
            System.out.println("---------------------------------");

        }
    }

}
