Feature: US0019

  Background: Kullanici her senaryoda sayfaya gider
    Given Kullanici sayfaya gider login olur ve account managementa tiklar

  Scenario:Kullanıcı rollerin tıklanabilir olduğunu doğrular
    When Kullanici rol sekmesine tiklar
    Then Kullanici rollerin herbirinin tiklanilabilir oldugunu dogrular
