package week3.day1;

public class Edge extends Chrome {

	 public void takeSnap() {
        System.out.println("Taking a snap");
    }

    public void clearCookies() {
        System.out.println("Clearing cookies");
    }
    public static void main(String[] args) {
		Edge s=new Edge();
		s.openIncognito();
		s.clearCache();
		s.takeSnap();
		s.clearCache();
		
	}
}
