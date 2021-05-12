import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void maxNumberAtFirstPosition_ReturnTheSameNumber() {
        int max = Maximum.maxInteger(7,3,4);
        Assert.assertEquals(7,max);
        System.out.println("Maximum No at First position:" +max);
    }

    @Test
    public void maxNumberAtSecondPosition_ReturnTheSameNumber() {
        int max = Maximum.maxInteger(4,6,3);
        Assert.assertEquals(6,max);
        System.out.println("Maximum No at Second position:" +max);
    }

    @Test
    public void maxNumberAtThirdPosition_ReturnTheSameNumber() {
        int max = Maximum.maxInteger(4,6,9);
        Assert.assertEquals(9,max);
        System.out.println("Maximum No at Third position:" +max);
    }

    @Test
    public void maxFloatNumberAtFirstPosition_ReturnTheSameNumber() {
        float max1 = Maximum.maxFloat(8.0f,7.0f,3.0f);
        Assert.assertEquals(8.0f, max1);
        System.out.println("Maximum No at First position:" +max1);
    }

    @Test
    public void maxFloatNumberAtSecondPosition_ReturnTheSameNumber() {
        float max1 = Maximum.maxFloat(3.0f,7.0f,3.0f);
        Assert.assertEquals(true, 7.0f);
        System.out.println("Maximum No at Second position:" +max1);
    }

    @Test
    public void maxFloatNumberAtThirdPosition_ReturnTheSameNumber() {
        float max1 = Maximum.maxFloat(4.0f,7.0f,8.0f);
        Assert.assertEquals(true, 8.0f);
        System.out.println("Maximum No at Third position:" +max1);
    }
}
