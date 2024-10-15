package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    private Feline feline;

    @Test
    public void checkGetSound() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        Assert.assertEquals(expected, cat.getSound());
    }
    @Test
    public void checkGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = Mockito.mock(List.class);
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        Assert.assertEquals(expected, cat.getFood());
    }
}
