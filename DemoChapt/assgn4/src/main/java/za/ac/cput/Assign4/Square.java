package za.ac.cput.Assign4;

public class Square extends Shapes{
private  double inSide;
    //@Override
    double area() {
          inSide =25;
        double outPut=inSide* 4;
        return outPut;
    }
    //@Override
    double per() {
         inSide =25;
        double outPut=inSide*inSide;
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
