public class UniversityTest {
    public static void main(String[] args) {
        University u = new University();
        Author a = new Author();
        Author b = new Author();
        u.addAuthor(a);
        u.addAuthor(b);

        a.addPublication(new Journal(1.5));
        a.addPublication(new ConferenceProceeding(false));

        b.addPublication(new Journal(2.5));
        b.addPublication(new ConferenceProceeding(true));

        a.addPublication(new Journal(0.5));
        a.addPublication(new ConferenceProceeding(false));

        b.addPublication(new Journal(1.5));
        b.addPublication(new ConferenceProceeding(true));



        System.out.println(u.computeScore());

        
    }
    
}
