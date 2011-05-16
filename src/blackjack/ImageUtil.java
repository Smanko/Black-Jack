package blackjack;

import model.Card;

public class ImageUtil {
	
	private static final int cardWidth = 71;
	private static final int cardHeight = 96;
	
	public static String getImagePath(Card c){
		String path = "/icons/";
		path += c.getSuite().toString().toLowerCase();
		switch(c.getValue()){
			case 14: path += "1"; break;
			case 13: path += "k"; break;
			case 12: path += "q"; break;
			case 11: path += "j"; break;
			default: path += c.getValue();
		}
		path += ".png";
		return path;
	}

	public static int getCardHeight() {
		return cardHeight;
	}

	public static int getCardWidth() {
		return cardWidth;
	}
}
