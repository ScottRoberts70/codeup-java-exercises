package grades;

import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Double> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(double grade) {
        grades.add (grade);
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

}
