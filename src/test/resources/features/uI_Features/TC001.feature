
@TC001
Feature: US 01 ebebek sitesinde biberon urun arama, sepete ekleme
  Scenario: TC 001 ebebek sitesinde bibero arama,sepete ekleme

    Given Ana sayfa acilir
    And   Arama cubuguna biberon yazilir
    And   Arama yapilir
    And   Ilk urune tiklanir
    And   Sepete Ekle butonuna tiklanir
    And   Sepeti Gor butonuna tiklanir.
    And   Urunun sepete eklendigi kontrol edilir.