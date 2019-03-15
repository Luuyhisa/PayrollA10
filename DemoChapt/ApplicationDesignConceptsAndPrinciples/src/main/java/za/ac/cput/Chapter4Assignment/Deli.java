package za.ac.cput.Chapter4Assignment;
/////GrandPa
class Grand {
    // delegate
    void Grand()
    {
       System.out.println("Pule");
    }
}
/////father
class Father extends Grand {
    // delar
    Grand p = new Grand();

    // create the delegate
    void FromPa()
    {
        //System.out.print("my fathers name is :");
        p.Grand(); // delegation
    }
}
/////Son
public class Deli extends Father {

    // who is he
    public static void main(String[] args)
    {
        Father x = new Father();
        System.out.print("Who is Grand Pa ?: ");
        x.FromPa();

       // System.out.print("Who is Father ?: ");
        //x.FromPa();
    }
}