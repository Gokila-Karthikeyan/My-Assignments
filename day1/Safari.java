package week3.day1;

public class Safari extends Edge{
	public void readerMode() {
        System.out.println("Entering reader mode");
    }

    public void fullScreenMode() {
        System.out.println("Entering full screen mode");
    }
    public static void main(String[] args) {
		Safari f=new Safari();
		f.takeSnap();
		f.clearCookies();
		f.fullScreenMode();
		f.readerMode();
	}

}
