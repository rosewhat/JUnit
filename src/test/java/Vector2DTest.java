import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D vector2D;


    @BeforeClass
    public static void createNewVector() {
        vector2D = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        Assert.assertEquals(5, vector2D.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroValueX() {
        Assert.assertEquals(3, vector2D.getX(), EPS);
    }

    @Test(expected = ArithmeticException.class)
    public void newVectorShouldHaveError() {
        vector2D.minus(4);
    }




}
