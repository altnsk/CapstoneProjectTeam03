Feature: Departman ekleme

  @US_8.TC_1
  Scenario: US_8 Departman ekler

    Given Kullanici URL ye gider
    When  Kullanici login olur
    When  Kullanici Account Management e tiklar
    When  Kullanici Departman Bolumune gider
    When  Kullanici Add New Departman butonuna tiklar
    When  Kullanici Departman name girer
    When  Kullanici Departman type girer
    When  Kullanici Save butonuna tiklar
    Then  Kullanici Departman eklendigini kontrol eder



      @US_8.TC_2

      Scenario: US_8 Departman type in zorunlu oldugunu goruntuler

        Given Kullanici URL ye gider
        When  Kullanici login olur
        When  Kullanici Account Management e tiklar
        When  Kullanici Departman Bolumune gider
        When  Kullanici Add New Departman butonuna tiklar
        When  Kullanici Departman name girer
        When  Kullanici Save butonuna basar
        Then  Kullanici Please select a type for department yazisini dogrular

  @US_8.TC_3
  Scenario: US_8 Departman name in zorunlu oldugunu goruntuler

    Given Kullanici URL ye gider
    When  Kullanici login olur
    When  Kullanici Account Management e tiklar
    When  Kullanici Departman Bolumune gider
    When  Kullanici Add New Departman butonuna tiklar
    When  Kullanici Departman name bos birakir
    When  Kullanici Departman type girer
    When  Kullanici Save butonuna basar
    Then  Kullanici Please enter a name for department yazisini dogrular

