public class Ypallilos {
    private double misthos;
    private double eisfora;
    private double telikosMisthos;
    public Ypallilos(){
        misthos =0;
        eisfora = 0;
        telikosMisthos=0;
    }

    public void setetEmployeeMisthos(double m){
        misthos = m;
    }

    public void setEisforaMisthou(double e){
        eisfora = e;
    }

    public double getSalary(){
        return misthos;
    }

    public double getEisfora(){
        return eisfora;
    }


    public void setFinalSalary(double f){
        telikosMisthos = f;
    }

    public double getTelikoMistho(){
        return telikosMisthos;
    }
    public void TelikosMisthos(){
        telikosMisthos = misthos - eisfora;
    }

 


}
