import java.util.Scanner;
public class Convert{
  public static void main(String[]args){
    int x;
    double mark, pound, frank, euro, peso;
    System.out.println("Currency Menu:");
    System.out.println("1. British Pound");
    System.out.println("2. German Mark");
    System.out.println("3. Euro");
    System.out.println("4. Swiss Frank");
    Scanner num=new Scanner(System.in);
    System.out.print("Input Menu choice: ");
    x=num.nextInt();
    switch(x){
      case 1:
			{
        System.out.print("Input Peso value: ");
        peso=num.nextDouble();
				euro=peso*0.92;
				System.out.println("The value of "+peso+" pesos in euro is "+euro);
				break;
			}
		case 2:
			{
        System.out.print("Input Peso value: ");

        peso=num.nextDouble();
				pound=peso*1.81;
				System.out.println("The value of "+peso+" pesos in british pound is "+pound);

				break;
			}
		case 3:
			{
        System.out.print("Input Peso value: ");
        peso=num.nextDouble();
				mark=peso*0.98;
				System.out.println("The value of "+peso+" pesos in british pound is "+mark);


				break;
			}
		case 4:
			{
        System.out.print("Input Peso value: ");
        peso=num.nextDouble();
				frank=peso*0.67;
				System.out.println("The value of "+peso+" pesos in swiss frank is "+frank);

				break;
			}
		case 5:
		    {
		    	System.out.println("Goodbye");
		    	System.exit(0);
		    	break;
			}
		default:
			{
				System.out.println("Invalid input.");

				break;
			}
     }
  }
}



