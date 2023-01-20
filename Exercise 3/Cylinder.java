public class Cylinder extends Circle{
    protected int height;

    public Cylinder(){
        height = 0;
    }

    public Cylinder(int h, int r, int a, int b){
        height = h;
        radius = r;
        x = a;
        y = b;
    }

    public void setHeight(int h){
        height = h;
    }
    
    public double computeVolume(){
        return (Math.PI * radius * radius * height);
    }

    public double ComputeArea(){
        return (2 * Math.PI * radius * (radius + height));
    }

    @Override
    public String toString(){
        return ("Cylinder: radius = " + radius + " height = " + height + " volume = " + computeVolume() + " area = " + ComputeArea());
    }

    
}
