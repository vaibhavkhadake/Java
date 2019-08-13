
public class Pp2 {

	public static void main(String[] args)
	{
		int space=5;
		for(int i=0;i<2;i++)
		{
			
			for(int k=0;k<space;k++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i*2;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
		
		int space2=2;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<=space2;j++)
			{
				System.out.print("  ");
			}
			for(int k=5;k>i*2;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
			space2++;
			
		}

	}

}
