package za.ac.cput.Chapter4Assignment;

public class OOP3 extends Shapes{
double width = 12;
double length = 21;

    @Override
    double area() {double outPut=width * length;
   return outPut;
    }

    @Override
    double per() {
        double outPut=((2*width) + (length*2));
        return outPut;
    }

    Shapes  arrMyShape[] = new Shapes[2];

    

}


