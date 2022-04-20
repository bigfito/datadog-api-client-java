import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
    String variableId = "variableId_example"; // String | The ID of the global variable.
    SyntheticsGlobalVariable body =
        new SyntheticsGlobalVariable(); // SyntheticsGlobalVariable | Details of the global variable
    // to update.
    try {
      SyntheticsGlobalVariable result = apiInstance.editGlobalVariable(variableId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#editGlobalVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}