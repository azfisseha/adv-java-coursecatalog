package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course{

    private static final double MAX_CREDITS = 4.0;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);

    }

//    public String getCourseName() {
//        return courseName;
//    }

//    public final void setCourseName(String courseName) {
//        if (courseName == null || courseName.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseName cannot be null of empty string");
//            System.exit(0);
//        }
//        this.courseName = courseName;
//    }

//    public String getCourseNumber() {
//        return courseNumber;
//    }
//
//    @Override
//    public final void setCourseNumber(String courseNumber) {
//        if (courseNumber == null || courseNumber.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseNumber cannot be null of empty string");
//            System.exit(0);
//        }
//        this.courseNumber = courseNumber;
//    }

//    public double getCredits() {
//        return credits;
//    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

}
