package assignment.week3;

public class APIClient {
	public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request body: " + requestBody);
        System.out.println("Request status: " + requestStatus);
    }
    public static void main(String[] args) {
        APIClient apiClient = new APIClient();
        apiClient.sendRequest("http://leaftaps.com/opentaps/main");
        apiClient.sendRequest("http://leaftaps.com/opentaps/control/main", "TESTLEAF", true);
    }

}
