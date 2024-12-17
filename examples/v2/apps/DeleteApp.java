// Delete App returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppsApi;
import com.datadog.api.client.v2.model.DeleteAppResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteApp", true);
    AppsApi apiInstance = new AppsApi(defaultClient);

    // there is a valid "app" in the system
    String APP_DATA_ID = System.getenv("APP_DATA_ID");

    try {
      DeleteAppResponse result = apiInstance.deleteApp(APP_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#deleteApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}