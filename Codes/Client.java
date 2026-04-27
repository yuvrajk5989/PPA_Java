// User defined package import

import PPA.Marvellous;
import PPA.Infosystems;
import PPA.LB.Pune;

class Client 
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        Infosystems iobj = new Infosystems();
        Pune pobj = new Pune();

        System.out.println("Inside main of client");

        mobj.fun();
        iobj.gun();
        pobj.sun();
    }
}
