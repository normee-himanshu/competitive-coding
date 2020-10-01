import java.util.*; 
 class codechef {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		while(t>0) {
		
		
		int n=s.nextInt();
		int r=64-n;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++)
			{
				if(i==7 && j==7)
				{
					System.out.print("O");
				}
				else if(r>0)
				{
					System.out.print("X");
					r--;
				}
				else
				{
					System.out.print(".");
				}
			}
			System.out.println();
		}
			t--;
		}
		
		
		
}
}
