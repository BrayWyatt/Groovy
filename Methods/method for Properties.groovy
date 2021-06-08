import java.io.File 
class Example { 
   static void main(String[] args) { 
      new File("D:/hola.txt").eachLine {  
         line -> println "line : $line"; 
      } 
   } 
}