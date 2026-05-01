class MainThread 
{
    public static void main(String A[])
    {
        System.out.println("Inside Main method...");

        Thread tobj = Thread.currentThread();

        String name = tobj.getName();

        System.out.println("Name of current thread : " + name);
    }    
}
