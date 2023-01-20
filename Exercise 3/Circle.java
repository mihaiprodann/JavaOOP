public class Circle extends Point {
    protected int radius;

    public Circle(){
        radius = 0;
    }

    public Circle(int r, int a, int b){
        radius = r;
        x=a;
        y=b;
    }

    public void setRadius(int r){
        radius = r;
    }

    public double computeArea(){
        return (Math.PI * radius * radius);
    }

    @Override
    public String toString(){
        return ("Circle: radius = " + radius + " area = " + computeArea());
    }


    
}
