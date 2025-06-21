package SingletonPatternExample;

public class Test {
	public static void main(String[] args) {
		Logger s1=Logger.getInstance();
		s1.log("first message");
		Logger s2=Logger.getInstance();
		s2.log("second message");
		System.out.println("Are both instances are same?"+(s1==s2));
			
		
		
		
	}

}
