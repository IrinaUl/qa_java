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
  Feline feline;

  @Test
  public void checkKittens() throws Exception {
    Lion lion = new Lion(feline);
    List<String> eat = List.of("Животные", "Птицы", "Рыба");
    Mockito.when(feline.eatMeat()).thenReturn(eat);
    Assert.assertEquals(eat, lion.getFood());
  }
}
