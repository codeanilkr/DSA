public class swap {
        int a;
         int b;
    public void swapnums(){
    
       
        a = a+b;
        b = a-b;
        a = a-b;
    
    }
    public static void main(String[] args)
    {
       
swap obj = new swap();
  obj.a = 20;
  obj.b = 50;
  obj.swapnums();
  System.out.println(obj.a+ " = A converted to B " + " B Converted To A " + obj.b);


}
    
}
