package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course{

    private static final double MAX_CREDITS = 5.0;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

//    public String getCourseNumber() {
//        return courseNumber;
//    }

//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }

//    public double getCredits() {
//        return credits;
//    }

    public void setCredits(double credits) {
        if (credits < 0 || credits > MAX_CREDITS) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
