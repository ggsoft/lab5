package ru.altailand.lab5.classes;

public class Ellipse extends Point{ // класс эллипс
    private double a,b; // полуоси
    private double area; // площадь
    
    public Ellipse(double x, double y, double a, double b){ // первый конструктор
         super(x,y); 
         this.setName("Эллипс"); 
         this.a=a; 
         this.b=b; 
         area=Math.PI*a*b; 
    } 
    
    public Ellipse(Point p, double a, double b){ // второй конструктор
        this(p.getX(),p.getY(),a,b);
    } 
    
    public double getA(){ 
         return a; 
    }
    
    public double getB(){ 
         return b; 
    } 
    
    public double getArea(){ 
        return area; 
    }
    
    @Override
    public String toString(){
        return "id="+this.getId()+", "+this.getName()+", центр: ("+this.getX()+","+this.getY()+"), a="+a+", b="+b+", площадь="+Math.round(area*100)/100f; 
    }
    
    @Override
    public void move(Point p) {
        setPoint(p);
    }

    @Override
    public void resize(double x) {
        if (x<0) return;
        a = a*x;
        b = b*x;
    }
} 
