import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.AwsIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
    String accountId =
        "accountId_example"; // String | Only return AWS accounts that matches this `account_id`.
    String roleName =
        "roleName_example"; // String | Only return AWS accounts that matches this role_name.
    String accessKeyId =
        "accessKeyId_example"; // String | Only return AWS accounts that matches this
    // `access_key_id`.
    try {
      AWSAccountListResponse result =
          apiInstance.listAWSAccounts(
              new AwsIntegrationApi.ListAWSAccountsOptionalParameters()
                  .accountId(accountId)
                  .roleName(roleName)
                  .accessKeyId(accessKeyId));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#listAWSAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}