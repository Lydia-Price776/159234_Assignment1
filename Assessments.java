/* This class is the assessment class.
 * The weight of the  assignments, test and exams in
 * percentages represented  as integers are store here for each paper
 */

public class Assessments {
    private int Assignment; // Assignment keeps track of the assignment weight
    private int Test; //Test keeps track of the test weight
    private int Exam; // Exam keep track of the exam weight

    public Assessments (int Assignment, int Test, int Exam) {
        setAssignment(Assignment);
        setTest(Test);
        setExam(Exam);
    }

    public void setAssignment (int Assignment) {
        this.Assignment = Assignment;
    }

    public void setTest (int Test) {
        this.Test = Test;
    }

    public void setExam (int Exam) {
        this.Exam = Exam;
    }

    public int getAssignment () {
        return Assignment;
    }

    public int getTest () {
        return Test;
    }

    public int getExam () {
        return Exam;
    }
}
