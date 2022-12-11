package factory_method.dialog;

import factory_method.button.Button;
import factory_method.button.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
