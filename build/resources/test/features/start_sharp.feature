#Autor:

@Stories1
Feature: Start Sharp
  As a user, I want to create an Business Units and then create a meeting
  Background:
    Given than Jonatan wants to create an Business Units and then create a meeting
    And he go to login with his credentials
      |username   |password  |
      |admin      |serenity  |

  @Scenario1
  Scenario Outline: Create a Business Units
    And he go to the section Business Units
    When he is on the Star Sharp platform he will create a new Unit  filling all fields
    |name_unit    |parent_unit   |
    |<name_unit>  |<parent_unit> |
    Then he see the new <name_unit> on the tree

    Examples:
      |name_unit   |parent_unit |
      |UnitTest |Administration  |


  @Scenario2
  Scenario Outline: Create a new Meeting
    And now he go to the section Meeting
    When he will to create a new Meeting
      |name_meeting    |type_meeting   |number_meeting   |start_date    |end_date    |location   |unit   |organized_by   |reporter   |attendee_list   |start_hour  |end_hour   |
      |<name_meeting>  |<type_meeting> |<number_meeting> |<start_date>  |<end_date>  |<location> |<unit> |<organized_by> |<reporter> |<attendee_list> |<start_hour>|<end_hour> |
    Then he can see the new <name_meeting> on the tree
    Examples:
      |name_meeting |type_meeting |number_meeting |start_date |end_date   |location |unit|organized_by |reporter     |attendee_list |start_hour |end_hour |
      |DateJonatan |Team Weekly     |111111111111 |05/25/2022 |05/30/2022 |On Site  |RRHH |Adam Edwards | Austin Miller |Charles Davis  |15:00    |16:00    |
