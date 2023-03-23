Feature: Departman dogrular

  Scenario: US_7 Kullanici departman bolumune gider ve departmanlari kontrol eder

    Given Kullanici URL ye gider
    When  Kullanici login olur
    When  Kullanici Account Management e tiklar
    When  Kullanici Departman Bolumune gider
    Then  Kullanici butun departmanların goruntulendigini kontrol eder
