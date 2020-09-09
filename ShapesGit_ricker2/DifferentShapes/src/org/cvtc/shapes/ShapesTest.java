/**
 * 
 */
package org.cvtc.shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Susan Ricker
 *
 */
public class ShapesTest {

  
  public static void main(String[] args) throws IOException
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

       //creating objects for all the classes
      Cuboid cub=new Cuboid();
      Cylinder cy=new Cylinder(0, 0);
      Sphere sp=new Sphere(0);
   

       //user choices
      System.out.println("1. Cuboid");
      System.out.println("2. Cylinder");
      System.out.println("3. Sphere");

      //user input
      System.out.println("Please enter the number of your choice, between 1-3:");  
      int a= Integer.parseInt(br.readLine());
      
    
       //using a switch statement to check for each case
      switch (a)           
      {
          
          case 1:
              System.out.println("Please enter value of width:");
              float width= Float.parseFloat(br.readLine());

              System.out.println("Please enter value of depth:");
              Float depth= Float.parseFloat(br.readLine());

              System.out.println("Please enter value of height:");
              Float height= Float.parseFloat(br.readLine());

              System.out.println("The surface area of cuboid is=" + cub.surfaceArea(width,depth,height));

              System.out.println("The volume of cuboid is=" + cub.volume(width,depth,height));
              break; //terminate the execution of the switch statement


          case 2:
            
            
            System.out.println("Please enter value for radius:");
            float myRadius= Float.parseFloat(br.readLine());

            System.out.println("Please enter value for height:");
            float myHeight= Float.parseFloat(br.readLine());

            System.out.println("The surface area for Cylinder is=" + cy.surfaceArea(myRadius,myHeight));
            System.out.println("The volume of Cylinder=" + cy.volume());
            break;

             
          case 3:

            System.out.println("Please enter value for radius:");
            Float radius= Float.parseFloat(br.readLine());

            System.out.println("The surface area for Sphere is=" + sp.surfaceArea(radius));
            System.out.println("The volume of Sphere=" + sp.volume(radius));
            break;


          case 4:
              System.exit(0);

          default:
              System.out.println("Invalid Number/Entry!");
      }
  }
  
}
 












 
   
   



