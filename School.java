/*
This class keeps track of all the information within the school,
including methods to find specific requests within the school
 */

public class School {

    private Lecturer[] lecturers = new Lecturer[20]; //Holds the information of each lecturer
    private String schoolName; //Holds the name of the school
    private Paper[] papers = new Paper[20]; //Hold the information of each paper within the school up to 20 papers
    private int paperCount = 0; //Keeps track of the number of papers
    private int lecturerCount = 0; //Keeps track of the number of lecturers

    public void setSchoolName (String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName () {
        return schoolName;
    }

    public int getPaperCount () {
        return paperCount;
    }

  //Adds a paper to the school
    public void addPaper (Paper paper) {
        if (paperCount < papers.length) {
            papers[paperCount] = paper;
            paperCount++;
        } else {
            System.out.println("Cannot add more papers");
        }
    }

 //Adds a lecturer to the school
    public void addLecturer (Lecturer lecturer) {
        if (lecturerCount < lecturers.length) {
            lecturers[lecturerCount] = lecturer;
            lecturerCount++;
        } else {
            System.out.println("Cannot add more Lecturers");
        }
    }

    //Displays all papers within the school
    public void displayPapers () {
        String space = "          ";
        for (int i = 0; i < getPaperCount(); i++) {
            System.out.print(papers[i].getPaperNumber() + space
                    + papers[i].getPaperName() + " (");
            for (int j = 0; j < papers[i].getMajorCount(); j++) {
                System.out.print(papers[i].getMajors()[j].getMajor() + " ");
            }
            System.out.print(")");
            System.out.println();
        }
    }

    //Display papers with a specified major
    public void hasMajor (String major) {
        int Count = 0;
        for (int i = 0; i < getPaperCount(); i++) {
            for (int j = 0; j < papers[i].getMajorCount(); j++) {
                if (papers[i].getMajors()[j].getMajor().equals(major)) {
                    System.out.println("Paper -  " + papers[i].getPaperNumber() + " " + papers[i].getPaperName());
                    Count++;
                }
            }
        }
        System.out.println("Total matching papers in specified Major - " + major + ": " + Count);
    }

    //Display papers which have an exam
    public void hasExam () {
        int Count = 0;
        for (int i = 0; i < getPaperCount(); i++) {
            if (papers[i].getAssessments().getExam() == 0) {
                System.out.println("Paper -  " + papers[i].getPaperNumber() + " " + papers[i].getPaperName());
                Count++;
            }
        }
        System.out.println("Total number of papers which have an exam: " + Count);
    }

    //Display papers with an assignment weight over a specified percentage
    public void assignmentWeight (float percentage) {
        int Count = 0;
        for (int i = 0; i < getPaperCount(); i++) {
            if (papers[i].getAssessments().getAssignment() > percentage) {
                System.out.println("Paper -  " + papers[i].getPaperNumber() + " " + papers[i].getPaperName());
                Count++;
            }
        }
        System.out.println("Total number of papers that have assignments weighted more than 50.0%: " + Count);

    }

    //Randomly assigns lecturers to papers within the school
    public void assignLecturers () {
        boolean check;
        for (int i = 0; i < paperCount; i++) {
            Lecturer temp = lecturers[(int) (Math.random() * lecturerCount)];

            check = false;
            while (!check) {
                if (temp.getAssign() < 4) {
                    papers[i].getOffering().setDistance(temp.getFullName());
                    temp.addAssign();
                    check = true;
                } else {
                    temp = lecturers[(int) (Math.random() * lecturerCount)];
                }
            }

            check = false;
            while (!check) {
                if (temp.getAssign() < 4 && temp.getCampus().equals("Auckland")) {
                    papers[i].getOffering().setAuckland(temp.getFullName());
                    temp.addAssign();
                    check = true;
                } else {
                    temp = lecturers[(int) (Math.random() * lecturerCount)];
                }
            }

            check = false;
            while (!check) {
                if (temp.getAssign() < 4 && temp.getCampus().equals("PN")) {
                    papers[i].getOffering().setPalmerston(temp.getFullName());
                    temp.addAssign();
                    check = true;
                } else {
                    temp = lecturers[(int) (Math.random() * lecturerCount)];
                }
            }
        }
    }

    // Displays the lecturers for each paper and offering within the school
    public void displayLecturers () {
        for (int i = 0; i < paperCount; i++) {
            System.out.println(papers[i].getPaperNumber() + "   Distance      " + papers[i].getOffering().getDistance());
            System.out.println(papers[i].getPaperNumber() + "   Auckland      " + papers[i].getOffering().getAuckland());
            System.out.println(papers[i].getPaperNumber() + "   PN            " + papers[i].getOffering().getPalmerston());
        }
    }

    //Finds the courses a lecturer is teaching by name
    public void findLecturerByName (String name) {
        String space = "     ";
        for (int i = 0; i < paperCount; i++) {

            if (papers[i].getOffering().getDistance().equals(name)) {
                System.out.println("Paper Offering- " + papers[i].getPaperNumber() + space + "Distance" + space + "Lecturer: " + name);
            }
            if (papers[i].getOffering().getAuckland().equals(name)) {
                System.out.println("Paper Offering- " + papers[i].getPaperNumber() + space + "Auckland" + space + "Lecturer: " + name);

            }
            if (papers[i].getOffering().getPalmerston().equals(name)) {
                System.out.println("Paper Offering- " + papers[i].getPaperNumber() + space + "PN      " + space + "Lecturer: " + name);

            }

        }
        for (int i = 0; i < lecturerCount; i++) {
            if (lecturers[i].getFullName().equals(name)) {
                System.out.println(name + " is teaching " + lecturers[i].getAssign() + " paper(s)");
            }
        }
    }

    // Finds the lecturer teaching a specified course
    public void findLecturerbyCourse (int course) {
        int i;
        for (i = 0; i < paperCount; i++) {
            if (papers[i].getPaperNumber() == course) {
                System.out.println("Lecturers Name: " + papers[i].getOffering().getAuckland());
                break;
            }
        }
        for (int j = 0; j < lecturerCount; j++) {
            if (lecturers[j].getFullName().equals(papers[i].getOffering().getAuckland())) {
                System.out.println("This Lecturer is teaching " + lecturers[j].getAssign() + " paper(s)");
                break;
            }
        }
    }
}






