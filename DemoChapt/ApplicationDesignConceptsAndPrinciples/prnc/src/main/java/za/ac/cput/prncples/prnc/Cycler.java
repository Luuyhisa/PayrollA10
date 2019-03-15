package za.ac.cput.prncples.prnc;

public class Cycler implements ShapesForOthers{
        double x=123;double y=321;

//Liskov Substitution Principle solved

        @Override
        public double Area() {
            double z =(x*y);
            return z;
        }
        @Override
        public double Cir(){
            double r=2;
             double circumference =(2*3.14*r);
            return circumference;}
}

//
