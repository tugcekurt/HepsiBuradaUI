Feature: AddBookInBasket

  Scenario Outline: AddProduct
    Given user is on HomePage
    When user click Login button
    And user enter email "<email>" and enter  password "<password>"
    And user click GirisYap button
    When user search "kitap" on searchbox
    Then user check books are listed
    When user select any book on list
    Then user seen productDetail
    When user click SepeteEkle button and go to Sepetim
    Then user seen product in basket
    When user click Alısverisi Tamamla button
    Then user seen  Delivery Page
    When user click DevamEt button
    Then user seen PaymentPage
    When user click Havale
    And user select bank and click DevamEt button
    And user select sipais sonrası odeme option

    Examples:
      | email | password |
      |seleniumautomationhepsiburada@gmail.com  |hepsi987.  |