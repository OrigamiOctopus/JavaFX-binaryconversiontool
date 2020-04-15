/**
 *
 * @author Amanda Tustin
 */
package finalexam;

import static java.lang.Math.abs;

public class FinalExamClass 
{
    //variables
    private int entryNumber;
    private int resultNumber;
    
    //constructor no parameters
    public FinalExamClass()
    {
        this.entryNumber = 0;
        this.resultNumber = 0;
    }
    
    //constructor w/ parameters
    public FinalExamClass(int entry, int result, int tempN)
    {
        this.entryNumber = entry;
        this.resultNumber = result;
    }
    
    //setters
    public void setEntryNumber(int num)
    {
        this.entryNumber = num;
    }
    public void setResultNumber(int res)
    {
        this.resultNumber = res;
    }
    
    //getters
    public int getEntryNumber()
    {
        return entryNumber;
    }
    public int getResultNumber()
    {
        return resultNumber;
    }
    
    //computational function (recursive)
    public static int binary(int num) 
    {
        int remainder = num%2;

        if (num == 1 || num == 0)
        {
            return num;
        }
        else
        {
            return remainder + (binary(num/2)*10);
        }
    }
}
