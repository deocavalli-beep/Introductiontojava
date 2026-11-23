public class Student implements Report {

    String name;
    double score;

    public Student(String name) {
        this.name = name;
    }


    public void calculateScore(double test) {
        score = test;
    }


    public void calculateScore(double test, double exam) {
        score = test + exam;
    }

    public Grade getGrade() {
        if (score >= 90) {
            return Grade.A;
        } else if (score >= 80) {
            return Grade.B;
        } else if (score >= 70) {
            return Grade.C;
        } else if (score >= 60) {
            return Grade.D;
        } else {
            return Grade.F;
        }
    }


    @Override
    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Score: " + score);
        System.out.println("Grade: " + getGrade());
    }
}