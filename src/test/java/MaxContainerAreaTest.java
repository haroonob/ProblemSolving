import com.problem.solving.practice.maxarea.MaxContainerArea;
import com.problem.solving.practice.twosum.TwoSumSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxContainerAreaTest {
    MaxContainerArea maxContainerArea=new MaxContainerArea();

    @Test
    public void testMaxContainerBruthForce() {
        int heights[]={1,8,6,2,5,4,8,3,7};
        Assert.assertEquals(maxContainerArea.getMaxAreaBruthForce(heights), 49);
    }
    @Test
    public void testMaxContainerTwoPointer() {
        int heights[]={1,8,6,2,5,4,8,3,7};
        Assert.assertEquals(maxContainerArea.getMaxAreaTwoPointer(heights), 49);
    }
}
