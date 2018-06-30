
public class Multipleconditions {

	public static void main(String[] args) {
		int a=70;
		int  b=40;
		int c=30;
		int d=80;
		
		if(a>b && a>c && a>d)
		  System.out.println("a  is big");
		else if(b>c && b>d)
			System.out.println("b is big");
		else if(c>d)
			System.out.println("c  isbig");
		else  
			System.out.println("d is big");
	}
}
