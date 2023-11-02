package oracle.src.DSA;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
  double result= 0;
System.out.println("Enter First Number");
Scanner sc = new Scanner(System.in);
  double a = sc.nextDouble();

System.out.println("Enter Valid Operator + - * /");
  String operator = sc.next();
if(operator.matches("[+\\-*/]")){

System.out.println("Please Enter Second Number ");
double b = sc.nextDouble();

switch (operator){
  case ("+") :
  result =(a+b);
  break;
case ("-") :
result = (a-b);
break;
case ("*"):
result = (a*b);
break;
case ("/") :
if(b != 0){
result =  (a/b);
}else{
  System.out.println("Enter A Valid Number");
}
break;
default:
break;
}
System.out.println("Result " +result);
}
}}
 
  

