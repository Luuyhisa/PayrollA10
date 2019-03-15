package za.ac.cput.Assign4;

public class Rect extends Shapes{
private double width = 12;
private double length = 21;

    //@Override
    double area() {double outPut=width * length;
   return outPut;
    }

    //@Override
    double per() {
        double outPut=((2*width) + (length*2));
        return outPut;
    }
    Shapes grand = new Shapes();
    void grandShape(){
    grand.WeAreShapes();
     }
    Shapes areaGrand = new Shapes();
    void grandArea(){
        areaGrand.area();
    }
    Shapes perGrand = new Shapes();
    void grandper(){
        perGrand.per();
    }
}


