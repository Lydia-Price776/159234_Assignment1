/*
This class keeps track of all the information related to a paper
 */

public class Paper {
    private String paperName;
    private int paperNumber;

    private Major[] majors = new Major[10];
    private Offerings offering;
    private int majorCount = 0;
    private Assessments assessments;

    public Paper (String paper_Name, int paper_Number) {
        setPaperName(paper_Name);
        setPaperNumber(paper_Number);
        offering = new Offerings();
    }

    public void setPaperName (String paperName) {
        this.paperName = paperName;
    }

    public String getPaperName () {
        return paperName;
    }

    public void setPaperNumber (int paperNumber) {
        this.paperNumber = paperNumber;
    }

    public int getPaperNumber () {
        return paperNumber;
    }

    public void addMajor (Major newMajor) {
        if (majorCount < majors.length) {
            majors[majorCount] = newMajor;
            majorCount++;
        } else {
            System.out.println("Cannot add more Majors");
        }
    }

    public Offerings getOffering () {
        return offering;
    }

    public void setOffering (Offerings offering) {
        this.offering = offering;
    }

    public void setAssessments (Assessments assessments) {
        this.assessments = assessments;
    }

    public Assessments getAssessments () {
        return assessments;
    }

    public Major[] getMajors () {
        return majors;
    }

    public int getMajorCount () {
        return majorCount;
    }

}
