class Example {
   static void main(String[] args) {
      File file = new File("D:/hola.txt")
      println "The file ${file.absolutePath} has ${file.length()} bytes"
   } 
}