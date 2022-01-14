package day38_Inheritance_MethodOverriding.Browser;

public class SafariBrowser extends Browser {
    @Override
    public void openBrowser() {
        System.out.println("opening Safari browser");;
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Safari browser");;
    }
}
