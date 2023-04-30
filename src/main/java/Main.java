

import org.eclipse.swt.widgets.Display;

import org.eclipse.swt.widgets.Shell;

import org.eclipse.swt.widgets.Label;

import org.eclipse.swt.SWT;



public class Main {

    public static void main(String[] args)
    {

        Display display = new Display();
        Shell shell = new Shell(display);
        Label label = new Label(shell, SWT.CENTER);
        label.setText("Hello, World");
        label.setBounds(shell.getClientArea());
        shell.open();
        while (!shell.isDisposed())
        {
            if (!display.readAndDispatch())
            {
                display.sleep();
            }
        }
        display.dispose();
    }
}
