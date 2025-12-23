class Stack{

String[] stack = new String[10];

int top = -1;

public void push(String element)
{
    if(top==stack.length-1)
    System.out.println("Stack Overflow!!!");

    top = top+1;
    stack[top] = element;
}

public String pop()
{
    if(top==-1)
    System.out.println("Stack Underflow!!!");
    else{
    
    String element = stack[top];
    top--;
    return element;
    }

    return "-1";
}

}

class Solution{

public static void main(String[] args)
{
    Stack s = new Stack();
    s.push("A");
    s.push("B");
    System.out.println(s.pop()+"\n"+s.pop()+"\n"+s.pop());
}

}