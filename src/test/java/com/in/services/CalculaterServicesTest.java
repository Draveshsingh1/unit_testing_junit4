package com.in.services;

import org.junit.*;

public class CalculaterServicesTest {
    @BeforeClass
    public static void startup(){
        System.out.println("Starting Testing");
    }
    @Before
    public void beforeEach(){
        System.out.println("Before Each Test");
    }

    @After
    public void afterEach(){
        System.out.println("After Each Test");
    }
    @Test
    public void addtwoNumberTest(){
      int result= CalculaterServices.addtwoNumber(5,5);
      int expectedResult=10;
        Assert.assertEquals(expectedResult,result);

    }
@Test
    public void nNumber(){
       int sum= CalculaterServices.nNumber(2,3,4,5,6);
       int expectedSum=20;
       Assert.assertEquals(expectedSum, sum);
    }
    @AfterClass
    public static void cleanup(){
        System.out.println("End of Testing");
    }


}
