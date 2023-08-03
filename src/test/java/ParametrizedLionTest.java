import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParametrizedLionTest {

    public String sex;
    public boolean hasMane;

    public ParametrizedLionTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLionParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void hasManeTest() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }
}
