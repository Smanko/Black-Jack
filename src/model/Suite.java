package model;

public enum Suite {
	HEARTS("H"), DIAMONDS("D"), SPADES("S"), CLUBS("C");
	
	private String suite;
	
	Suite(String suite){
		this.suite = suite;
	}
	
	@Override
	public String toString(){
		return suite;
	}
}
