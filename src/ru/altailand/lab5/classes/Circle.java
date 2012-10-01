package ru.altailand.lab5.classes;

public class Circle extends Point{ // класс Окружность
    private double r;  // радиус
    private double area; // площадь
   
    public Circle(double x, double y, double r){ // первый конструктор
         super(x,y); 
         this.setName("Окружность"); 
         this.r=r; 
         area=Math.PI*r*r; 
    } 

    public Circle(Point p, double r){ // второй конструктор
        this(p.getX(),p.getY(),r);
    } 
    
    public double getR(){ 
         return r; 
    } 
    
    public double getArea(){ 
        return area; 
    } 
    
    public boolean inCircle(Point p){ // точка p внутри окружности?
        return r>this.distance(p.getX(),p.getY()); 
    }
    
    @Override
    public String toString(){
        return "id="+this.getId()+", "+this.getName()+", центр: ("+this.getX()+","+this.getY()+"), радиус="+r+", площадь="+Math.round(area*100)/100f; 
    }
    
    @Override
    public void move(Point p) {
        setPoint(p);
    }

    @Override
    public void resize(double x) {
        if (x<0) return;
        r = r*x;
    }    
} 
