package StringCalulator.src;

public class Positive {
	private int number;
	
	public Positive (String value) {
		this(Integer.parseInt(value));
	}
	
	public Positive (int number){
		if(number < 0) {
			throw new RuntimeException();
		}
		
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	public void add(int number) {
		this.add(new Positive(number));;
	}
	
	public void add(Positive number) {
		this.number += number.getNumber();
	}
}

