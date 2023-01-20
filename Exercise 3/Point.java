public class Point extends Form{
    protected int x;
    protected int y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int a, int b){
        x = a;
        y = b;
    }

    public void setPoint(int a, int b){
        x = a;
        y = b;
    }

    @Override
    public String toString(){
        return ("Point: (" + x + ", " + y + ")");
    }


    
}
