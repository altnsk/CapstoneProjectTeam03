Feature: Is Displayed

    Scenario: Sonuclar goruntulenmelidir
        Given Kullanici siteye login olur
        When Kullanici  Business Owner a tiklar
        When Kullanici  Account Management a tiklar
        When Kullanici  Remote Unit a tiklar
        Then Listenin goruntulendigini check eder

