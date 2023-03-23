Feature: Testing Google Search Functionality
  #is a general description
  Scenario: Happy Path(positive) Testing for Search
    #scenario is a test case

    Given User navigates to the Google
    When User searches for Codefish
    Then User gets more than ten links on the first page

   Scenario:Happy Path(positive) Testing Result from Search
     #scenario is a test case
     Given User navigates to the Google
     When User search for Kyrgyz food in USA
     Then User validate the result


     Scenario: Happy Path(positive)Testing SearchTime from Search
       Given User navigates to the Google
       When  User searches for Turkish Baklava
       Then User validates search is done less than one second
