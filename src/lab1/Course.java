package lab1;

import javax.swing.*;

public abstract class Course {
    private String courseName;
    private String courseNumber;
    protected double credits;

    public String getCourseName() { return courseName;}
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public String getCourseNumber(){return courseNumber;}
    public void setCourseNumber(String courseNumber){
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits(){return credits;}
    public abstract void setCredits(double credits);
}
