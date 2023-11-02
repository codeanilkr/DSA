package oracle.src.Intellipat.DSA;

public class ApnaStringBulider {
    public static void main(String[] args){

StringBuilder sb = new StringBuilder("Tony");
System.out.println(sb);
// Char at index 0
System.out.println(sb.charAt(0));

// Set char at Index 0
sb.setCharAt(0, 'P');
System.out.println(sb);
// Inster Char At Index
sb.insert(0, 'I');
System.out.println(sb);

// Delet
sb.delete(2, 3);
System.out.println(sb);
sb.append("h");
sb.append("e");
sb.append("l");
sb.append("l");
sb.append("o");

System.out.println(sb);
System.out.println(sb.length());


  }  
}
