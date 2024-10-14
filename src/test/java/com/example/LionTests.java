package com.example;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

  @Mock
  private Feline feline;

  @Test
  public void checkGetFood() throws Exception {
    Lion lion = new Lion(feline);
    List<String> expected = List.of("Животные", "Птицы", "Рыба");
    Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
    Assert.assertEquals(expected, lion.getFood());
  }

  @Test
  public void checkKittens() throws Exception {
    Mockito.when(feline.getKittens()).thenReturn(3);
    Lion lion = new Lion(feline);
    Assert.assertEquals(3, lion.getKittens());
  }
}
