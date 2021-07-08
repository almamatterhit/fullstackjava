package hit.day5;

public class CastingDemo {
	public static void main(String[] args) {
		//number,floats,character,boolean
		
		//numbers
		//lower stored in higher...compatible types...
		byte b=10;//8 bit
		short s=b;//16 bit
		int i=s;//32 bit
		long l=i;//64 bit
		
		//reverse - higher getting stored in lower...
		
		long ll=257;//64 bit
		System.out.println("long value..:"+ll);
		int ii=(int)ll;//32 bit
		System.out.println("int value...:"+ii);
		short ss=(short)ii;//16 bit
		System.out.println("short value...:"+ss);
		byte bb=(byte)ss;//8 bit
		System.out.println("byte value....:"+bb);
		//when we reverse cast i.e higher to lower - we loose precision...
		
		//FLOATING NUMBERS
		//float f=12.45f;//32 bit
		double d=23.45;//64 bit
		System.out.println("double value..:"+d);
		float f=(float)d;
		System.out.println("float value..:"+f);
		
		int myint=(int)f;
		System.out.println(myint);//decimals are lossed
		
		int myascii=169;
		char mychar=(char)myascii;
		System.out.println((char)169);
		System.out.println(mychar);
		
		int mmm=0;
		System.out.println(mmm);
	}
}
