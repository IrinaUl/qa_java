package com.example;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FelineTests {
  
  @Test
  public void getEatTest() throws Exception  {
    Feline feline = new Feline();
    List<String> eat = feline.eatMeat();
    List<String> expected = List.of("Животные", "Птицы", "Рыба");
    Assert.assertEquals(expected, eat);
  }

  @Test
  public void getFamilyTest() {
    Feline feline = new Feline();
    Assert.assertEquals("Кошачьи", feline.getFamily());
  }

  @Test
  public void getKittensNoArgumentTest() {
    Feline feline = new Feline();
    Assert.assertEquals(1, feline.getKittens());
  }

  @Test
  public void getKittensWithArgumentTest() {
    Feline feline = new Feline();
    Assert.assertEquals(3, feline.getKittens(3));
  }
}
