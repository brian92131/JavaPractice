
public class SetBitInByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte myByte = 6;
		int bit = 6;
		System.out.println(Integer.toBinaryString(myByte));
		System.out.println(Integer.toBinaryString(1 << bit));
		myByte = (byte) (myByte | (1 << bit));
		System.out.println(Integer.toBinaryString(myByte));
	}

}
