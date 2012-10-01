package ru.altailand.lab5.classes;

public class Segment extends Point{ // класс Отрезок
    private double x0,y0,x1,y1;
    private double length; // длина отрезка
    
    public double getX0(){ 
        return x0; 
    } 
    
    public double getY0(){ 
        return y0; 
    } 
    
    public double getX1(){ 
        return x1; 
    } 

    public double getY1(){ 
        return y1; 
    } 
    
    public Segment(double x0, double y0, double x1, double y1){ // конструктор
        super((x0+x1)/2, (y0+y1)/2); 
        this.setName("Отрезок"); 
        this.x0=x0;
        this.y0=y0;        
        this.x1=x1;
        this.y1=y1;
        calcLength();
    } 
    
    private void calcLength(){
        double dx=x0-x1; 
        double dy=y0-y1; 
        length = Math.sqrt(dx*dx+dy*dy);
    }
    
    public double getLength(){ 
        return length; 
    }
    
    @Override
    public String toString(){
        return "id="+this.getId()+", "+this.getName()+" ("+x0+","+y0+") - ("+x1+","+y1+"), длина="+Math.round(length*100)/100f; 
    }
    
    @Override
    public void move(Point p) {
        double dx = p.getX() - getX();
        double dy = p.getY() - getY();
        x0 = x0 + dx;
        y0 = y0 + dy;
        x1 = x1 + dx;
        y1 = y1 + dy;
        setPoint(p);
    }

    @Override
    public void resize(double x) {
        if (x<0) return;
        double dx = (x1 - getX())*x;
        double dy = (y1 - getY())*x;
        x0 = getX() - dx;
        y0 = getY() - dy;
        x1 = getX() + dx;
        y1 = getY() + dy;
    }
}
