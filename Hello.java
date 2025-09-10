
public class Hello {
	public static void main(String[] args){
		String name = System.getenv("USERNAME_VAR");
		if (name != null){
			System.out.println("Hello, " + name);
		}
		else{
			System.out.println("Environment variables not set!");
		}
	}
}

