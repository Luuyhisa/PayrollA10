package za.ac.cput.prncples.prnc;

public class Square implements Shapes//dependency inversion Resolved
{
    ////Single Responsibility Principle Violation
    int x=3;int y=3;
    @Override
    public double Area() {
        int z =(x*y);
        return z;
    }//Open/Closed Principle res

    // int x=4;int y=4;
    @Override
    public double par() {
        int z =((2*x)+(2*y));
        return z;
    }
}