class Example { 
   static void main(String[] args) {
      new File("D:/").eachFileRecurse() {
         file -> println file.getAbsolutePath()
      }
   }
} 