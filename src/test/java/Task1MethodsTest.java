import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task1MethodsTest {
    private int[] arr;
    private int[] resultArr;
    private Task1 task1;

    public Task1MethodsTest(int[] arr, int[] resultArr) {
        this.arr = arr;
        this.resultArr = resultArr;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,4,5,5,6,7,8}, new int[]{5,5,6,7,8}},
                {new int[]{1,2,4,5,5,4,7,8}, new int[]{7,8}},
                {new int[]{4,2,1,5,5,8,7,8}, new int[]{2,1,5,5,8,7,8}},
                {new int[]{1,2,4,5,5,4,4,8}, new int[]{8}},
        });
    }

    @Before
    public void before(){
        task1 = new Task1();
    }

    @Test
    public void testAll() {
        Assert.assertArrayEquals(resultArr, task1.arrayWork(arr));
    }

    @Test(expected = RuntimeException.class)
    public void testForRuntimeExc() {
        task1.arrayWork(new int[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForIllegalArgumentExc() {
        task1.arrayWork(null);
    }
}
