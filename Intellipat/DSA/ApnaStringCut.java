package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class ApnaStringCut {
    public static void main(String[] args){

System.out.println("enter Email Id");
Scanner sc = new Scanner(System.in);
String email = sc.next();
String userName = "";
for(int i=0; i<email.length(); i++){

if(email.charAt(i)== '@'){
    break;
}else{
    userName += email.charAt(i);
}

}
System.out.println(userName);

}
    
}
