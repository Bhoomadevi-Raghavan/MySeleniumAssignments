package week3.day1;

public class APIClient {

	public static void main(String[] args) {
		
		APIClient api = new APIClient();
		api.sendRequest("End Point");
		api.sendRequest("End Point2", "RequestBody", false);
	}
	public void sendRequest(String endpoint) {
		System.out.println("With one parameter: "+endpoint);

	}
public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
	System.out.println("With 3 parameters: "+endPoint+" "+requestBody+" "+requestStatus);

}
}
