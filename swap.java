import java.util.Scanner;
class swap{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n;
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("before swap:"+a+" "+b);
		n=a;
		a=b;
		b=n;
		System.out.println("after swap:"+a+" "+b);
		
	}
}