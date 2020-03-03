import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Ptb2
{
	public static int Input(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x=sc.nextInt();
        return x;
    }
	public void GiaiPtb2()
	{	int a,b,c;
		double delta,x,y;
		do{
		System.out.println("Nhap cac he so, voi a khac khong:");
		a=Input("nhap he so a : ");
        b=Input("nhap he so b : ");
		c=Input("nhap he so c : ");
		} while (a==0);
		delta=Math.pow(b,2)-4*a*c;
		
        if (delta<0) 
			System.out.println("Phuong trinh vo nghiem :( ");
		if (delta==0) 
			{	x=-b/(2*a);
				System.out.println("Phuong trinh co nghiem kep"+"x1 = x2 ="+x);}
			
		if (delta>0) 
			{x=(-b+Math.sqrt(delta))/(2*a);
			 y=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("Phuong trinh co nghiem  x1 = "+x);
			System.out.println("Phuong trinh co nghiem  x1 = "+y);}
		
		}
	public static void main(String[] args)
	{
		Ptb2 pt1=new Ptb2();
		pt1.GiaiPtb2();
	}
}
//TrucLySe1408