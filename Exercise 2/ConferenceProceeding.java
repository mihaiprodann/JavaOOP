public class ConferenceProceeding extends Publication{
    protected String volumeName;
    protected boolean indexed;

    public double computeScore() {
        if (indexed) {
            return (0.25)/(numberOfAuthors);
        } else {
            return (0.2)/(numberOfAuthors);
        }
    }

    public ConferenceProceeding(boolean indexed){
        this.indexed = indexed;
    }

    
}
