package StringCalulator;

public class Tokens {
	private String[] tokens;
	
	public Tokens(String text, Pattern pattern){
		tokens = split(text, pattern);
	}

	private String[] split(String text, Pattern pattern) {
		return text.split(pattern.toString());
	}
	
	public int sum() {
		Positive result = new Positive(0);
		
		for (String value : this.tokens) {
			result.add(new Positive(value));
		}
		
		return result.getNumber();
	}
}
