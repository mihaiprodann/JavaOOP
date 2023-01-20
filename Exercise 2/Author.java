public class Author {
    protected String name;
    protected Publication[] publications = new Publication[100];

    public void addPublication(Publication p){
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] == null) {
                publications[i] = p;
                break;
            }
        }
    }

    public double computeScore(){
        double score = 0;
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] != null) {
                score += publications[i].computeScore();
            }
        }
        return score;
    }
    
}
