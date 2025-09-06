
Feature: Booking Appointments in the JQuery UI Datepicker

  Background:
    Given that user wants to book an appointment

  Scenario: Booking an appointment by selecting a date from the calendar
    When he selects the 15th of the current month
    Then should see the selected date in the text field


  Scenario: Select a specific date in a different month
    When user selects the date '10' of the next month
    Then selected date should be displayed in the text field

  Scenario: Validate disabled field
    When try entering a date manually in the text field
    Then the field should not allow manual input and be read-only