public class CylinderComputation { 
    public static void main(String[] args) {
       double radius, height, surfaceArea, baseArea, volume;
       final double PI = 3.14159265 ;
       radius = 1.2;
       height = 2.0;
       surfaceArea = 2.0 * PI * radius * radius + (height * 2.0 * PI * radius); 
       baseArea = PI * radius * radius;
       volume = PI *  radius * radius   * height;
       System.out.print("The surfaceArea is "); 
       System.out.println(surfaceArea);
       System.out.print("The baseArea is ");
       System.out.println(baseArea);
       System.out.print("The volume is ");
       System.out.println(volume);
    }
 }