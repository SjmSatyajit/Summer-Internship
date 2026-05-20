package Com.ProgrammingPractice;

public class DataTypeSizeRange {
	
	public void DisplaySizeAndRange() {
		
		System.out.println("Primitive Data Type Size And Range:");
        // byte
        System.out.println("byte    : size = "+Byte.SIZE+" bits, range = "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        // short
        System.out.println("short    : size = "+Short.SIZE+" bits, range = "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        // int
        System.out.println("int    : size = "+Integer.SIZE+" bits, range = "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        // long
        System.out.println("long    : size = "+Long.SIZE+" bits, range = "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        // float 
        System.out.println("float    : size = "+Float.SIZE+" bits, range = "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
        // double
        System.out.println("double    : size = "+Double.SIZE+" bits, range = "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
        // char (unsigned 16-bit Unicode)
        System.out.println("char    : size = "+Character.SIZE+" bits, range = "+(int) Character.MIN_VALUE+" to "+(int) Character.MAX_VALUE+" (Unicode code points)");
        // boolean 
        System.out.println("boolean    : size = JVM dependent (typically 1 bit or 1 byte)");
        System.out.println("           range = false / true (logical values)");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTypeSizeRange dsr = new DataTypeSizeRange();
		
		dsr.DisplaySizeAndRange();
		
	}
}
