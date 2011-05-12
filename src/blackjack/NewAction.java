package blackjack;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

public class NewAction extends Action implements ISelectionListener, IWorkbenchAction {

	private static final String ID = "BlackJack.new";
	private IWorkbenchWindow window;

	public NewAction(IWorkbenchWindow window){
		this.window = window;
		setId(ID);
		setActionDefinitionId(ID);
		setText("New game");
		setToolTipText("New game");
		window.getSelectionService().addSelectionListener(this);
	}
	
	@Override
	public void run() {
		window.getActivePage().close();
		try {
			window.openPage(null);
		} catch (WorkbenchException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void dispose() {
		window.getSelectionService().removeSelectionListener(this);
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
	}

}
