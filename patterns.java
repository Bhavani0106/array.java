import java.util.*;
class patterns
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of rows");
int a = sc.nextInt();
for (int i=0;i<a;i++)
{
for(int j=1;j<i;j++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}

