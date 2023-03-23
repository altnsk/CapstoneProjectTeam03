Feature: Departman Gunceleme




  Scenario: US_009 Departman ismini ve typeni degistiririr


    Given Kullanici URL ye gider
    When  Kullanici login olur
    When  Kullanici Account Management e tiklar
    When  Kullanici Departman Bolumune gider
    When  Kullanici Departman secer
    And   Kullanici Edit Departman butonuna tiklar
    When  Kullanici Departman name degistirir
    When  Kullanici Departman type girer
    When  Kullanici Save butonuna tiklar
    Then  Kullanici Departman isminin degistigini dogrular


  Scenario: US_009 Departmani siler


    Given Kullanici URL ye gider
    When  Kullanici login olur
    When  Kullanici Account Management e tiklar
    When  Kullanici Departman Bolumune gider
    When  Kullanici Departman secer
    And   Kullanici Edit Departman butonuna tiklar
    And   Kullanici delete butonunu tiklar
    When  Kullanici acilan onay penceresinden tamam butonu tiklanir
    Then  Kullanici departmanin silindigi dogrular



