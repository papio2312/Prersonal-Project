public class Student{
    private int id;
    private String name;
    private int grades;

    public Student(){
        
        name = "";
        grades =0;
    }
    
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setGrade(int g){
        grades = g;
    }

    public int getGrade(){
        return grades;
    }


}