/*
This class stores the lecturer names at each of the three
different possible campuses for each paper
*/

public class Offerings {
    private String Palmerston; // Stores lecturer name who is teaching the offering at the PN Campus
    private String Auckland; // Stores lecturer name who is teaching the offering at the Auckland Campus
    private String Distance;// Stores lecturer name who is teaching the offering via Distance

    public String getPalmerston () {
        return Palmerston;
    }

    public String getAuckland () {
        return Auckland;
    }

    public String getDistance () {
        return Distance;
    }

    public void setAuckland (String Auckland) {
        this.Auckland = Auckland;
    }

    public void setDistance (String Distance) {
        this.Distance = Distance;
    }

    public void setPalmerston (String Palmerston) {
        this.Palmerston = Palmerston;
    }
}