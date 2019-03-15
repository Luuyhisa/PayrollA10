package za.ac.cput.Assign4;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {
    Shapes polly[]=new Shapes[2];
    @Before
    public void setUp() throws Exception {
        polly[1]=new Square();}
    Rect objDelegation = new Rect();
    @Test
    public void area() {
        double dArTest =100;
        Assert.assertEquals(dArTest,polly[1].area(),0);}
    @Test
    public void per() {
        double dArTest =625;
        Assert.assertEquals(dArTest,polly[1].per(),0);

    }
    @Test//Delegation as an alternative of inheritance test
    public void weAreUsingDelegation() {Rect objDelegation = new Rect();
        String  dTest ="The 1st Shape was Shapeless!!!";
        Assert.assertEquals(dTest,objDelegation.grand.WeAreShapes());
    }
    @Test//Delegation as an alternative of inheritance test
    public void areaUsingDelegation() {Rect objDelegation = new Rect();
        double dArTest =3.14159;
        Assert.assertEquals(dArTest,objDelegation.grand.area(),0);
    }
    @Test//Delegation as an alternative of inheritance test
    public void perUsingDelegation() {Rect objDelegation = new Rect();
        double dTest =9.8695877281;
        Assert.assertEquals(dTest,objDelegation.grand.per(),0);
    }

}