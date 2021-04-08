

public class MyClass {
    @BeforeSuite
    public void init() {
        System.out.println("start");
    }

    @Test(priority = 9)
    public void test1() {
        System.out.println("test1");
    }

    @Test(priority =3 )
    public void test2() {
        System.out.println("test2");
    }

    @Test(priority = 1)
    public void test3() {
        System.out.println("test3");
    }

    @Test(priority = 4)
    public void test4() {
        System.out.println("test4");
    }

    @Test(priority = 2)
    public void test5() {
        System.out.println("test5");
    }

    public void method() {
        System.out.println("method");
    }


    @AfterSuite
    public void stop() {
        System.out.println("stop");
    }

}
