
/**
 * Write a description of class converter here.
 *
 * Nicole
 * @version (a version number or a date)
 */
public class converterStatic
{
    static final int base2 = 2;
    static final int base8 = 8;
    public static void main(String[] args)
    {   
         int num = 0;
        String inputString = "17"; 
        num = basetoDecimal(inputString, base8);
        System.out.println(num);
        inputString = "10111"; 
        num = basetoDecimal(inputString, base2);
        System.out.println(num);
    }
    static int basetoDecimal(String in, int base)
    {
        int num = 0;
        int len = in.length();
        for(int i = 0;i < len; i++)
        {
            num += Integer.parseInt(in.substring(in.length()-1))*Math.pow(base2,i);
            in = in.substring(0, in.length() - 1);      
        }
        return num;
    }
}

