package com.example;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

  @Mock
  private Animal animal;
  
  @Test
  public void getEatTest() throws Exception  {
    List<String> expected = List.of("Животные", "Птицы", "Рыба");
    Mockito.when(animal.getFood("Хищник")).thenReturn(expected);
    Feline feline = new Feline();
    List<String> actual = feline.eatMeat();
    Assert.assertEquals(expected, actual);
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
