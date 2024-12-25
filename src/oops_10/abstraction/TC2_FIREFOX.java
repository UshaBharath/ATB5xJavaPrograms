package src.oops_10.abstraction;

public class TC2_FIREFOX extends BaseClass {
    @Override
    String openBrowser() {
        System.out.println("opening firefox");
        return "";
    }

    @Override
    String closeBrowser() {
        System.out.println("closing firefox");
        return "";
    }
}
