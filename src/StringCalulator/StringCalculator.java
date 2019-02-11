package StringCalulator;

public class StringCalculator {
	
	public static int splitAndSum(String text){
		if(Validation.isBlank(text))
			return 0;
		
		return new Tokens(text, makePattern()).sum();		
	}
	
	private static Pattern makePattern() {
		return new Pattern(",|:");
	}
}
