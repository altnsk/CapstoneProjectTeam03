Feature: Kullanıcı edit işlemleri
  Background:Kullanici  Url sayfasina gider Login olup Account management tıklar
    Given  Kullanici Url ve login olur Account management tıklar

    @Positive
  Scenario: kullanıcı açılan sayfada edit e tıklar ve e-mail kısmının değişmediğni doğrular
    Given  açılan sayfada edit e tıklar
    When   e-mail kısmının değişmediğni doğrular
    Then   logout olur


      @Positive1
  Scenario: kullanıcı kriterlere uygun password girer ve parolanın değiştiğini dogrular
    Given  açılan sayfada Change Password
    When   kriterlere uygun password girer  confirm tusuna basar
    Then   parolanın değiştiğini doğrular


  @Negative
  Scenario Outline: Kullanıcı kriterlere uygun olmayan password girdiğinde uyarı yazısını görür
    Given kullanıcı cahange pasword tıklar
    And   kullanıcı "<pasword1>","<paswor2>" girer
    And   confirm butonuna tıklar
    Then  parolanın değişmediğini  dogrular cancel butonuna tıklar
    Examples:
      | pasword1               | paswor2                |  |
      | Abcde1.                | Abcde1.                |  |
      | 123456789Abcdefghklmn. | 123456789Abcdefghklmn. |  |
      | adcdefbh1.             | adcdefbh1.             |  |
      | Abcdefgh1              | Abcdefgh1              |  |
      | Abcdefgh.              | Abcdefgh.              |  |
      | ABCDEFGH1.             | ABCDEFGH1.             |  |
      | 1WVal0SlYWPd9uz.       | 1WVal0SlYWPd9uz.       |  |