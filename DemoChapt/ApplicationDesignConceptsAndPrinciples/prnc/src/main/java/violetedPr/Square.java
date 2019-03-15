package violetedPr;
//Interface Segregation Principle violated
public class Square implements Shapes {
    //Single Responsibility Principle Violation
    double x=123;double y=321;
    @Override
    public double Area() {
        double z =(x*y);
        return z;
    }
    @Override
    public double par() {
        double z =((2*x)+(2*y));
        return z;
    }
}
