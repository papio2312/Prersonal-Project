import java.util.Scanner;
public class StudentProg {
    public static void main(String[] args) {
        Student mathites[] =new Student[10];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<mathites.length; i++){
            mathites[i] = new Student();
        }

        for(int j=0; j<mathites.length; j++){
            System.out.print("give student name["+(j+1)+"]: ");
            String name = scanner.nextLine();
            mathites[j].setName(name);
        }

        // for(int x=0; x<mathites.length; x++){
        //     System.out.print("give student id["+(x+1)+"]: ");
        //     int id = scanner.nextInt();
        //     mathites[x].setId(id);
        // }

        for(int y=0; y<mathites.length; y++){
            System.out.print("give student grade["+(y+1)+"]: ");
            int grade = scanner.nextInt();
            mathites[y].setGrade(grade);
        }

       for(int z=0; z<mathites.length; z++){
        int grade = mathites[z].getGrade();
        if(grade>=5){
            System.out.print("["+mathites[z].getName()+"]: "+ " passed!");
        }else{
            System.out.print("\n["+mathites[z].getName()+"]: "+ " failed...");
        }
      }
   }
}
    

