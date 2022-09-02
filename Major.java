/* This class stores the major/s associated with each paper
 */
public class Major {
    private String major; //Stores the major a paper is associated with

    public Major (String major) {
        setMajor(major);
    }

    public String getMajor () {
        return major;
    }

    public void setMajor (String major) {
        this.major = major;
    }
}
