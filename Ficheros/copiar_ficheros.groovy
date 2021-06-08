class Example {
   static void main(String[] args) {
      def src = new File("D:/hola 2.txt")
      def dst = new File("D:/hola.txt")
      dst << src.text
   } 
}