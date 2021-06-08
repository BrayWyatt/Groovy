class Example { 
   static void main(String[] args) { 
      def file = new File('D:/') 
      println "File? ${file.isFile()}" 
      println "Directory? ${file.isDirectory()}" 
   } 
}