import java.util.Scanner;
public class ThreeDArray{
	public static void main(String[] args){
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	Scanner sn=new Scanner(System.in);

	System.out.print(" Enter how many Rows:");
	a=sc.nextInt();
	System.out.print(" Enter how many column:");
	b=sc.nextInt();
	System.out.print(" Enter how many 2D Array:");
	c=sc.nextInt();

        String[][][] name=new String[a][b][c];
	for(int x=0;x<a;x++){
	for(int y=0;y<b;y++){
	for(int z=0;z<c;z++){
	 System.out.print(" Enter value of Row " +(x+1)+ " of Column " +(y+1)+ " of 2D Array " +(z+1)+ " :");
         name[x][y][z]=sn.nextLine();
         }
	}
	}
        System.out.print("\n\n\t\t********FAMILY TREE********\n");
        for(int z=0;z<c;z++){
	for(int x=0;x<a;x++){
	for(int y=0;y<b;y++){
	System.out.print(name[x][y][z] + " " );
	}
	System.out.print("\n");
       }
	System.out.print("\n");
      }
 }
}



