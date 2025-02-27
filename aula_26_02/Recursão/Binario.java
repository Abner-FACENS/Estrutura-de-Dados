package aula_26_02.Recursão;


public abstract class Binario 
{
    public static String binario (int num)
    {
        if (num/2 >= 1)
        {
            return binario(num/2) + " - " + num%2;
        }
        
        else 
        {
            return num%2 + "";
        }
    }
}
