// Update a webhook returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.WebhooksIntegrationApi;
import com.datadog.api.v1.client.model.WebhooksIntegration;
import com.datadog.api.v1.client.model.WebhooksIntegrationUpdateRequest;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi(defaultClient);

    // there is a valid "webhook" in the system
    String WEBHOOK_NAME = System.getenv("WEBHOOK_NAME");

    WebhooksIntegrationUpdateRequest body =
        new WebhooksIntegrationUpdateRequest().url("https://example.com/webhook-updated");

    try {
      WebhooksIntegration result = apiInstance.updateWebhooksIntegration(WEBHOOK_NAME, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}