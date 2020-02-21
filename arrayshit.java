import java.util.Scanner;
public class arrayshit{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int i,n;
    System.out.print("How many values do you want inside the array?: ");
    n=sc.nextInt();
    int[] name = new int[n];
    for(i=0;i<n;i++){
      System.out.print("Enter value "+(i+1)+": ");
      name[i]=sc.nextInt();
    }
    for(i=0;i<n;i++){
      System.out.println(name[i]);
    }
  }
}



