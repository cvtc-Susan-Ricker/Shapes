/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Susan Ricker
 *
 */
public class Cylinder extends Shape {
  
  
//Attributes
  private float radius;
  private float height;
  
  
//Constructor
  public Cylinder(float radius, float height) {
    this.radius = radius;
    this.height = height;
  }
  

  //Getters and Setters
   public float getRadius() {
    return radius;
  }

   private void setRadius(float radius) {
     this.radius = radius;
   }

 
 public float getHeight() {
    return height;
  }
  
  private void setHeight(float new_height) {
  height = new_height;
  }

  @Override
  public String name() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void print() {
    // TODO Auto-generated method stub
    
  }

  
  
  public float surfaceArea(float radius,float height)
  {
      return (2*22/7*radius*height );
  }

  public float volume(float radius,float height)
  {
      return (22/7*radius*radius*height );
  }
  
 
  }

  


