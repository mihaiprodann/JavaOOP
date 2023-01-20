public class FormTest {
    public static void main(String[] args) {
        Form[] forms = new Form[3];
        forms[0] = new Point(1, 2);
        forms[1] = new Circle(3, 4, 5);
        forms[2] = new Cylinder(6, 7, 8, 9);

        for (int i = 0; i < forms.length; i++) {
            System.out.println(forms[i]);
        }
    }
    
}
