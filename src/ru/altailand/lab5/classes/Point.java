package ru.altailand.lab5.classes;

import ru.altailand.lab5.ifaces.*;

public class Point implements Movable,Resizable{ // главный родительский класс (Точка)
    private String name="Точка"; 
    private double x,y; 
    private int id; 
    private static int nextId=1;
    
    {  id = nextId++; }
    
    public Point(double x, double y){ // первый конструктор
        this.x=x; 
        this.y=y; 
    } 
    
    public Point(Point p){  // второй конструктор
        this(p.getX(),p.getY()); // вызов первого конструктора
    } 
    
    public int getId(){ 
        return id; 
    } 
    
    public String getName(){ 
        return name; 
    } 
    
    public void setName(String n){ 
        name=n; 
    } 
    
    public double getX(){ 
        return x; 
    }
    
    public double getY(){ 
        return y; 
    }
    
    protected void setPoint(Point p){
        x=p.getX();
        y=p.getY();
    }
      
    public double distance(double x, double y){ // первый метод для расстояния
        double dx=this.x-x; 
        double dy=this.y-y; 
        return Math.sqrt(dx*dx+dy*dy); 
    }
    
    public double distance(Point p){  // второй метод для расстояния
        return distance(p.getX(),p.getY()); 
    }
    
    @Override 
    public String toString(){
        return "id="+id+", "+name+" ("+x+","+y+")";
    }

    @Override
    public void move(Point p) {
        setPoint(p);
    }

    @Override
    public void resize(double x) {}
}
