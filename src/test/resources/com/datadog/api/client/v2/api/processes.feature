@endpoint(processes) @endpoint(processes-v2)
Feature: Processes
  The processes API allows you to query processes data for your
  organization. See the [Live Processes
  page](https://docs.datadoghq.com/infrastructure/process/) for more
  information.

  Background:
    Given a valid "apiKeyAuth" key in the system
    And a valid "appKeyAuth" key in the system
    And an instance of "Processes" API
    And new "ListProcesses" request

  @generated @skip @team:DataDog/container-experiences
  Scenario: Get all processes returns "Bad Request" response
    When the request is sent
    Then the response status is 400 Bad Request

  @team:DataDog/container-experiences
  Scenario: Get all processes returns "OK" response
    Given request contains "search" parameter with value "process-agent"
    And request contains "tags" parameter with value "testing:true"
    And request contains "page[limit]" parameter with value 2
    When the request is sent
    Then the response status is 200 OK

  @replay-only @skip-validation @team:DataDog/container-experiences @with-pagination
  Scenario: Get all processes returns "OK" response with pagination
    Given request contains "page[limit]" parameter with value 2
    When the request with pagination is sent
    Then the response status is 200 OK
    And the response has 3 items
