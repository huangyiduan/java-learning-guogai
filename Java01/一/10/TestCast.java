/**
*测试自动转型和强制转型
*/
public class TestCast {
	public static void main(String[] args) {
		/*byte b1 = 123;
		//byte b2 = 129;      //此时超出了-128-127范围
		//char c1 = -3;		  //不再0-65536之间，也会报错。

		char c = 'a';
		int i = c;    			 //此时是可以自动转换的

		long d01 = 123451;
		float f1 = d01;        //此时是可以转的，这里只是表述容量范围，并不是本身字节数的大小
		*/

		//强制转型
		int ii = 100;
		//int ii = -100;
		char c1 = (char)ii;
		System.out.println(c1);   //100在ASCLL中表示d  //当将一种类型强制转换为另一类型时，而又超出了目标类型的表示范围，则可以编译通过，但是没有意义

		//表达式中类型提升问题

		int a = 3;
		long b = 123;
		double d = 5.3;
		int c = (int)(a + b);			//此时会报错，会向容量大的long提升，要想不报错，则 需要强制类型转换，
		float f = (float)(a + d);       //也需要强制类型转换

		int money = 1_000_000_000;   

		int years = 20;

		long total = (long)money * years;     //此时会返回负数，因为已经溢出。需要强制转型为更大的long,需要注意的是不能(long)(money * years)

		System.out.println(total);

		/**
		*一个人70年心跳次数
		*/
		long times = 70L*60*24*365*70;
		System.out.println(times);


	}
}