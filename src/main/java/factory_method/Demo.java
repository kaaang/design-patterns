package factory_method;

import factory_method.dialog.Dialog;
import factory_method.dialog.HtmlDialog;
import factory_method.dialog.WindowsDialog;

import java.util.HashMap;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }


    HashMap test = new HashMap();
}
