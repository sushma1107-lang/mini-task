package calc;

import java.util.*;
public class calculator
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Operator (+,-,*,/) : ");
        char operator = sc.next().charAt(0);
        
        System.out.println("Enter the First Operand : ");
        double first = sc.nextDouble();
        
        System.out.println("Enter the Second Operand : ");
        double second = sc.nextDouble();
        
        double result = 0;
        
        switch(operator){
        case '+':
            result = first + second;
            break;
        case '-':
            result = first - second;
            break;
        case '*':
            result = first * second;
            break;
        case '/':
            result = first / second;
            break;
        }
        
        System.out.println("The Result is : \n "+first+" "+operator+" "+second+" = "+result);
        
    }
    
}
