package za.ac.cput.Prncples;

public class Square implements Shapes{
    ////Single Responsibility Principle Violation
    int x=3;int y=3;
    @Override
    public double Area() {
        int z =(x*y);
        return z;
    }
   // int x=4;int y=4;
    @Override
    public double par() {
        int z =((2*x)+(2*y));
        return z;
    }
}