public class CALCULATOR 
{
    int n1;
    int n2;
    CALCULATOR()
    {
        n1=30;
        n2=40;
    }
    CALCULATOR(int a,int b)
    {
        n1=a;
        n2=b;
    }
    void add()
    {
        System.out.println(n1+n2);
        
    }
    
}

class democonstutor
{ 
    public static void main(String argu[])
    {
        CALCULATOR C=new CALCULATOR();
        C.add();
        CALCULATOR C1=new CALCULATOR(50,60);
        C1.add();

    }
}

