
import com.problem.solving.practice.twosum.TwoSumSolution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumTest {

    TwoSumSolution twoSumSolution = new TwoSumSolution();

    @Test
    public void testCalculateAppriasal() {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int array[] = {1, 2, 4, 7, 10};
        int expecOutput[] = {1, 4};
        int output[] = twoSumSolution.twoSum(array, 12);

        Assert.assertEquals(expecOutput, output);
    }
}