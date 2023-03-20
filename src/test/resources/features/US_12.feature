Feature: Edit the units displayed in the Remote Unit module.

  Scenario: Sonuclar goruntulenmelidir
    Given Kullanici ayni adimlari yaparak remote sayfasina gelir
    When  Listelenenlerden ilkine tiklar
    And   Edit Remote Unit e tiklar
    And   Delete Department a tiklar
    Then  Cikan pop up i onaylar