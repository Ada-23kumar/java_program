public class pract5 {
    // public class JavaDoubleExample1 {  
        public static void main(String[] args) {  
       Double d1 = 45d;  
       Double d2 = 67d;  
       Double d3 = Double.NaN;   
       Double d4 = Double.POSITIVE_INFINITY;   
       // Returns the hashCode.  
       System.out.println("The hashCode for the number '"+d1+"' is given as :"+ d1.hashCode());  
         
       // Returns the integer type value.   
       System.out.println("The interger type value for the double '"+d2+"' is given as :"+d2.intValue());  
          
        // Returns a boolean value   
       System.out.println("Is the number '"+d3+"' is NaN? :"+d3.isNaN());  
          
       // Check whether the number is finitwe or not.  
        System.out.println("Is the number '"+d2+"' is finite? "+d4.isInfinite());    
          
        }  
    }   