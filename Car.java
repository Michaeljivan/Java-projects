//basic class of a car
//with setters and getters

public class Car{
  private double health = 100.0;
  private double damage = 0;
  private String name;
  private String color;
  private boolean engineOff = true;
  
  public Car(){}
  
  public void setHealth(double health){
    this.health = health;
  }
  public void setDamage(double damage){
    this.damage = damage;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setColor(String color){
    this.color = color;
  }
  public void setEngineOff(boolean setValue){
    this.engineOff = setValue;
  }  
  public double getHealth(){
    return this.health;
  }
  public double getDamage(){
    return this.damage;
  }
  public String getName(){
    return this.name;
  }
  public String getColor(){
    return this.color;
  }
  public boolean getEngineOff(){
    return this.engineOff;
  }
}
