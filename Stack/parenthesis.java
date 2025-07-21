import java.util.*;

class Para{
    Stack<String> s = new Stack<>();

    public boolean checkPara(String str)
    {
        boolean result=true;
        String charac="";
        for(int i=0;i<str.length();i++)
        {
            charac = str.charAt(i)+"";
            String str2;
            if(charac.equals("{") || charac.equals("(") || charac.equals("["))
            {
                s.push(charac);
            }
            else {
                    str2 = s.peek();
                    if(str2.equals("{") && charac.equals("}"))
                    {
                        s.pop();
                    }
                    else if(str2.equals("(") && charac.equals(")"))
                    {
                        s.pop();
                    }
                    else if(str2.equals("[") && charac.equals("]"))
                    {
                        s.pop();
                    }
                    else
                    {
                        result = false;
                        break;
                    }
            }
        }

        return result;
    }
}