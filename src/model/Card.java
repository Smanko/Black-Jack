package model;

public class Card {
	
	private Suite suite;
	private int value;
	
	public Card(Suite suite, int value){
		this.suite = suite;
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	
	public void setSuite(Suite suite) {
		this.suite = suite;
	}
	public Suite getSuite() {
		return suite;
	}
	
	@Override
	public String toString(){
		String str = "";
		switch(value){
			case 14: str+="A"; break;
			case 13: str+="K"; break;
			case 12: str+="Q"; break;
			case 11: str+="J"; break;
			case 10: str+="T"; break;
			default: str += value;
		}
		return str+suite;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((suite == null) ? 0 : suite.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (suite == null) {
			if (other.suite != null)
				return false;
		} else if (!suite.equals(other.suite))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
}
