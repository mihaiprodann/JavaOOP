public class StudentTest {
    public static void main(String[] args) {
        Student Vlad = new Student("Mihai");
        System.out.println(Vlad.getName());
        Vlad.addExam(10);
        Vlad.addExam(8);
        Vlad.addExam(9);
        Vlad.addExam(7);

        System.out.println(Vlad.getTotal());
        System.out.println(Vlad.getMeanMark());
        

    }
    
    
}
