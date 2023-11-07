package lab2;

public class Main {
    public static void main(String[] args) {
        Course advJava = new AdvancedJavaCourse("advJava", "1");
        Course introJava = new IntroJavaCourse("introJava", "2");
        Course introProgramming = new IntroToProgrammingCourse("introProgramming", "3");

        System.out.println(advJava.getCourseName() + ": " + advJava.getCourseNumber());
        advJava.setCredits(3.5);
        System.out.println(advJava.getCredits() + " credit course");
    }

}
