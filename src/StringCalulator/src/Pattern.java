package StringCalulator.src;

public class Pattern {
	private StringBuilder patternBuilder; 
	
	public Pattern(String text){
		this.patternBuilder = new StringBuilder();
		this.patternBuilder.append(text);
	}
	
	@Override
	public String toString() {
		return patternBuilder.toString();
	}
}