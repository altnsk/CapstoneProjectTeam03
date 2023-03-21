Feature: Yeni Remote Unit ekleyebilmelidir

  Scenario: Sonuclar goruntulenmelidir
    Given Kullanici siteye login olur
    When Kullanici  Business Owner a tiklar
    When Kullanici  Account Management e tiklar
    When Kullanici  Remote Unit e tiklar
    And Add New Remote Unite tiklar
    And Isim ve departman girer
    Then Kayit edildigini check eder




