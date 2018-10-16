import java.util.Scanner;

public class gradesystXA
{	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n,rn,p,c,b;
		float avg;
	
		String name;
		System.out.println("Enter a name");
		name=in.nextLine();
		System.out.println("Enter the roll number");
		rn=in.nextInt();
		System.out.println("Enter marks in physics,chemistry,biology");
		p=in.nextInt();
		c=in.nextInt();
		b=in.nextInt();

		avg=((float)(p+c+b))/3;

		if(avg>=80)
			System.out.println("A+");
		else if(avg>=60&&avg<80)
			System.out.println("A");
		else if(avg>=45&&avg<60) 
			System.out.println("B");
		else if(avg>=40&&avg<45) 
			System.out.println("C");
		else
		System.out.println("D-fail");

		System.out.println("Enter 1 for excellent,2 for good,3 for can dobetter,4 for need to work hard,5 for lack of concentration");
		System.out.println("Enter your choice");
		n=in.nextInt();

		switch(n)
		{
      		case 1:
      		{
      			System.out.println("excellent");
      			break;
      		}
      		case 2:
      		{
      			System.out.println("good");
      			break;
      		}
      		case 3:
      		{
      			System.out.println("can do better");
     			break;
      		}
      		case 4:
      		{
      			System.out.println("need to work hard");
      			break;
      		}
      		case 5:
      		{
      			System.out.println("lack of concentration");
      			break;
      		}
      		default:
      			System.out.println("Wrong choice");
      	}
	}
}
