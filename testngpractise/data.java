package testngpractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class data {


     @Test(dataProvider = "getData")
     public void metho(String n,String b){
         System.out.println(n);
         System.out.println(b);
     }
    @DataProvider
    public String[][] getData(){
        String datas [][] = new String[2][2];
        datas[0][0]="firstlogin";
        datas[0][1]="firstpsd";
        datas[1][0]="secndlogin";
        datas[1][1]="secndpsd";

        return datas;

    }
}
