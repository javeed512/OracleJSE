package demo;

public class StringAPIs {

	public static void main(String[] args) {

		String s1 = "hello";
		
		String s2 = "hello";
		
		
		s1 = s1.concat(s2);
		
		s1 =  s1 + "friends";
		
		System.out.println("s1 and s2 values "+s1.equals(s2));
		
		System.out.println("s1 and s2 references "+ (s1 == s2));
		
		String  s3 = new String("hello");
		String  s4 = new String("hello");
		
		s3 = s3.concat(s4);
		
		System.out.println(s3); //s3.toString();
		
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		
		System.out.println(s3.hashCode() == s4.hashCode());
		
		
		StringBuffer sb1 = new StringBuffer("hello");
		
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer("hello");
		
			sb1.append(sb2);
			
			System.out.println(sb1);
			
			sb1.reverse();
			System.out.println(sb1);
	}

}
