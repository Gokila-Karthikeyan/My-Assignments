package week3.day2;

public class TestClass {
	public static void main(String[] args) {
        TestData testData = new TestData();
        LoginTestData loginTestData = new LoginTestData();
        testData.enterCredentials("user123", "pass456");
        loginTestData.enterUsername("user456");
        loginTestData.enterPassword("pass789");
    }

}
