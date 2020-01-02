Feature: Find Events module in Discuss page

  Scenario: checkboxes are clickable
    Given the user has access to Event Categories under Event module
    When click on Event Categories
    Then 26 events should be displayed
    And all the checkboxes are clickable

  Scenario: edit Wedding event in the list
    Given click on Wedding in the event list
    When Wedding – Odoo should be the page title
    Then click on Edit And check Online Event option
    And uncheck Automatically Confirm Registrations And US/Eastern should be selected in TimeZone box And click Save