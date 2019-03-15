package za.ac.cput.Chapter4Assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class RectTest {
    Shapes polly[]=new Shapes[2];
    @Before
    public void setUp() throws Exception {
        polly[0]=new Rect();
        polly[1]=new Square();
    }
    @Test
    public void area() {
        polly[0].area();
        double dArTest =252;
        Assert.assertEquals(dArTest,polly[0].area(),0);
    }
    @Test
    public void per() {
        polly[0].area();
        double dArTest =66;
        Assert.assertEquals(dArTest,polly[0].per(),0);
    }
    @Test//Delegation as an alternative of inheritance test
    public void weAreUsingDelegation() {
        Rect objDelegation = new Rect();
        String  dTest ="The 1st Shape was Shapeless!!!";
        Assert.assertEquals(dTest,objDelegation.grand.WeAreShapes());
    }
    @Test//Delegation as an alternative of inheritance test
    public void areaUsingDelegation() {
        Rect objDelegation = new Rect();
        double dArTest =3.14159;
        Assert.assertEquals(dArTest,objDelegation.grand.area(),0);
    }
    @Test//Delegation as an alternative of inheritance test
    public void perUsingDelegation() {
        Rect objDelegation = new Rect();
        double dTest =9.8695877281;
        Assert.assertEquals(dTest,objDelegation.grand.per(),0);
    }
}