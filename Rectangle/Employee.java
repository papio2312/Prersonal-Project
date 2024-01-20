public abstract class Employee{ //declaring private variables in an abstract superclass.
    private String name = "";
    private String afm = "";

    public Employee(){
        name = null;
        afm = null;
    }

    //Declaring our private variables as public.
    public Employee(String n, String a){ 
        name = n;
        afm = a;
    }


    //set & get Methods for name and afm.
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAfm(String a){
        afm = a;
    }

    public String getAfm(){
        return afm;
    }

    //Abstract method payment invoked. 
    public abstract int payment();


}
