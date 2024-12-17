// Deploy App returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppDeploymentApi;
import com.datadog.api.client.v2.model.DeployAppResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deployApp", true);
    AppDeploymentApi apiInstance = new AppDeploymentApi(defaultClient);

    // there is a valid "app" in the system
    String APP_DATA_ID = System.getenv("APP_DATA_ID");

    try {
      DeployAppResponse result = apiInstance.deployApp(APP_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppDeploymentApi#deployApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}