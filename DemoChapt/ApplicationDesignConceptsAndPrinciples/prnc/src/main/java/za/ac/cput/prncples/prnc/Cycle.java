package za.ac.cput.prncples.prnc;


//Liskov Substitution Principle violation
public class Cycle implements Shapes{
    double x=123;double y=321;

    @Override
    public double Area() {
        double z =(x*y);
        return z;
    }
    @Override
    public double par(){
        //double r=2;
       // double circumference =(2*3.14*r);
        //return circumference;//

        return 0;//Liskov Substitution Principle violation
    }
}
