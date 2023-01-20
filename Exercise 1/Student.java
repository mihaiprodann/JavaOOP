public class Student {
    private String name;
    private double[] marks = new double[100];
    private int totalExamsTaken = 0;

    public Student(String name){
        this.name = name;
        
    }
    
    public String getName(){
        return this.name;
    }


    public void addExam(double mark){
        marks[totalExamsTaken++] = mark;
       
    }

    public double getTotal(){
        double result = 0;
        for(int i = 0; i<totalExamsTaken; i++){
            result += marks[i];
        }

        return result;
    }

    public double getMeanMark(){
        return getTotal()/(totalExamsTaken);
    }

        
    
}

