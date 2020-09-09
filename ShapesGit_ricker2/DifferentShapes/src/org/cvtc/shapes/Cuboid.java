/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Susan Ricker
 *
 */
public class Cuboid extends Shape {
  
  
  //Attributes
  private float width;
  private float height;
  private float depth;
 
 
  
  //Methods - Getters and Setters
  public float getWidth() {
    return width;
  }
  
  
  public void setWidth(float width) {
    this.width = width;
  }
  
  public float getHeight() {
    return height;
  }
  
  public void setHeight(float height) {
    this.height = height;
  }
 
  public float getDepth() {
    return depth;
  }
  
  public void setDepth(float depth) {
    this.depth = depth;
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
  
  
  public float surfaceArea(float width,float depth,float height)  //calculation for the surface area of the cuboid
  {
      return (2*((width*depth)+(depth*height)+(height*width))) ;
  }

  public float volume(float width,float height,float depth)   //calculation of the volume of the cuboid
  {
      return (width*height*depth);
  }


}


