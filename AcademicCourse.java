
/**
 * Write a description of class AcademicCourse here.
 *
 * @author (KHEMRAJ SINGH THAKURI)
 * @version (1.0)
 */
public class AcademicCourse extends course{
    // instance variables OF AcademicCourse
    private String Lecturer_Name;
    private String Level;
    private String Credit;
    private String Starting_Date;
    private String Completion_Date;
    private int Num_of_Assessments;
    private boolean isRegistered;
    //creating constructor for initializing
    public AcademicCourse (String CourseID, String Course_Name, int Duration, String Level, String Credit, int Num_of_Assessments){

        super(CourseID,Course_Name,Duration);
        Lecturer_Name = "";
        Starting_Date = "";
        Completion_Date = "";
        this.Level = Level;
        this.Credit = Credit;
        this.Num_of_Assessments = Num_of_Assessments;
        isRegistered = false;

    }
    //creating get and set method which is used to read and set the values of variables
    public String getlecturerName() {

        return Lecturer_Name;

    }

    public String getlevel() {

        return Level;

    }

    public String getcredit() {

        return Credit;

    }

    public String getstartingdate() {

        return Starting_Date;

    }

    public String getcompletionDate() {

        return Completion_Date;

    }

    public int getNumberofAssessments() {

        return Num_of_Assessments;

    }

    public boolean getisRegistered() {

        return isRegistered;

    }

    public void setlecturerName(String newLectureName) {

        Lecturer_Name = newLectureName;

    }

    public void setNum_of_Assessments(int newNum_of_Assessments) {

        Num_of_Assessments = newNum_of_Assessments;

    }

    public void Register(String Course_leader, String Lecturer_Name, String Starting_Date, String Completion_Date){

        if(isRegistered == true){

            System.out.println("Course Leader:"+Course_leader);
            System.out.println("Starting Date:"+Starting_Date);
            System.out.println("Completion Date:"+Completion_Date);

        }
        else{
            super.setCourseLeader(Course_leader);
            this.Starting_Date = Starting_Date;
            this.Lecturer_Name = Lecturer_Name;
            this.Completion_Date = Completion_Date;
            this.isRegistered = true;
        }
    }
    //creating method for displaying the information
    public void Display(){

        super.Display();
        if(isRegistered == true){

            System.out.println("---------------------------------");
            System.out.println("\nDetails of the AcademicCourse");
            System.out.println("---------------------------------");
            System.out.println("Lecturer Name:" +Lecturer_Name);
            System.out.println("Level:" +Level);
            System.out.println("Credit:" +Credit);
            System.out.println("Starting Date:" +Starting_Date);
            System.out.println("Completion Date:" +Completion_Date);
            System.out.println("Number of Assessments:" +Num_of_Assessments);
            System.out.println("---------------------------------");
        }

    }
}

