package ph.edu.dlsu.olives;

public class Kalamata extends Olive {

    public Kalamata() {
        super(2);
        this.name = "Kalamata";
        this.flavor = "Grassy";
        this.color = Olive.BLACK;
    }

    public String getOrigin() {
        return "Greece";
    }

}
