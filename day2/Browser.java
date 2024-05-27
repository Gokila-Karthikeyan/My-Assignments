package week1.day2;

public class Browser {
	public static void main(String[] args) {
		Browser obj = new Browser();
		obj.launchBrowser(null);
        obj.loadUrl();
	}

	public String launchBrowser(String chrome)
	{
		System.out.println("Browser launched successfully");
		return chrome;

	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

}
