import java.io.ObjectInput;

public class Sample1 implements ObjectInput {

	Sample1() {
		super();
	}
	
	public void close() {
		System.out.println("In Close()....");
	}

	public int available() {
		return 1;
	}

	public static void main(String a[]) {
		System.out.println("In Main....");
	}
}