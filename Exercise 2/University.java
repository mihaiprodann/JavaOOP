
public class University {
    protected String name;
    protected String location;
    protected Author[] authros = new Author[100];

    public void addAuthor(Author a){
        for (int i = 0; i < authros.length; i++) {
            if (authros[i] == null) {
                authros[i] = a;
                break;
            }
        }
        
    }
    
    public double computeScore(){
        double score = 0;
        for (int i = 0; i < authros.length; i++) {
            if (authros[i] != null) {
                score += authros[i].computeScore();
            }
        }
        return score;
    }
}
