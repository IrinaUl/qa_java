import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.Feline;
import com.example.Lion;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
  
  @Mock
  Feline feline;

  @Test
  public void checkKittens() throws Exception { 
    Feline feline = new Feline();
    List<String> eat = List.of("Животные", "Птицы", "Рыба");
    Mockito.when(feline.getFood("Хищник")).thenReturn(eat);
    Lion lion = new Lion(feline);
    Assert.assertEquals(eat, lion.getFood());
  }

  
}
