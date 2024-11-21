package CH11_02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		String stringNow1 = now.toString();
		System.out.println(stringNow1);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String stringNow2 = simpleDateFormat.format(now);
		System.out.println(stringNow2);		

		Calendar now2 = Calendar.getInstance();  // 해당 서버 컴퓨터의 운영체제 시간
		
		System.out.println(now2.get(Calendar.YEAR));  //연도
		System.out.println(now2.get(Calendar.MONTH)+1);	 //월+1	
		System.out.println(now2.get(Calendar.DAY_OF_MONTH));		
		System.out.println(now2.get(Calendar.HOUR));		
		System.out.println(now2.get(Calendar.MINUTE));		
		System.out.println(now2.get(Calendar.SECOND));	

		System.out.println("------------------------------------");			
		Random random = new Random();
//		random.setSeed(0);
		random.setSeed(System.currentTimeMillis());		
		int lotto2 = random.nextInt(45)+1;
		System.out.println(lotto2);		
		double ran2 = random.nextDouble();
		System.out.println(ran2);			
		
		
		
		

	}

}
