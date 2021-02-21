public class MyTests {

    @BeforeSuite
    public void beforeSuiteTest(){
        System.out.println("Тест \"beforeSuiteTest\"");
    }

    @Test(priority = 4)
    public void Test1(){
        System.out.println("Тест 1 с приоритетом 4");
    }
    @Test(priority = 8)
    public void Test5(){
        System.out.println("Тест 5 с приоритетом 8");
    }
    @Test(priority = 1)
    public void Test2(){
        System.out.println("Тест 2 с приоритетом 1");
    }

    @AfterSuite
    public void afterSuiteTest1(){
        System.out.println("Тест \"afterSuiteTest\"");
    }

    @Test(priority = 8)
    public void Test3(){
        System.out.println("Тест 3 с приоритетом 8");
    }
    @Test(priority = 2)
    public void Test4(){
        System.out.println("Тест 4 с приоритетом 2");
    }
    @Test(priority = 10)
    public void Test6(){
        System.out.println("Тест 6 с приоритетом 10");
    }



}
