public class Journal extends Publication {
    protected String journalName;
    protected double impactFactor;

    public double computeScore() {
        return (impactFactor*0.5)/(numberOfAuthors);
    }

    public Journal(double impactFactor){
        this.impactFactor = impactFactor;
    }
    
}
