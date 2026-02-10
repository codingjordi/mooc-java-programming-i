
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradesInPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradesInPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.gradesInPoints.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        
        int gradeSum = 0;
        
        if(this.grades.isEmpty()) {
            return -1;
        }
        
        for(int grade : this.grades) {
            gradeSum += grade;
        }
        
        return 1.0 * gradeSum / this.grades.size();
    }
    
    public double averageOfPoints() {
        
        int pointsSum = 0;
        
        if(this.gradesInPoints.isEmpty()) {
            return -1;
        }
        
        for(int points : this.gradesInPoints) {
            pointsSum += points;
        }
        
        return 1.0 * pointsSum / this.gradesInPoints.size();
    }
}
