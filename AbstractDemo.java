
abstract class RBI
{   
    //virtual float CalculateROi() = 0;
    public abstract float CalculateROI(); //abstract

    public void DisplayRules()      //conctrete
    {
        System.out.println("You have to submit Aadhar card and PAN no.");
        System.out.println("Minimum balance is 10,000");
    }
}

class SBI extends RBI
{
    public float CalculateROI()
    {
        return 5.7f;
    }
}

class BOM extends RBI
{
    public float CalculateROI()
    {
        return 7.7f;
    }
}

class AbstractDemo
{
    public static void main(String Arg[])
    {
       // RBI robj = new RBI();

        SBI sobj = new SBI();
        BOM bobj = new BOM();

        sobj.DisplayRules();
        bobj.DisplayRules();

        float fRet = 0.0f;
        fRet = sobj.CalculateROI();
        System.out.println("Rate of innterest of SBI is :"+fRet);
        
        fRet = bobj.CalculateROI();
        System.out.println("Rate of innterest of BOM is :"+fRet);
    }
}