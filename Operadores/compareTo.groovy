class Example { 
   static void main(String[] args) { 
      def x = 5;
      def y = 10;
      def z = 8;
        
      if(x == y) { 
         println("x is equal to y"); 
      } else 
         println("x is not equal to y"); 
            
      if(z != y) { 
         println("z is not equal to y"); 
      } else 
         println("z is equal to y"); 
                
      if(z != y) { 
         println("z is not equal to y"); 
      } else 
         println("z is equal to y"); 
                    
      if(z<y) { 
         println("z is less than y"); 
      } else 
         println("z is greater than y"); 
                        
      if(x<=y) { 
         println("x is less than y"); 
      } else 
         println("x is greater than y"); 
            
      if(x>y) { 
         println("x is greater than y"); 
      } else 
         println("x is less than y"); 
            
      if(x>=y) { 
         println("x is greater or equal to y"); 
      } else 
         println("x is less than y"); 
   } 
} 