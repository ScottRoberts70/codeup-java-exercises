package grades;

public class StudentTest {

    public static void main(String[] args) {

       Student scott = new Student("Scott");
       scott.addGrade(76);
       scott.addGrade(80);
       scott.addGrade(99);
       scott.addGrade(85);
       System.out.println(scott.getGrades());
       System.out.println(scott.getGradeAverage());

    }
}
