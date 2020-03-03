
import java.io.*;
import java.util.Scanner;

public class gtk
{
	public static int NhapSoNguyen(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x=sc.nextInt();
        return x;
    }
	public void GiaiThuaKep(int n)
	{	int i,P=1,k;
		k=(n%2==1)?1:2; 
			//k=2-n%2;
		for(i=k;i<=n;i+=2) P*=i;
		
		System.out.println("Giai Thua Kep La = "+P);
	}
	
	
	public static void main(String[] args)
	{	
		int n;
		gtk t1=new gtk();
        n=NhapSoNguyen("nhap so n : ");
		t1.GiaiThuaKep(n);
		
	
	}
}

//TrucLySE1408