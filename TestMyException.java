// 7 .Write a program to illustrate exception using multiple catch statement.

class MyException extends Exception
{
   MyException(String message)
  {
    super(message);
  }
}
 class TestMyException {
 public static void main(String args[])
 {
     int x=5, y=1000;
     try
     {
         float z =(float)x/(float)y;
         if(z<0.01)
         {
         throw new MyException("number is too small");
         }    
     }
 catch(MyException e){
     System.out.println("caught MyException");
     System.out.println(e.getMessage());
     System.out.println(e);
 }
catch(Exception e){
System.out.println(e);
}
     finally
     {
         System.out.println("i am always here");
     }

}
  }
