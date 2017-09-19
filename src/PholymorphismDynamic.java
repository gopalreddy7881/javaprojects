package practice;

public class PholymorphismDynamic {
	
	public static void main(String[] args) {
		Polus p=new Polus();;
		p.sum("gopal");
	}

}

class Poly{
	int a,b;
	public void sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+" " +b);
	}
}
class Polus extends Poly
{
 String s;
 public void sum(String s)
 {
	 this.s=s;
	 System.out.println("weocme"    +s);
 }
}