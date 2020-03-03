
import java.io.*;
import java.util.Scanner;

public class chuSo
{
	public static int NhapSoNguyen(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x=sc.nextInt();
        return x;
    }
	public void Tinh(int a)
	{
		int S=0,P=1,i=1;
		while (a!=0)
		{	i=a%10;
			S=S+i;
			P=P*i;
			a=a/10;
		}
		
		System.out.println("Tong cac chu so = "+S);
		System.out.print("Tich cac chu so = "+P);
	}
	
	public static void main(String[] args)
	{	int a;
		chuSo t1=new chuSo();
        a=NhapSoNguyen("nhap so a : ");
       	t1.Tinh(a);
	}
}

//TrucLySE1408