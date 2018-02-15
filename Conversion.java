/*
Adam Hereth
02/13/2018
CSC 205
Professor K
*/

public class Conversion 
{
    public static void main(String[] args) 
    {
        System.out.print("1 single precison: " + getSinglePrecison(1));
        System.out.print("1 double precison: " + getDoublePrecison(1)); 
        System.out.print("0.5 single precison: " + getSinglePrecison(0.5));
        System.out.print("0.5 double precison: " + getDoublePrecison(0.5));
        System.out.print("19.5 single precison: " + getSinglePrecison(19.5));
        System.out.print("19.5 double precison: " + getDoublePrecison(19.5));
        System.out.print("-3.75 single precison: " + getSinglePrecison(-3.75));
        System.out.print("-3.75 double precison: " + getDoublePrecison(-3.75));
        System.out.print("Zero single precison: " + getSinglePrecison(0));
        System.out.print("Zero double precison: " + getDoublePrecison(0));
        System.out.print("Infinity single precison ( 2^64 ): " + getSinglePrecison(2^64));
        System.out.print("Infinity double precison ( 2^64 ): " +getDoublePrecison(2^64));
        System.out.print("NaN single precison: " + getSinglePrecison(0/1));
        System.out.print("NaN double precison: " + getDoublePrecison(0/1));
        System.out.print("Denormalized single precison: " + getSinglePrecison((7/8)/64));
        System.out.print("Denormalized double precison: " + getDoublePrecison(2 ^ -1074)); //I dont know why it doesnt print anything
    }

    private static String getSinglePrecison(double s) 
    {
        //converts decimal to hexidecimal
        String hex=Double.toHexString(s);
        //gets the 8 bit exponent
        String exponent = hex.substring(hex.indexOf('p')+1,hex.length());
        //finds the excess needed to convert to IEEE 754 binary
        int excess = Integer.parseInt(exponent) + 127;
        //prints binary code
        System.out.println(Integer.toBinaryString(excess));
        return "";
    }
    private static String getDoublePrecison(double d) 
    {  
       //converts decimal to hexidecimal
       String hex=Double.toHexString(d);
       //gets the 11 bit exponent 
       String exponent = hex.substring(hex.indexOf('p')+1,hex.length());
       //finds the excess needed to convert to IEEE 754 binary
       int excess = Integer.parseInt(exponent) + 1023;
       //prints binary code
       System.out.println(Integer.toBinaryString(excess));
       return "";
    }
    //I could not find a way to reverse the process to get from IEEE 754 back to the number started.
}
