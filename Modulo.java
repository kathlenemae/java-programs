import java.util.Scanner;
public class Modulo{
       public static void main(String[] args){
      
       String name;
       int num1,num2,quo,result;

       System.out.println(" Enter username                          : " );
       Scanner in= new Scanner(System.in);
       name=in.nextLine();

       System.out.println(" Enter value of the first number               : " );
       Scanner fs= new Scanner(System.in);
       num1=fs.nextInt();

       System.out.println(" Enter value of the second number              : " );
       Scanner sc= new Scanner(System.in);
       num2=sc.nextInt();
            if(num2==0)
              {
                System.out.println( " Invalid Input " );
               }
            else
               { 
                quo=num1/num2;
                result=num1-(quo*num2);
               System.out.println("\t\t\t Hello "  + name + " .The modulo is : " + result);
               }
     }
}