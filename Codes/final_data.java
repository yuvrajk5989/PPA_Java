class Demo
{
    public final int i;
    public int j;

    public Demo(int a, int b)
    {
        this.i = a;
        this.j = b;
    }

}

class final_data 
{
    public static void main(String A[]) 
    {
        Demo dobj = new Demo(10, 20);
        
        dobj.i = 11; // Not Alllowed
        dobj.j = 21; // Allowed
        dobj.i++; // Not Allowed
        dobj.j++; //  Allowed
    }    
}
