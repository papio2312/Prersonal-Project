import java.util.Scanner;
public class test {
    public static void main(String[] args) { 
        int a;
        int b;
        int temp;
       
        Scanner input = new Scanner(System.in); 

        System.out.print("Give a: ");
        a = input.nextInt();

        System.out.print("Give b: ");
        b = input.nextInt();

        if(a<b){
            temp = a;
            a = b;
            b = temp;
            while(a>b){
                int y = a%b;
                System.out.printf("Ypoloipo iso me: %d\n", y);
                if(y==0){
                    System.out.printf("MKD iso me: %d",b);
                }else{
                    b = a;
                    b = y;
                    y = a%b;
                    System.out.printf("MKD iso me: %d",b);
                }
              break;
            }
                
        }
              
    }
}