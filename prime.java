import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class prime
{
	public static int NhapSoNguyen(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x=sc.nextInt();
        return x;
    }
	public void Checkprime(int n)
	{	int i,k=1;
		for(i=2;i<=Math.sqrt(n);i++) if (n%i==0) k=0;
		if (k==1) System.out.print(n+" la so nguyen to. ");
		else System.out.print(n+" khong la so nguyen to");
	}
	public static void main(String[] args)
	{	
		int n;
		prime t1=new prime();
        n=NhapSoNguyen("nhap so n : ");
		t1.Checkprime(n);
		
	}
}

//TrucLySE1408