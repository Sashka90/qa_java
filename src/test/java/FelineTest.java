import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Random random = new Random();
    private final int expectedKittens = random.nextInt();

    @Spy
    Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void defaultGetKittensTest() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensTest() {
        Assert.assertEquals(expectedKittens, feline.getKittens(expectedKittens));
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
}
