Feature: Takımlar Bölümünde Güncelleme ve Silme Testi

  Background: Kullanici her senaryodan önce login olur ve takımları düzenleme sayfasına gelir.
    Given Kullanıcı qa sayfasındadır.
    When Kullanici login olur.
    When Kullanici account management sayfasina gider.
    When Kullanici sayfadaki Teams butonuna tiklar
    When Kullanici ilk tiklanabilir takıma tiklar
    When Kullanici sayfanin sag bolumundeki Edit Team butonuna tiklar

    Scenario: Kullanıcı takımlar bölümünde bulunan takımların birini seçerek bilgilerinde değişiklik yapar
      When Kullanıcı çıkan sayfadaki boşluklara takım bilgilerini girer ve Save butonuna tıklar
      Then Kullanici takim bilgilerindeki değisiklikleri goruntuler

  Scenario: Kullanıcı takımlar bölumünde bulunan takımlardan birisin seçerek siler.
    When Kullanici sayfanin sol kismindaki Delete Department butonuna tiklar.
    When Kullanici sayfada  goruntulenen Alert Mesajinda Tamam butonuna tiklar.
    When Kullanici sayfadaki Teams butonuna tiklar
    Then Kullanici sildiği takimin sayfada bulunmadiğini görüntüler.





















