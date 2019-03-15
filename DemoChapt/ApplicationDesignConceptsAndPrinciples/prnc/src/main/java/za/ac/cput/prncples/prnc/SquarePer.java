package za.ac.cput.prncples.prnc;

public class SquarePer extends Square {
    //Single Responsibility Principle Resolved
    public double par(int x,int y) {
        int z =((2*x)+(2*y));
        return z;
    }
}