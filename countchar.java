import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0,i=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
			
		}
		System.out.println(""+count);
	}

}
