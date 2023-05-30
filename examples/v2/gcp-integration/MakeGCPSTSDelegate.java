// Create a Datadog GCP principal returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GcpIntegrationApi;
import com.datadog.api.client.v2.model.GCPSTSDelegateAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);

    try {
      GCPSTSDelegateAccountResponse result = apiInstance.makeGCPSTSDelegate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GcpIntegrationApi#makeGCPSTSDelegate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}