package factory_method.dialog;

import factory_method.button.Button;
import factory_method.button.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
