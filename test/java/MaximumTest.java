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
}
