package week3.day1;

public class ReportGenerator {
	public void reportStep(String msg, String status) {
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
    }
    public void reportStep(String msg, String status, boolean snap) {
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
        System.out.println("Snapshot Taken: " + snap);
    }
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        generator.reportStep("Step 1 completed", "Pass");
        generator.reportStep("Step 2 completed", "Fail", true);
    }

}
