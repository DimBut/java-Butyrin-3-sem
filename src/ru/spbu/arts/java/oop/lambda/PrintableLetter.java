package ru.spbu.arts.java.oop.lambda;

public class PrintableLetter implements Printable {
   String x;
   int n;

   PrintableLetter(String x, int n){
      this.x=x;
      this.n=n;
   }

   public void print(){
      String k ="";
      for (int i=0;i<this.n;i++){
         k=k+this.x;
      }
      System.out.println(k);
   }


}



