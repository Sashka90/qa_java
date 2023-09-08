import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void getKittensTest() throws Exception{
        Mockito.when(feline.getKittens()).thenReturn(123);
        Lion lion = new Lion(feline, "Самец");
        Assert.assertEquals(123, lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void otherSexLionTest() throws Exception {
        Lion lion = new Lion(feline, "Птичка");
    }
}
