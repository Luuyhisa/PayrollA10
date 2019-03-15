package za.ac.cput.Assign4;

public class POLO
{
    public static void main( String[] args )
    {
        //PollyMof
        Shapes polly[]=new Shapes[2];
        polly[0]=new Rect();
        polly[1]=new Square();

        for (int i = 0; i < 2; i++) {
            //TestStyle
            if(polly[i].area()==252.0){
                System.out.println("Equal");
            }




            System.out.println("Area :"+polly[i].area());
            System.out.println("Per :"+polly[i].per());
            System.out.println("_______________________________");
        }


    }
}
