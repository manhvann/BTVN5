package BT3;

public class A {
    public boolean isPrime(float n)
    {
        if ((long)n-n!=0) return false;
        else
        {
            if (n<2) return false;
            else
            {
                if(n>=4)
                {
                    for (int i=2;i*i<=n;i++)
                    {
                        if(n%i==0) return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isPrime(double n)
    {
        if ((long)n-n!=0) return false;
        else
        {
            if (n<2) return false;
            else
            {
                if(n>=4)
                {
                    for (long i=2;i*i<=n;i++)
                    {
                        if(n%i==0) return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean isPrime(int n)
    {
        {
            if (n<2) return false;
            else
            {
                if(n>=4)
                {
                    for (int i=2;i*i<=n;i++)
                    {
                        if(n%i==0) return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isPrime(long n)
    {
        {
            if (n<2) return false;
            else
            {
                if(n>=4)
                {
                    for (long i=2;i*i<=n;i++)
                    {
                        if(n%i==0) return false;
                    }
                }
            }
        }
        return true;
    }
}
