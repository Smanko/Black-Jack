package blackjack;

import model.Card;
import model.Hand;

import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;

class CardPaintListner implements PaintListener {
	
	private Hand h;

	public CardPaintListner(Hand h) {
	this.h = h;
}

	@Override
	public void paintControl(PaintEvent e) {
		GC gc = e.gc;
		int counter = 0;
		for (Card c : h.getHand()){
			String imgPath = ImageUtil.getImagePath(c);
			Image image = Activator.getImageDescriptor(imgPath).createImage();
			gc.drawImage(image, counter*ImageUtil.getCardWidth(), 0);
			image.dispose();
			counter++;
		}
	}
}