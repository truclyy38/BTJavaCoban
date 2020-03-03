package baitapjavavenha;

public class PHUONGTRINHBACNHAT {

	public static void main(String[] args) {
		int a; 
		int b;
		a=Nhapsonguyen("nh?p h? s? a :");
		b=Nhapsonguyen("Nh?p h? s? b :");
		GiaiPTbac1(a,b);
	}
 public static int nhapsonguyen(string str)
 {
	 int x;
	 tinhtoan tt=new tinhtoan(System.int);
	 System.out.println(str);
	 x=tt.nextInt();
	 return x;
 }
 public static void GiaiPTbac1(int a, int b)
 {
	 if (a==0)
	 {
		 if(b==0)
			 System.out.println("phuong trình vô s? nghi?m");
		 else
			 System.out.println("phuong trình vô nghi?m");
	 }
	 else
		 System.out.println("phuong trình có nghi?m x=:"+(-b/a));
 }
}