/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Susan Ricker
 *
 */
public class Sphere extends Shape  {
  
  //Attributes
  private float radius;

 
  //Constructor
  public Sphere(float radius) {
    this.radius = radius;
  }


 //Getters and Setters
  public float getRadius() {
    return radius;
  }



  private void setRadius(float radius) {
    this.radius = radius;
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
  
  
  public float surfaceArea(float radius)
  {
      return 4/3*22/7*radius*radius ;
  }

  public float volume(float radius)
  {
      return (4/3*22/7*radius*radius*radius );
  }
  
}
