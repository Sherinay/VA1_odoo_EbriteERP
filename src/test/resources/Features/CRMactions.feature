Feature: Find CRM in Discuss page
  Background:
    Given the user is on the login page
    When the users enters the login information

  @CRM
  Scenario: create new column
    Given the user clicks on Add new Column tab
    When the user enters “Pending” column title name
    Then the user clicks on Kanban Config dropdown
    And the following options should be available

      | Fold            |
      | Edit Stage      |
      | Delete          |
      | Archive Records |
      | Restore Records |


#  Scenario: add new title in the column
#    Given the user has access to the plus sign in the new column
#    When the user enters “Bugbusters” to the title box
#    Then Click on Add And “Bugbusters” should be on the top of the column
#
#  Scenario: delete a column
#    Given the user clicks on Kanban Config dropdown
#    When the user clicks on Delete option from the list
#    Then “Are you sure that you want to remove this column ?” should be displayed
#    And Click OK And “Pending” column should not be displayed