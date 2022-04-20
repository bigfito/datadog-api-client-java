import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.AzureIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);
    AzureAccount body =
        new AzureAccount(); // AzureAccount | Delete a given Datadog-Azure integration request body.
    try {
      Object result = apiInstance.deleteAzureIntegration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AzureIntegrationApi#deleteAzureIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}