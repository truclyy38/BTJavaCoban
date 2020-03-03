//TrucLySE1408
import java.io.*;
import java.util.Scanner;

public class Karaoke
{
	public static int Input(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x=sc.nextInt();
        return x;
    }
	public void TinhTien(int a,int b)
	{	
		if(b<18)
		{
			System.out.print("Tong Tien la "+(b-a)*45000+" dong");
		}else{
			System.out.print("Tong Tien la "+(b-a)*60000+" dong");
		}
	}
	
	public static void main(String[] args)
	{	int a,b,c;
		Karaoke t1=new Karaoke();
        a=Input("Nhap gio bat dau : ");
        b=Input("Nhap gio ket thuc : ");
       	//Tinh tien Karaoke
		t1.TinhTien(a,b);
	}
}
//TrucLySE1408