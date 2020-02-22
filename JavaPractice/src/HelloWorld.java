
public class HelloWorld {

	public static void main(String[] args) {

	}
	
    public native void displayHelloWorld();

    static {
        System.loadLibrary("hello");
    }

}
