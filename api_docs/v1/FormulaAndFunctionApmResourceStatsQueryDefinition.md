

# FormulaAndFunctionApmResourceStatsQueryDefinition

APM resource stats query using formulas and functions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataSource** | **FormulaAndFunctionApmResourceStatsDataSource** |  | 
**env** | **String** | APM environment. | 
**groupBy** | **List&lt;String&gt;** | Array of fields to group results by. |  [optional]
**name** | **String** | Name of this query to use in formulas. | 
**operationName** | **String** | Name of operation on service. |  [optional]
**primaryTagName** | **String** | Name of the second primary tag used within APM. Required when &#x60;primary_tag_value&#x60; is specified. See https://docs.datadoghq.com/tracing/guide/setting_primary_tags_to_scope/#add-a-second-primary-tag-in-datadog |  [optional]
**primaryTagValue** | **String** | Value of the second primary tag by which to filter APM data. &#x60;primary_tag_name&#x60; must also be specified. |  [optional]
**resourceName** | **String** | APM resource name. |  [optional]
**service** | **String** | APM service name. | 
**stat** | **FormulaAndFunctionApmResourceStatName** |  | 


