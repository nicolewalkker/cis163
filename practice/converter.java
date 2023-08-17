
/**
 * Write a description of class converter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class converter 
{
    int m_base;
    public converter (int base)
    {
        m_base = base;
    }
    
    int basetoDecimal(String in)
    {
        return basetoDecimal(in, m_base);
    }
    int basetoDecimal(String in, int base )
    {
        int num = 0;
        int len = in.length();
        for(int i = 0;i < len; i++)
        {
            num += Integer.parseInt(in.substring(in.length()-1))*Math.pow(base,i);
            in = in.substring(0, in.length() - 1);      
        }
        return num;
    }
    public static void main(String[] args)
    {
        converter c = new converter(8);
        System.out.println(c.basetoDecimal("17"));
    }
}

