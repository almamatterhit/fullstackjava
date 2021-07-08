package hit.day5;

public class ArithmeticDemo2 {
	public static void main(String[] args) {
		int i=10;
		//i=i+1  or i++/++i
		//i++   post increment
		//++i - pre increment
		//i=i-1  or i--/--i
		//i-- - post decrement
		//--i - pre decrement
		System.out.println("POST INCREMENT....");
		System.out.println(i);//print 10
		System.out.println(i++);//print 10 - in post increment - the i is printed first and incremented
		System.out.println(i);//print 11
		System.out.println("PRE INCREMENT.....");
		int k=100;
		System.out.println(k);//print 10
		System.out.println(++k);//print 101 - in pre increment - the k is incremented first and then printed
		System.out.println(k);//print 101
		
		System.out.println("POST DECREMENT....");
		int x=1000;
		System.out.println(x);//print 1000
		System.out.println(x--);//print 1000 - in post decrement - the x is printed first and incremented
		System.out.println(x);//print 999
		System.out.println("PRE DECREMENT.....");
		int y=2000;
		System.out.println(y);//print 2000
		System.out.println(--y);//print 1999 - in pre decrement - the y is incremented first and then printed
		System.out.println(y);//print 1999
	}
}
