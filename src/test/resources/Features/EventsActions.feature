Feature: Find Events module in Discuss page

  Scenario: checkboxes are clickable
    Given the user has access to Event Categories under Event module
    When click on Event Categories
    Then 26 events should be displayed
    And all the checkboxes are clickable

  Scenario: edit Wedding event in the list
    Given user is already on Wedding in the event list
    When user click on Edit and check Online Event option
    And uncheck Automatically Confirm Registrations
    Then US/Eastern should be selected in TimeZone box
    And click Save