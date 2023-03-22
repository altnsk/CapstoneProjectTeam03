Feature: Takımları listeleme, takım bilgilerini görüntüleme ve takım ekleme testleri

Background: Kullanici her senaryodan önce login olur, Account Management butonuna tıklar.
  Given Kullanıcı qa sayfasındadır.
  When Kullanici login olur.
  And Kullanici account management sayfasina gider.
  And Kullanici sayfadaki Teams butonuna tiklar

  Scenario: Kullanıcı takımlar bölümünde bulunan takımları liste halinde görüntüler
    Then Kullanıcının takımları görüntülediği doğrulanır

  Scenario:Kullanıcı takımlar bölümünde bulunan bir takıma tıklayarak bilgilerini görüntüler
      When Kullanici ilk tiklanabilir takıma tiklar
      Then Kullanıcı tıkladığı takımın bilgilerini detaylı olarak görür

  Scenario:Kullanıcı yeni bir takım ekler
        When Kullanıcı sayfada sağ üstte bulunan Add New Team butonuna tıklar
        And Kullanıcı çıkan sayfadaki boşluklara takım bilgilerini girer ve Save butonuna tıklar
        And Kullanici sayfadaki Teams butonuna tiklar
        Then Kullanıcı eklediği takımın listelenen takımlar arasında bulunduğunu görür





