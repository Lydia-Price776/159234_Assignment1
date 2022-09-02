//This class runs the tasks for the assignment. It is my main class

public class RunCode {

    public static void main (String[] args) {
        displayInfo();
        School school = setupInfo();
        displayOutput(school);
    }

    //Displays my info
    private static void displayInfo () {
        System.out.println("*******************************************************");
        System.out.println("Assignment 1, 159.234, Semester 1 2022");
        System.out.println("Submitted by: Lydia Price 20004521");
        System.out.println("My Major at Massey: Computer Science and Mathematics");
        System.out.println("*******************************************************");
        System.out.println();
    }

    // This Method displays the desired output related to the assignment
    private static void displayOutput (School school) {
        System.out.println("-----------------------------Task 1-----------------------------");
        System.out.println("School Full Name: " + school.getSchoolName());
        System.out.println();

        System.out.println("-----------------------------Task 2-----------------------------");
        System.out.println("All papers details:");
        school.displayPapers();
        System.out.println();

        System.out.println("-----------------------------Task 3-----------------------------");
        System.out.println("Papers that belong to the Major CS:");
        school.hasMajor("CS");
        System.out.println();

        System.out.println("-----------------------------Task 4-----------------------------");
        System.out.println("Papers that have an exam:");
        school.hasExam();
        System.out.println();

        System.out.println("-----------------------------Task 5-----------------------------");
        System.out.println("Papers that their assignments weigh higher than 50.0%");
        school.assignmentWeight(50.0f);
        System.out.println();

        System.out.println("-----------------------------Task 6-----------------------------");
        school.assignLecturers();
        school.displayLecturers();
        System.out.println();

        System.out.println("-----------------------------Task 7-----------------------------");
        System.out.println("The paper offerings that I teach are: ");
        school.findLecturerByName("Lydia Price");

        System.out.println("-----------------------------Task 8-----------------------------");
        System.out.println("The lecturer of the Auckland Offering of 159234 is:");
        school.findLecturerbyCourse(159234);
    }

    // Setting data related to the assignment
    private static School setupInfo () {
        School schoolMathAndCompSci = new School();
        schoolMathAndCompSci.setSchoolName("The School of Mathematics and Computer Science");
        setupPapers(schoolMathAndCompSci);
        setupLecturers(schoolMathAndCompSci);
        return schoolMathAndCompSci;
    }

    //Sets up ther information related to the lecturers and adds them to the school
    private static void setupLecturers (School schoolMathAndCompSci) {
        Lecturer Lecturer1 = new Lecturer(1105236, "Amy", "Sheffield", "PN");
        Lecturer Lecturer2 = new Lecturer(1235895, "Victoria", "Jensen", "PN");
        Lecturer Lecturer3 = new Lecturer(7225669, "James", "Lee", "PN");
        Lecturer Lecturer4 = new Lecturer(1328991, "Colin", "Delmont", "PN");
        Lecturer Lecturer5 = new Lecturer(1562347, "Thomas", "Becker", "Auckland");
        Lecturer Lecturer6 = new Lecturer(5664789, "Steven", "Hobbs", "Auckland");
        Lecturer Lecturer7 = new Lecturer(3658947, "Andrew", "Jackson", "Auckland");
        Lecturer Lecturer8 = new Lecturer(6332698, "Jonathon", "Wood", "Auckland");
        Lecturer Lecturer9 = new Lecturer(20004521, "Lydia", "Price", "PN");

        schoolMathAndCompSci.addLecturer(Lecturer1);
        schoolMathAndCompSci.addLecturer(Lecturer2);
        schoolMathAndCompSci.addLecturer(Lecturer3);
        schoolMathAndCompSci.addLecturer(Lecturer4);
        schoolMathAndCompSci.addLecturer(Lecturer5);
        schoolMathAndCompSci.addLecturer(Lecturer6);
        schoolMathAndCompSci.addLecturer(Lecturer7);
        schoolMathAndCompSci.addLecturer(Lecturer8);
        schoolMathAndCompSci.addLecturer(Lecturer9);
    }

    //Sets up information related to the papers and adds them to the school
    private static void setupPapers (School schoolMathAndCompSci) {
        Major majorIT = new Major("IT");
        Major majorIS = new Major("IS");
        Major majorCS = new Major("CS");
        Major majorDS = new Major("DS");
        Major majorSE = new Major("SE");

        Paper paper158100 = new Paper("Information Technology Principals", 158100);
        paper158100.addMajor(majorIT);
        paper158100.addMajor(majorIS);
        Assessments Assessments1 = new Assessments(70, 30, 0);
        paper158100.setAssessments(Assessments1);

        Paper paper158120 = new Paper("Web-based IT Fundamentals", 158120);
        paper158120.addMajor(majorIT);
        paper158120.addMajor(majorIS);
        Assessments Assessments2 = new Assessments(60, 40, 0);
        paper158120.setAssessments(Assessments2);

        Paper paper159101 = new Paper("Applied Programming", 159101);
        paper159101.addMajor(majorIT);
        paper159101.addMajor(majorIS);
        paper159101.addMajor(majorCS);
        paper159101.addMajor(majorDS);
        paper159101.addMajor(majorIS);
        Assessments Assessments3 = new Assessments(50, 50, 0);
        paper159101.setAssessments(Assessments3);

        Paper paper159201 = new Paper("Algorithms and Data Structures", 159201);
        paper159201.addMajor(majorCS);
        paper159201.addMajor(majorDS);
        paper159201.addMajor(majorSE);
        paper159201.addMajor(majorIS);
        Assessments Assessments4 = new Assessments(40, 20, 40);
        paper159201.setAssessments(Assessments4);

        Paper paper159234 = new Paper("Object-Oriented Programming", 159234);
        paper159234.addMajor(majorCS);
        paper159234.addMajor(majorDS);
        Assessments Assessments5 = new Assessments(50, 10, 40);
        paper159234.setAssessments(Assessments5);

        Paper paper158337 = new Paper("Database Development", 158337);
        paper158337.addMajor(majorIT);
        paper158337.addMajor(majorSE);
        paper158337.addMajor(majorDS);
        Assessments Assessments6 = new Assessments(60, 0, 40);
        paper158337.setAssessments(Assessments6);

        Paper paper158345 = new Paper("Professionalism in the Information Sciences", 158345);
        paper158345.addMajor(majorIT);
        paper158345.addMajor(majorIS);
        paper158345.addMajor(majorCS);
        paper158345.addMajor(majorDS);
        paper158345.addMajor(majorSE);
        Assessments Assessments7 = new Assessments(100, 0, 0);
        paper158345.setAssessments(Assessments7);

        schoolMathAndCompSci.addPaper(paper158100);
        schoolMathAndCompSci.addPaper(paper158120);
        schoolMathAndCompSci.addPaper(paper159101);
        schoolMathAndCompSci.addPaper(paper159201);
        schoolMathAndCompSci.addPaper(paper159234);
        schoolMathAndCompSci.addPaper(paper158337);
        schoolMathAndCompSci.addPaper(paper158345);
    }
}
