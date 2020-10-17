import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number upto which sum is required");
float x= sc.nextInt();
float sum =0;
for(float i =1; i<=x; i++)
{
sum += 1/i;
}
System.out.println("The sum of series is " + sum);

}
}
