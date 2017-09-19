package practice;

class TooYoungException extends RuntimeException
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

TooYoungException(String s){
super(s);}
}
class Text
{
public static void main(String args[])
{
//int age=Integer.parseInt(br.readLine());
if(16<18)
{
throw new TooYoungException("too late");
}
else
{
	System.out.println("gopal");
}
}
}