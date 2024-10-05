import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.example.Feline;

public class FelineTests {
  
  @Test
  public void getEatForFeline() throws Exception  { 
    Feline feline = new Feline();
    List<String> eat = feline.eatMeat();
    List<String> expected = List.of("Животные", "Птицы", "Рыба");
    Assert.assertEquals(expected, eat);
  }
  
}
