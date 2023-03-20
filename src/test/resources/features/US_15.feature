@us015
Feature: Kullanici, kullanici modulundeki kullanicilari goruntuler.
  Background: Kullanici URL e gider ve login olarak User Module gider.
    Given Kullanici Base URL e gider "https://qa-gm3.quaspareparts.com"
    When Kullanıcı login olur
    And Kullanici Account Management e Tiklar.
    Then  Kullanici Users Modul e gider.



  @addedUsers
    Scenario: Kullanici, yeni eklenen kullanicilari gorebilmelidir.

      Then Kullanici yeni eklenen kullanicilarin goruldugunu dogrular.

 @greenTick
    Scenario: Kullanici, emaili onaylanmis kullanicilarda yesil tik gormelidir.

     Then Kullanici,emaili onaylanmis kullanicilarda yesil tik goruldugunu dogrular.