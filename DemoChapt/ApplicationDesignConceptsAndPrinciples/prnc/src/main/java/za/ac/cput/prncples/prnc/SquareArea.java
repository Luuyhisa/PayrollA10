package za.ac.cput.prncples.prnc;

public class SquareArea extends Square //dependency inversion violation
{
//Single Responsibility Principle Resolved

//Open/Closed Principle res

    int x=2;int y=3;
    public double Area() {
        int z =(x*y);
        return z;
    }
}
