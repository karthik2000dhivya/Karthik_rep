package testngpractise;

import com.beust.jcommander.Parameter;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.print.DocFlavor;
import java.net.URL;

public class practics {
    @BeforeMethod
    public void print(){
        System.out.println(" Git bored beforemethod");
    }
    @Test
    public void pj(){
        System.out.println("aftermethod1111");
        //Assert.assertTrue(false);
    }
    @AfterMethod
    public void kj(){
        System.out.println("aftermethod");
    }
    @Parameters({"URL","UR"})
    @Test
    public void print14(String n,String k){
        System.out.println(n+k);
    }

    @BeforeClass
    public void print147(){
        System.out.println("class start");
    }

    @AfterClass
    public void print149(){
        System.out.println("class end");
    }
    @Test(groups = "print")
    public void print114(){
        System.out.println("afterhome");
    }

    @Test(groups = "print")
    public void print111(){
        System.out.println("afterhome");
    }
    @Test(groups = "print")
    public void print11(){
        System.out.println("afterhome");
    }


    @BeforeSuite
    public void rj(){
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void meth(){
        System.out.println("welcome Before Test");
    }
    @AfterTest
    public void print146(){
        System.out.println("Thank you AfterTest");
    }

    @AfterSuite
    public void dj(){
        System.out.println("AfterSuite");
    }
}
