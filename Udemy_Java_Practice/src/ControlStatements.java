
public class ControlStatements 
{
	//pyramid
/*public static void main(String [] args)
{
	int k=1;
	for(int i=0;i<4;i++)
	{
		//System.out.println("outer loop start");
		for(int j=1;j<=4-i;j++)
		{
			//System.out.println("inner loop");
			System.out.print(k+"\t");
			k++;
		}
		System.out.println();
		//System.out.println("outer loop end");
	}
}*/
	
	//inverted pyramid
	public static void main(String [] args)
	{
		int k=1;
		for(int i=1;i<=4;i++)
		{
			//System.out.println("outer loop start");
			for(int j=1;j<=i;j++)
			{
				//System.out.println("inner loop");
				System.out.print(k+"\t");
				k++;
			}
			System.out.println();
			//System.out.println("outer loop end");
		}
}
}
