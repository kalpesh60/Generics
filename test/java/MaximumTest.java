import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void maxNumberAtFirstPosition_ReturnTheSameNumber() {
        int max = Maximum.printMaximum(7,3,4);
        Assert.assertEquals(7,max);
        System.out.println("Maximum No at First position:" +max);
    }

    @Test
    public void maxNumberAtSecondPosition_ReturnTheSameNumber() {
        int max = Maximum.printMaximum(4,6,3);
        Assert.assertEquals(6,max);
        System.out.println("Maximum No at Second position:" +max);
    }

    @Test
    public void maxNumberAtThirdPosition_ReturnTheSameNumber() {
        int max = Maximum.printMaximum(4,6,9);
        Assert.assertEquals(9,max);
        System.out.println("Maximum No at Third position:" +max);
    }

    @Test
    public void maxFloatNumberAtFirstPosition_ReturnTheSameNumber() {
        float max1 = Maximum.printMaximum(8.0f,7.0f,3.0f);
        Assert.assertEquals(8.0f, max1,0);
        System.out.println("Maximum No at First position:" +max1);
    }

    @Test
    public void maxFloatNumberAtSecondPosition_ReturnTheSameNumber() {
        float max1 = Maximum.printMaximum(3.0f,7.0f,3.0f);
        Assert.assertEquals(7.0f, max1,0);
        System.out.println("Maximum No at Second position:" +max1);
    }

    @Test
    public void maxFloatNumberAtThirdPosition_ReturnTheSameNumber() {
        float max1 = Maximum.printMaximum(4.0f,7.0f,8.0f);
        Assert.assertEquals(8.0f, max1,0);
        System.out.println("Maximum No at Third position:" +max1);
    }

    @Test
    public void maxStringAtFirstPosition_ReturnTheSameString() {
        String max1 = Maximum.printMaximum("Peach","Banana","Apple");
        Assert.assertEquals("Peach", max1);
        System.out.println("Maximum No at First position:" +max1);
    }

    @Test
    public void maxStringAtSecondPosition_ReturnTheSameString() {
        String max1 = Maximum.printMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach", max1);
        System.out.println("Maximum No at Second position:" +max1);
    }

    @Test
    public void maxStringAtThirdPosition_ReturnTheSameString() {
        String max1 = Maximum.printMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach", max1);
        System.out.println("Maximum No at Third position:" +max1);
    }

    @Test
    public void maxValueOfInteger_ShouldReturnTrue() {
        int result = Maximum.printMaximum(10,7,9);
        Assert.assertEquals(result,10);
    }

    @Test
    public void maxValueOfFloat_ShouldReturnTrue() {
        Double result = Maximum.printMaximum(10.0,11.0,9.0);
        Assert.assertEquals(result,11.0,0);
    }

    @Test
    public void maxValueOfString_ShouldReturnTrue() {
        String result = Maximum.printMaximum("Apple","Banana","Peach");
        Assert.assertEquals(result,"Peach");
    }
}
