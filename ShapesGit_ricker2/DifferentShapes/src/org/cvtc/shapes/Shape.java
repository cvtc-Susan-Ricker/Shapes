package org.cvtc.shapes;

abstract public class Shape {
  
 
  
  
//area is zero by default if not overridden by a subclass
 public float surfaceArea() {
   return 0.0f;
 }
 
 // volume is zero by default if not overridden by a subclass
 public float volume() {
   return 0.0f;
 }
 public float render() {
   return 0.0f;
 }

 
 
//non-abstract subclasses must define a name method, which
// returns the name of the class
public abstract String name();

// non-abstract subclasses must define a print method, which
// prints out the class' attributes.
public abstract void print();


}  

 
 
 
 

 
 
 
  
 


