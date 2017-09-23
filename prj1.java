package prj01;

public class prj1{
	
	public static void main(String[] args){
		digui n=new digui();
		n.n=1237;
		n.f1(n.f(n.n),n.n);
	}
}
class digui{
	public int n;
	public int f(int n)
	{
		if(n>5000)
		{
			System.out.print(n+"\n");
			return n;
		}
		else
		{
			System.out.print(n+"\n");
			n=n*2;
			return f(n);
		}
	}

	public int f1(int max,int n)
	{
		if(max<n)
		{
			return 0;
		}
		else
		{
			System.out.print(max+"\n");
			max=max/2;
			return f1(max,n);
		}
	}
}
