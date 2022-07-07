import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

/**
 * Write a description of class INGNepal here.
 *
 * @author (Khemraj Singh Thakuri)
 * @version (1.0)
 */

public class INGCollege extends JFrame implements ActionListener{

    // Instance variable of Panels
    private JPanel MainPanel;
    private JPanel contentPane;
    private JPanel AcademicPanel;
    private JPanel NonAcademicPanel;

    // instance variable of Academic Course

    private JTextField AC_CourseID;
    private JTextField AC_Duration;
    private JTextField AC_LecturerName;
    private JTextField AC_Level;
    private JTextField AC_CourseName;
    private JTextField AC_NoOfAssements;
    private JTextField AC_CourseLeader;
    private JTextField AC_Credit;
    private JTextField AC_StartingDate;
    private JTextField AC_CompletionDate;
    private JButton btnAC_Add;
    private JButton btnAC_Register;
    private JButton btnAC_Display;
    private JButton btnAC_Clear;

    //creating arrayList of Academic Course
    ArrayList<course> AC_list = new ArrayList<course>();

    //instance variable of Non-Academic Course
    private JTextField NAC_CourseID;
    private JTextField NAC_Duration;
    private JTextField NAC_CourseName;
    private JTextField NAC_Prerequisite;
    private JTextField NAC_CourseLeader;
    private JTextField NAC_InstructorName;
    private JTextField NAC_StartDate;
    private JTextField NAC_CompletionDate;
    private JTextField NAC_ExamDate;
    private JButton btnNAC_Register;
    private JButton btnNAC_Display;
    private JButton btnNAC_Remove;
    private JButton btnNAC_Add;
    private JButton btnNAC_Clear;

    //creating arrayList of Non-Academic Course
    ArrayList<course> Non_list = new ArrayList<course>();

