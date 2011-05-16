package blackjack;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class MessageDialog extends Dialog{

	private String mess;
	
	public MessageDialog(Shell parent, String mess) {
		super(parent);
		this.mess = mess;
	}

	protected Control createDialogArea(Composite parent) {
		Text text = new Text(parent, SWT.MULTI);
		text.setEditable(false);
		text.setText(mess);
		return parent;
	}
}
