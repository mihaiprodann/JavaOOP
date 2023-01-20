import java.util.Calendar;

public abstract class Publication {
    protected String name;
    protected Calendar apparition;
    protected int numberOfAuthors;

    public Publication(){
        return;
    }

    public Publication(int numberOfAuthors) {
        this.numberOfAuthors = numberOfAuthors;
    }

    public double computeScore(){
        return 0;
    }

    
}
