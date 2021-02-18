import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MainMethodsTest {
    private int[] arr;
    private int[] resultArr;
    private Main main;

    public MainMethodsTest(int[] arr, int[] resultArr) {
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
        main = new Main();
    }

    @Test
    public void testAll() {
        Assert.assertArrayEquals(resultArr, main.arrayWork(arr));
    }

    @Test(expected = RuntimeException.class)
    public void testForRuntimeExc() {
        main.arrayWork(new int[]{});
    }

    @Test(expected = RuntimeException.class)
    public void testForIllegalArgumentExc() {
        main.arrayWork(null);
    }
}
