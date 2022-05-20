// developed by ponmalai at 20.05.2022
import java.util.Scanner;
public class Divide
{
    public static void main(String[] args) 
    {
        float n,p,l;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        n = s.nextInt();
	  System.out.print("Enter Second Number:");
	  p = s.nextInt();
        l=n/p;
        System.out.println("Divide Two Number is: "+l);
    }
}