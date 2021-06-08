class Example { 
   static void main(String[] args) { 
      int a = 00111100; 
      int b = 00001101; 
      int x;
        
      println(Integer.toBinaryString(a&b)); 
      println(Integer.toBinaryString(a|b)); 
      println(Integer.toBinaryString(a^b)); 
        
      a=~a; 
      println(Integer.toBinaryString(a)); 
   } 
}