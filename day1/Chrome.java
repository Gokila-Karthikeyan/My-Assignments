package week3.day1;


public class Chrome extends Browser{

	public void openIncognito() {
        System.out.println("Opening incognito mode");
    }

     public void clearCache() {
        System.out.println("Clearing cache");
    }
     public static void main(String[] args) {
    	 Chrome p = new Chrome();
    	 p.openURL();
    	 p.closeBrowser();
    	 p.navigateBack();
    	 p.openIncognito();
    	 p.clearCache();
    	 }
	

}
