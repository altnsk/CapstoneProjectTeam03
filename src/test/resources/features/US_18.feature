Feature: US0018
  Background: Kullanici her senaryoda siteye gider
    Given Kullanici sayfaya gider login olur ve account managementa tiklar

  Scenario: Kullanıcı roller kisminda rolleri gormelidir
    When Kullanici rollere tiklar
    Then Kullanici rolleri gordugunu dogrular

