public SquareRunner

{
 

  public static void main (String[] args)
  
   {
     Square test = new Square(5); 
     System.out.println (test.computePerimeter()); 
     System.out.println(test.computeArea()); 
     
    test.setWidth(22);
    System.out.println (test.computePerimeter()); 
    System.out.println(test.computeArea());
    


   }