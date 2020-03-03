
import java.io.*;
import java.util.Scanner;

public class BCNN
{
	public static int NhapSoNguyen(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x=sc.nextInt();
        return x;
    }
	public void BoiUoc(int a,int b)
	{	int B,c=a,d=b;
		while(a!=b)
		{if(a>b)a=a-b;
			else b=b-a;}
		
		B=c*d/a;
		System.out.println("UCLN la = "+a);
		System.out.println("BCNN la = "+B);
	}
	public void DaoNguoc(int a)
	{
		int S=0,i=1;
		while (a!=0)
		{	i=a%10;
			S=S*10+i;
			a=a/10;
		}
		
		System.out.println("So dao nguoc la = "+S);
	}
	
	public static void main(String[] args)
	{	int i,j=2,k=5;
		int a,b,n;
		BCNN t1=new BCNN();
        a=NhapSoNguyen("nhap so a : ");
		b=NhapSoNguyen("nhap so b : ");
       	t1.BoiUoc(a,b);
		n=NhapSoNguyen("nhap so n : ");
		t1.DaoNguoc(n);
	
	}
}

//TrucLySE1408
