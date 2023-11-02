package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class SpnaReplaceString {
    public static void main(String[] args){
        System.out.println("Input A String : ");
Scanner sc = new Scanner(System.in);
String str = sc.next();

String result = " ";

for(int i =0; i<str.length(); i++){

if(str.charAt(i) == 'e'){
result +=  'i';

}else{
    result += str.charAt(i);
}


}

System.out.println(result);







    }
    
}
