import java.io.Console;

public class showVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version = System.getProperty("java.version");
		String vendor = System.getProperty("java.vendor");
		System.out.println(vendor);
		System.out.println(version);
        System.out.println("PPIU-Lab1");
	}

}
