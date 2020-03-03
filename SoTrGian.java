//TrucLySE1408
import java.io.*;
import java.util.Scanner;

public class SoTrGian
{
	public static int NhapSoNguyen(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x=sc.nextInt();
        return x;
    }
	public void TimSTG(int a,int b,int c)
	{
		int STG=0;
		if (b>a && b<c) STG=b;
		if(a<c)
		{if (b>c)  STG=c;
		 if (b<a)  STG=a;}
		else 
		{if (b>a)  STG=a;
		 if (b<c)  STG=c;}
		
		System.out.print("So Trung Gian = "+STG);
	}
	
	public static void main(String[] args)
	{	int a,b,c;
		SoTrGian t1=new SoTrGian();
        a=NhapSoNguyen("nhap so a : ");
        b=NhapSoNguyen("nhap so b : ");
        c=NhapSoNguyen("nhap so c : ");
       	//Tim So Trung Gian
		t1.TimSTG(a,b,c);
	}
}
//TrucLySE1408