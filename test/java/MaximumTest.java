import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void maxValueInteger_ShouldReturnTrue() {
        Integer array [] ={12,54,87,98,34};
        int result = Maximum.multipleValues(array);
        Assert.assertEquals(98,result);
    }

    @Test
    public void maxValueFloat_ShouldReturnTrue() {
        Double array [] ={12.0,54.4,87.3,98.2,34.5};
        double result = Maximum.multipleValues(array);
        Assert.assertEquals(98.2,result,0);
    }

    @Test
    public void maxValueString_ShouldReturnTrue() {
        String array [] ={"Banana","Peach","Apple","Mango","Orange"};
        String result = Maximum.multipleValues(array);
        Assert.assertEquals("Peach",result);
    }
}
