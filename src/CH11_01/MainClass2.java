package CH11_01;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1 = Math.abs(-10);
		System.out.println(a1);
		double a2 = Math.ceil(3.14);
		System.out.println(a2);		
		double a3 = Math.floor(3.14);
		System.out.println(a3);			
		double a4 = Math.round(3.14);
		System.out.println(a4);	
		
		System.out.println(Math.random());			
		
		int a5 = (int)(Math.random()*10)+1;
		System.out.println(a5);	
		int lotto = (int)(Math.random()*45)+1;
		System.out.println(lotto);		
		
		
		int b1 = (int)(4.56);
		System.out.println(b1);	
	}

}
