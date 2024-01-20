import java.util.Scanner;
public class YpallilosProg{
    public static void main(String[] args) {
        Ypallilos ypalliloi[]= new Ypallilos[30];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<ypalliloi.length; i++){
            ypalliloi[i] = new Ypallilos();
        }

        for(int j=0; j<30; j++){
        System.out.print("Give employee salary [" + (j+1) +"]: ");
        double input = scanner.nextDouble();
        ypalliloi[j].setetEmployeeMisthos(input);
        }

        for(int z=0; z<ypalliloi.length; z++){
            System.out.println("MISTHOI: "+ypalliloi[z].getSalary());
        }


        for(int y=0; y<ypalliloi.length; y++){
            double salary = ypalliloi[y].getSalary();
            if(salary<=1000){
                double eisfora = (salary* 5/100);
             System.out.printf("Eisfora ypallilou["+(y+1)+"]: %.2f\n", eisfora);
                ypalliloi[y].setEisforaMisthou(eisfora);
            }else if(salary>1001 && salary<=2000){
                double eisfora = (salary *8.5/100);
                ypalliloi[y].setEisforaMisthou(eisfora);
                System.out.printf("Eisfora ypallilou["+(y+1)+"]: %.2f\n", eisfora);
            }else if(salary>2001){
                 double eisfora =(salary *12/100);
                ypalliloi[y].setEisforaMisthou(eisfora);
                System.out.printf("Eisfora ypallilou["+(y+1)+"]: %.2f\n", eisfora);
            }

            ypalliloi[y].TelikosMisthos();
        }

        for(int x=0; x<ypalliloi.length; x++){
            System.out.println("Telikos Misthos ypallilou["+(x+1)+"]"+ ypalliloi[x].getTelikoMistho());
        }

    }
}
