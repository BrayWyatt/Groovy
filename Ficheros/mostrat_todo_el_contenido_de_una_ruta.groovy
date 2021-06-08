class Example {
   static void main(String[] args) {
      new File("D:/").eachFile() {  
         file->println file.getAbsolutePath()
      }
   } 
}