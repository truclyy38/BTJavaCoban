
import java.io.*;
import java.util.Scanner;

public class tongle
{
	public static int NhapSoNguyen(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x=sc.nextInt();
        return x;
    }
	public void Sum(int a)
	{
		int S=0,i=1;
		while (i<=a)
		{
			S=i+S;i+=2;
		}
		
		System.out.print("Tong cac so le tinh den a = "+S);
	}
	
	public static void main(String[] args)
	{	int a;
		tongle t1=new tongle();
        a=NhapSoNguyen("nhap so a : ");
       	t1.Sum(a);
	}
}

//TrucLySE1408