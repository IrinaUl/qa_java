package com.example;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FelineTests {

  @Test
  public void getEatTest() throws Exception  {
    List<String> expected = List.of("Животные", "Птицы", "Рыба");
    Feline feline = new Feline();
    Assert.assertEquals(expected, feline.eatMeat());
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
    Assert.assertEquals(5, feline.getKittens(5));
  }
}
