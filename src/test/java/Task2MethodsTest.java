import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task2MethodsTest {
    private int[] arr;
    private boolean expectedResult;
    private Task2 task2;

    public Task2MethodsTest(int[] arr, boolean expectedResult) {
        this.arr = arr;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,4,1,4,1}, true},
                {new int[]{1,1,1,1,1}, false},
                {new int[]{1,4,3,4,1}, false},
        });
    }

    @Before
    public void before(){
        task2 = new Task2();
    }

    @Test
    public void testAll() {
        Assert.assertEquals(expectedResult, task2.arrayWork(arr));
    }

}