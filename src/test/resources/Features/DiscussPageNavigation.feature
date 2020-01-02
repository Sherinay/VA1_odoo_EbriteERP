Feature: Navigation to specific modules in Discuss page

  Scenario: Calendar module redirect
    Given user is logged in
    When the user clicks on “Calendar” module on the Discuss page
    Then the “Meetings – Odoo” page should be displayed
    And Week should be selected by default

  Scenario: CRM module redirect
    Given user is logged in
    When the user clicks on “CRM” module on the Discuss page
    Then the “Quotations– Odoo” page should be displayed
    And “Kanban, List, Graph, Pivot, CalendarKanban, List, Graph, Pivot, Calendar” buttons should be displayed

  Scenario: Events module redirect
    Given user is logged in
    When the user clicks on “Events” module on the Discuss page
    Then the “Events – Odoo” page should be displayed
    And 80 events should be displayed by default