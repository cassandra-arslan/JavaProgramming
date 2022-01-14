package day38_Inheritance_MethodOverriding.Browser;

public class OperaBrowser extends Browser{
    @Override
    public void openBrowser() {
        System.out.println("opening Opera browser");;
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Opera browser");;
    }
}