    /**
     * Launch the application.
     * creating main method
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        INGCollege frame = new INGCollege();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
    }

    /**
     * Create the frame and  Constructor 
     */
    public INGCollege() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1048, 650);
        setUndecorated(true);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // MainPanel of AcademicPanel and Non-AcademicPanel
        MainPanel = new JPanel();
        MainPanel.setBackground(new Color(235, 236, 241));
        MainPanel.setBounds(0, 61, 1048, 589);
        contentPane.add(MainPanel);
        MainPanel.setLayout(null);

        //Title Bar 
        JLabel Title = new JLabel("ING College");
        Title.setBounds(446, 11, 164, 39);
        contentPane.add(Title);
        Title.setForeground(Color.WHITE);
        Title.setFont(new Font("Times New Roman", Font.PLAIN, 27));

        // Exit JLabel of JFrame
        JLabel Exit = new JLabel("X");
        Exit.setBounds(1010, 13, 28, 35);
        contentPane.add(Exit);
        Exit.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.exit(0);
                }
            });
        Exit.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        Exit.setForeground(Color.WHITE);

        //Academic Course Panel and Components

        // AcademicPanel
        AcademicPanel = new JPanel();
        AcademicPanel.setBackground(new Color(235, 236, 241));
        AcademicPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), " Academic Course ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        AcademicPanel.setBounds(10, 11, 1028, 284);
        MainPanel.add(AcademicPanel);
        AcademicPanel.setLayout(null);

        // JLabel of Academic Course
        JLabel ACcourseID = new JLabel("CourseID:");
        ACcourseID.setForeground(Color.BLACK);
        ACcourseID.setFont(new Font("Arial", Font.BOLD, 12));
        ACcourseID.setBounds(23, 26, 120, 30);
        AcademicPanel.add(ACcourseID);

        JLabel ACduration = new JLabel("Duration:");
        ACduration.setForeground(Color.BLACK);
        ACduration.setFont(new Font("Arial", Font.BOLD, 12));
        ACduration.setBounds(23, 67, 120, 30);
        AcademicPanel.add(ACduration);

        JLabel ACLecturerName = new JLabel("Lecturer Name:");
        ACLecturerName.setForeground(Color.BLACK);
        ACLecturerName.setFont(new Font("Arial", Font.BOLD, 12));
        ACLecturerName.setBounds(23, 161, 120, 30);
        AcademicPanel.add(ACLecturerName);

        JLabel ACLevel = new JLabel("Level:");
        ACLevel.setForeground(Color.BLACK);
        ACLevel.setFont(new Font("Arial", Font.BOLD, 12));
        ACLevel.setBounds(23, 108, 120, 30);
        AcademicPanel.add(ACLevel);

        JLabel ACCourseName = new JLabel("Course Name:");
        ACCourseName.setForeground(Color.BLACK);
        ACCourseName.setFont(new Font("Arial", Font.BOLD, 12));
        ACCourseName.setBounds(401, 26, 120, 30);
        AcademicPanel.add(ACCourseName);

        JLabel ACNoOfAssessments = new JLabel("No of Assessments:");
        ACNoOfAssessments.setForeground(Color.BLACK);
        ACNoOfAssessments.setFont(new Font("Arial", Font.BOLD, 12));
        ACNoOfAssessments.setBounds(401, 67, 120, 30);
        AcademicPanel.add(ACNoOfAssessments);

        JLabel ACCourseLeader = new JLabel("Course Leader:");
        ACCourseLeader.setForeground(Color.BLACK);
        ACCourseLeader.setFont(new Font("Arial", Font.BOLD, 12));
        ACCourseLeader.setBounds(401, 161, 120, 30);
        AcademicPanel.add(ACCourseLeader);

        JLabel ACCredit = new JLabel("Credit:");
        ACCredit.setForeground(Color.BLACK);
        ACCredit.setFont(new Font("Arial", Font.BOLD, 12));
        ACCredit.setBounds(401, 108, 120, 30);
        AcademicPanel.add(ACCredit);

        JLabel ACStartingDate = new JLabel("Starting Date:");
        ACStartingDate.setForeground(Color.BLACK);
        ACStartingDate.setFont(new Font("Arial", Font.BOLD, 12));
        ACStartingDate.setBounds(23, 202, 120, 30);
        AcademicPanel.add(ACStartingDate);

        JLabel ACCompletionDate = new JLabel("Completion Date:");
        ACCompletionDate.setForeground(Color.BLACK);
        ACCompletionDate.setFont(new Font("Arial", Font.BOLD, 12));
        ACCompletionDate.setBounds(401, 202, 120, 30);
        AcademicPanel.add(ACCompletionDate);

        // JLabel of Academic Course end...

        // JTextField of  Academic Course
        AC_CourseID = new JTextField();
        AC_CourseID.setFont(new Font("Arial", Font.PLAIN, 12));
        AC_CourseID.setBounds(153, 26, 150, 30);
        AcademicPanel.add(AC_CourseID);
        AC_CourseID.setColumns(10);

        AC_Duration = new JTextField();
        AC_Duration.setFont(new Font("Arial", Font.PLAIN, 12));
        AC_Duration.setColumns(10);
        AC_Duration.setBounds(153, 67, 150, 30);
        AcademicPanel.add(AC_Duration);

        AC_LecturerName = new JTextField();
        AC_LecturerName.setFont(new Font("Arial", Font.PLAIN, 12));
        AC_LecturerName.setColumns(10);
        AC_LecturerName.setBounds(153, 161, 150, 30);
        AcademicPanel.add(AC_LecturerName);

        AC_Level = new JTextField();
        AC_Level.setFont(new Font("Arial", Font.PLAIN, 12));
        AC_Level.setColumns(10);
        AC_Level.setBounds(153, 108, 150, 30);
        AcademicPanel.add(AC_Level);

        AC_CourseName = new JTextField();
        AC_CourseName.setFont(new Font("Arial", Font.PLAIN, 12));
        AC_CourseName.setColumns(10);
        AC_CourseName.setBounds(531, 26, 150, 30);
        AcademicPanel.add(AC_CourseName);

        AC_NoOfAssements = new JTextField();
        AC_NoOfAssements.setFont(new Font("Arial", Font.PLAIN, 12));
        AC_NoOfAssements.setColumns(10);
        AC_NoOfAssements.setBounds(531, 67, 150, 30);
        AcademicPanel.add(AC_NoOfAssements);

        AC_CourseLeader = new JTextField();
        AC_CourseLeader.setFont(new Font("Arial", Font.PLAIN, 12));
        AC_CourseLeader.setColumns(10);
        AC_CourseLeader.setBounds(531, 161, 150, 30);
        AcademicPanel.add(AC_CourseLeader);

        AC_Credit = new JTextField();
        AC_Credit.setFont(new Font("Arial", Font.PLAIN, 12));
        AC_Credit.setColumns(10);
        AC_Credit.setBounds(531, 108, 150, 30);
        AcademicPanel.add(AC_Credit);

        AC_StartingDate = new JTextField();
        AC_StartingDate.setFont(new Font("Arial", Font.PLAIN, 12));
        AC_StartingDate.setColumns(10);
        AC_StartingDate.setBounds(153, 202, 150, 30);
        AcademicPanel.add(AC_StartingDate);

        AC_CompletionDate = new JTextField();
        AC_CompletionDate.setFont(new Font("Arial", Font.PLAIN, 12));
        AC_CompletionDate.setColumns(10);
        AC_CompletionDate.setBounds(531, 202, 150, 30);
        AcademicPanel.add(AC_CompletionDate);

        // JTextField  of  Academic Course end..

        //JButton of  Academic Course 

        btnAC_Register = new JButton("Register");
        btnAC_Register.setFont(new Font("Arial", Font.BOLD, 12));
        btnAC_Register.setBounds(722, 177, 120, 32);
        btnAC_Register.addActionListener(this);
        AcademicPanel.add(btnAC_Register);

        btnAC_Display = new JButton("Display ");
        btnAC_Display.setFont(new Font("Arial", Font.BOLD, 12));
        btnAC_Display.setBounds(898, 25, 120, 32);
        btnAC_Display.addActionListener(this);
        AcademicPanel.add(btnAC_Display);

        btnAC_Clear = new JButton("Clear");
        btnAC_Clear.setFont(new Font("Arial", Font.BOLD, 12));
        btnAC_Clear.setBounds(898, 201, 120, 32);
        btnAC_Clear.addActionListener(this);
        AcademicPanel.add(btnAC_Clear);

        btnAC_Add = new JButton("Add");
        btnAC_Add.setFont(new Font("Arial", Font.BOLD, 12));
        btnAC_Add.setBounds(722, 53, 120, 32);
        btnAC_Add.addActionListener(this);
        AcademicPanel.add(btnAC_Add);

        // JButton of  Academic Course end...

        /*---------------------------------------------------------------------------------------------------------------------------------*/

        //Non-AcademicCourse Panel and Components

        NonAcademicPanel = new JPanel();
        NonAcademicPanel.setBackground(new Color(235, 236, 241));
        NonAcademicPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), " Non-Academic Course ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
        NonAcademicPanel.setBounds(10, 293, 1028, 278);
        MainPanel.add(NonAcademicPanel);
        NonAcademicPanel.setLayout(null);

        // JLabel of Non-Academic Course 
        JLabel NACcourseid = new JLabel("CourseID:");
        NACcourseid.setFont(new Font("Arial", Font.BOLD, 12));
        NACcourseid.setBounds(20, 37, 120, 30);
        NonAcademicPanel.add(NACcourseid);

        JLabel NACduration = new JLabel("Duration:");
        NACduration.setFont(new Font("Arial", Font.BOLD, 12));
        NACduration.setBounds(20, 78, 120, 30);
        NonAcademicPanel.add(NACduration);

        JLabel NACcoursename = new JLabel("Course Name:");
        NACcoursename.setFont(new Font("Arial", Font.BOLD, 12));
        NACcoursename.setBounds(20, 119, 120, 30);
        NonAcademicPanel.add(NACcoursename);

        JLabel NACprerequisite = new JLabel("Prerequisite:");
        NACprerequisite.setFont(new Font("Arial", Font.BOLD, 12));
        NACprerequisite.setBounds(20, 160, 120, 30);
        NonAcademicPanel.add(NACprerequisite);

        JLabel NACcourseleader = new JLabel("Course Leader:");
        NACcourseleader.setFont(new Font("Arial", Font.BOLD, 12));
        NACcourseleader.setBounds(391, 119, 120, 30);
        NonAcademicPanel.add(NACcourseleader);

        JLabel NACinstructorname = new JLabel("Instructor Name:");
        NACinstructorname.setFont(new Font("Arial", Font.BOLD, 12));
        NACinstructorname.setBounds(391, 37, 120, 30);
        NonAcademicPanel.add(NACinstructorname);

        JLabel NACstartdate = new JLabel("Start Date:");
        NACstartdate.setFont(new Font("Arial", Font.BOLD, 12));
        NACstartdate.setBounds(719, 37, 120, 30);
        NonAcademicPanel.add(NACstartdate);

        JLabel NACcompletiondate = new JLabel("Completion Date:");
        NACcompletiondate.setFont(new Font("Arial", Font.BOLD, 12));
        NACcompletiondate.setBounds(391, 78, 120, 30);
        NonAcademicPanel.add(NACcompletiondate);

        JLabel NACexamdate = new JLabel("Exam Date:");
        NACexamdate.setFont(new Font("Arial", Font.BOLD, 12));
        NACexamdate.setBounds(719, 80, 120, 30);
        NonAcademicPanel.add(NACexamdate);

        //JLabel of Non-Academic Course end...

        // JTextField of Non-Academic Course 

        NAC_CourseID = new JTextField();
        NAC_CourseID.setFont(new Font("Arial", Font.PLAIN, 12));
        NAC_CourseID.setColumns(10);
        NAC_CourseID.setBounds(150, 37, 150, 30);
        NonAcademicPanel.add(NAC_CourseID);

        NAC_Duration = new JTextField();
        NAC_Duration.setFont(new Font("Arial", Font.PLAIN, 12));
        NAC_Duration.setColumns(10);
        NAC_Duration.setBounds(150, 78, 150, 30);
        NonAcademicPanel.add(NAC_Duration);

        NAC_CourseName = new JTextField();
        NAC_CourseName.setFont(new Font("Arial", Font.PLAIN, 12));
        NAC_CourseName.setColumns(10);
        NAC_CourseName.setBounds(150, 119, 150, 30);
        NonAcademicPanel.add(NAC_CourseName);

        NAC_Prerequisite = new JTextField();
        NAC_Prerequisite.setFont(new Font("Arial", Font.PLAIN, 12));
        NAC_Prerequisite.setColumns(10);
        NAC_Prerequisite.setBounds(150, 160, 150, 30);
        NonAcademicPanel.add(NAC_Prerequisite);

        NAC_CourseLeader = new JTextField();
        NAC_CourseLeader.setFont(new Font("Arial", Font.PLAIN, 12));
        NAC_CourseLeader.setColumns(10);
        NAC_CourseLeader.setBounds(521, 119, 150, 30);
        NonAcademicPanel.add(NAC_CourseLeader);

        NAC_InstructorName = new JTextField();
        NAC_InstructorName.setFont(new Font("Arial", Font.PLAIN, 12));
        NAC_InstructorName.setColumns(10);
        NAC_InstructorName.setBounds(521, 37, 150, 30);
        NonAcademicPanel.add(NAC_InstructorName);

        NAC_StartDate = new JTextField();
        NAC_StartDate.setFont(new Font("Arial", Font.PLAIN, 12));
        NAC_StartDate.setColumns(10);
        NAC_StartDate.setBounds(849, 37, 150, 30);
        NonAcademicPanel.add(NAC_StartDate);

        NAC_CompletionDate = new JTextField();
        NAC_CompletionDate.setFont(new Font("Arial", Font.PLAIN, 12));
        NAC_CompletionDate.setColumns(10);
        NAC_CompletionDate.setBounds(521, 78, 150, 30);
        NonAcademicPanel.add(NAC_CompletionDate);

        NAC_ExamDate = new JTextField();
        NAC_ExamDate.setFont(new Font("Arial", Font.PLAIN, 12));
        NAC_ExamDate.setColumns(10);
        NAC_ExamDate.setBounds(849, 80, 150, 30);
        NonAcademicPanel.add(NAC_ExamDate);

        // JTextField of Non-Academic Course end...

        //JButton of Non-Academic Course 

        btnNAC_Register = new JButton("Register");
        btnNAC_Register.setFont(new Font("Arial", Font.BOLD, 12));
        btnNAC_Register.setBounds(849, 134, 150, 32);
        btnNAC_Register.addActionListener(this);
        NonAcademicPanel.add(btnNAC_Register);

        btnNAC_Display = new JButton("Display ");
        btnNAC_Display.setFont(new Font("Arial", Font.BOLD, 12));
        btnNAC_Display.setBounds(623, 211, 100, 32);
        btnNAC_Display.addActionListener(this);
        NonAcademicPanel.add(btnNAC_Display);

        btnNAC_Clear = new JButton("Clear");
        btnNAC_Clear.addActionListener(this);
        btnNAC_Clear.setFont(new Font("Arial", Font.BOLD, 12));
        btnNAC_Clear.setBounds(850, 211, 100, 32);
        NonAcademicPanel.add(btnNAC_Clear);

        btnNAC_Remove = new JButton("Remove");
        btnNAC_Remove.addActionListener(this);
        btnNAC_Remove.setFont(new Font("Arial", Font.BOLD, 12));
        btnNAC_Remove.setBounds(411, 211, 100, 32);
        NonAcademicPanel.add(btnNAC_Remove);

        btnNAC_Add = new JButton("Add");
        btnNAC_Add.addActionListener(this);
        btnNAC_Add.setFont(new Font("Arial", Font.BOLD, 12));
        btnNAC_Add.setBounds(150, 211, 150, 32);
        NonAcademicPanel.add(btnNAC_Add);

        //JButton of Non-Academic Course end...
    }

    @Override

    // ActionListener Method
    public void actionPerformed(ActionEvent e) {
        int duration = 0, noOfAssessments = 0;
        // Add JButton of Academic Course 
        if (e.getSource() == btnAC_Add) { 
            if (AC_CourseID.getText().isEmpty() || AC_CourseName.getText().isEmpty() || AC_Duration.getText().isEmpty()
            || AC_Level.getText().isEmpty() || AC_Credit.getText().isEmpty()
            || AC_NoOfAssements.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Empty fields found");
            } else {

                String courseid = AC_CourseID.getText();
                String coursename = AC_CourseName.getText();
                String level = AC_Level.getText();
                String credit = AC_Credit.getText();
                try { // try catch block for handling exception
                    duration = Integer.parseInt(AC_Duration.getText());
                } catch (Exception b) {
                    JOptionPane.showMessageDialog(this, "Invlid value in Duration ");
                    return;
                }
                try { // try catch block for handling exception
                    noOfAssessments = Integer.parseInt(AC_NoOfAssements.getText());
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(this, "Invlid value in Number of Assessments ");
                    return;
                }

                for (int i = 0; i < AC_list.size(); i++) {
                    AcademicCourse objs = (AcademicCourse) AC_list.get(i);
                    if (objs.getcourseid().equals(courseid)) {
                        JOptionPane.showMessageDialog(this, "Course is already added");
                        return;
                    }
                }
                AcademicCourse Ac_obj = new AcademicCourse(courseid, coursename, duration, level, credit,
                        noOfAssessments);
                AC_list.add(Ac_obj);
                JOptionPane.showMessageDialog(this, "Successfully Added");

                return;
            }

            // Register JButton of Academic Course 
        } else if (e.getSource() == btnAC_Register) {

            if (AC_CourseID.getText().isEmpty() || AC_CourseName.getText().isEmpty() || AC_Duration.getText().isEmpty()
            || AC_Level.getText().isEmpty() || AC_Credit.getText().isEmpty()
            || AC_NoOfAssements.getText().isEmpty() || AC_CourseLeader.getText().isEmpty()
            || AC_CompletionDate.getText().isEmpty() || AC_StartingDate.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Empty fields found");
            } else {
                String courseid = AC_CourseID.getText();
                String courseleader = AC_CourseLeader.getText();
                String lecturerName = AC_LecturerName.getText();
                String coursename = AC_CourseName.getText();
                String startingdate = AC_StartingDate.getText();
                String completiondate = AC_CompletionDate.getText();

                for (int i = 0; i < AC_list.size(); i++) {
                    //Object Casting
                    AcademicCourse obj = (AcademicCourse) AC_list.get(i); 
                    if (courseid.equals(obj.getcourseid())) {
                        if (obj.getisRegistered() == false) {
                            obj.Register(courseleader, lecturerName, startingdate, completiondate);
                            JOptionPane.showMessageDialog(this, "Successfully Registered");
                            return;
                        } else {
                            JOptionPane.showMessageDialog(this, "Already Registered ");
                            return;

                        }

                    }
                }

            }
        }
        // Clear JButton of Academic Course 
        else if (e.getSource() == btnAC_Clear) {  
            AC_CourseID.setText("");
            AC_Duration.setText("");
            AC_LecturerName.setText("");
            AC_Level.setText("");
            AC_CourseName.setText("");
            AC_NoOfAssements.setText("");
            AC_CourseLeader.setText("");
            AC_CompletionDate.setText("");
            AC_Credit.setText("");
            AC_StartingDate.setText("");

            // Display  JButton of Academic Course 
        } else if (e.getSource() == btnAC_Display) { // display all the information of Academic Course
            String ACcourseid = AC_CourseID.getText();
            for (int i = 0; i < AC_list.size(); i++) {
                AcademicCourse obj = (AcademicCourse) AC_list.get(i);
                obj.Display();

            }
        }
        // Add JButton of Non-Academic Course 
        else if (e.getSource() == btnNAC_Add) {
            if (NAC_CourseID.getText().isEmpty() || NAC_CourseName.getText().isEmpty()
            || NAC_Duration.getText().isEmpty() || NAC_Prerequisite.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Empty fields found");
            } else {

                String NACcourseid = NAC_CourseID.getText();
                String NACcoursename = NAC_CourseName.getText();
                String NACprerequisite = NAC_Prerequisite.getText();

                try {
                    duration = Integer.parseInt(NAC_Duration.getText());
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(this, "Invlid value in Duration ");
                    return;
                }

                for (int i = 0; i < Non_list.size(); i++) {
                    // object casting 
                    NonAcademicCourse objs = (NonAcademicCourse) Non_list.get(i);
                    if (objs.getcourseid().equals(NACcourseid)) {
                        JOptionPane.showMessageDialog(this, "Course is already added");
                        return;
                    }
                }
                NonAcademicCourse NAC_obj = new NonAcademicCourse(NACcourseid, NACcoursename, duration, NACprerequisite);
                Non_list.add(NAC_obj);
                JOptionPane.showMessageDialog(this, "Successfully Added");

            }
        }
        // Register JButton of Non-Academic Course 
        else if (e.getSource() == btnNAC_Register) {

            if (NAC_CourseID.getText().isEmpty() || NAC_CourseLeader.getText().isEmpty()
            || NAC_InstructorName.getText().isEmpty() || NAC_StartDate.getText().isEmpty()
            || NAC_CompletionDate.getText().isEmpty() || NAC_ExamDate.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Empty fields found");
            } else {

                String NACcourseleader = NAC_CourseLeader.getText();
                String NACinstructorname = NAC_InstructorName.getText();
                String NACstartdate = NAC_StartDate.getText();
                String NACcompletiondate = NAC_CompletionDate.getText();
                String NACexamdate = NAC_ExamDate.getText();

                String NACcourseid = NAC_CourseID.getText();
                for (int i = 0; i < Non_list.size(); i++) {
                    NonAcademicCourse obj = (NonAcademicCourse) Non_list.get(i);
                    if (NACcourseid.equals(obj.getcourseid())) {
                        if (obj.getIsRegistered() == false) {
                            obj.Register(NACcourseleader, NACinstructorname, NACstartdate, NACcompletiondate,
                                NACexamdate);
                            JOptionPane.showMessageDialog(this, "Successfully Registered");
                            return;
                        } else {
                            JOptionPane.showMessageDialog(this, "Already Registered ");
                            return;

                        }
                    }
                }
                JOptionPane.showMessageDialog(this, "course id does not match");
                return;
            }
        }

        // Clear JButton of Non-Academic Course 
        else if (e.getSource() == btnNAC_Clear) {

            NAC_CourseID.setText("");
            NAC_CourseLeader.setText("");
            NAC_InstructorName.setText("");
            NAC_StartDate.setText("");
            NAC_CompletionDate.setText("");
            NAC_ExamDate.setText("");
            NAC_CourseName.setText("");
            NAC_Duration.setText("");
            NAC_Prerequisite.setText("");

        } 
        //// Display JButton of Non-Academic Course 
        else if (e.getSource() == btnNAC_Display) {
            String NACcourseid = NAC_CourseID.getText();
            for (int i = 0; i < Non_list.size(); i++) {
                NonAcademicCourse obj = (NonAcademicCourse) Non_list.get(i);
                obj.Display();

            }

        }
        // Remove JButton of Non-Academic Course
        else if (e.getSource() == btnNAC_Remove) {
            if (NAC_CourseID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter the CourseId");
                return;
            }
            String courseid = NAC_CourseID.getText();
            for (course rem : Non_list) {
                NonAcademicCourse remo = (NonAcademicCourse) rem;
                if (courseid.equals(remo.getcourseid())) {
                    if (remo.getIsRemoved() == false) {
                        remo.Remove();
                        Non_list.remove(remo);
                        JOptionPane.showMessageDialog(this, "CourseID Removed");
                        NAC_CourseID.setText("");
                        NAC_CourseLeader.setText("");
                        NAC_InstructorName.setText("");
                        NAC_StartDate.setText("");
                        NAC_CompletionDate.setText("");
                        NAC_ExamDate.setText("");
                        NAC_CourseName.setText("");
                        NAC_Duration.setText("");
                        NAC_Prerequisite.setText("");
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Course is already Removed");
            return;
        }
    }

}

