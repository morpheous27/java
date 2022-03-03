
public class ByteOperations {

	public static void main(String[] args) {
		byte b = 10;
		b += 1;
		b = (byte) ((byte) b + 1);
		System.out.println(b);

		checkBbyteSize();

	}

	int multiply(byte a, byte b){
		return a * b;
	}

	static void checkBbyteSize(){
		byte b = (byte) 129;
		System.out.println(b);
	}


}
