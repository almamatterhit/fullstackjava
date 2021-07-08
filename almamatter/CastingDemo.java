package almamatter;

public class CastingDemo {
	public static void main(String[] args) {
		byte b=20;
		byte c=2;
		
		//byte d=b*c;//automatically gets promoted to int, when two bytes are used in a arithmetic operation
		
		int myint=b*c;
		
		System.out.println(myint);
		
		byte d=(byte)(b*c);//this is called as typecasting
		
		System.out.println(d);
		
		int myintvalue=257;
		byte mybitevalue=(byte)myintvalue;
		
		System.out.println(mybitevalue);//when u convert int to byte,  the value will be divided by 256 and the reminder is provided
		
		int blabla=b;
		
		float f=120.35f;
		
		int myintfloat=(int)f;
		System.out.println(myintfloat);
		
		f=myintvalue;//float can accept a integer..
		
		char ch='A';
		
		System.out.println((int)ch);
		
		System.out.println((char)169);
		
	}
}
