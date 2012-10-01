package ru.altailand.lab5;

import java.io.*;
import java.util.*;
import ru.altailand.lab5.classes.*;

public class Lab5 {
    
    private static List<Point> list;
    
    private static void init(){ // создание и заполнение списка
       list=new ArrayList<>(); 
       list.add(new Point(3,4)); 
       list.add(new Circle(1,2,5)); 
       list.add(new Ellipse(1,1,5,8)); 
       list.add(new Segment(1,1,5,8)); 
       list.add(new Point(2,2)); 
       list.add(new Segment(0,0,3,5)); 
       list.add(new Ellipse(0,0,4,3)); 
       list.add(new Circle(0,0,5)); 
       list.add(new Ellipse(-1,2,5,3)); 
       list.add(new Circle(1,1,4)); 
    }
    
    public static void main(String[] args) throws IOException {
       init();
       //  подготовка к вводу
       InputStreamReader isr = new InputStreamReader(System.in); 
       BufferedReader br = new BufferedReader(isr); 
       for(;;){ // начинаем бесконечный цикл 
          System.out.println(); 
          System.out.println("Выберите тип сортировки (выйти - пустая строка):"); 
          System.out.println("--------------------------------------------------"); 
          System.out.println("1 - по возраcтанию id"); 
          System.out.println("2 - по убыванию id"); 
          System.out.println("3 - по возраcтанию имени"); 
          System.out.println("4 - по убыванию имени"); 
          System.out.println("5 - по возрастанию удаленности от начала координат"); 
          System.out.println("6 - по убыванию удаленности от начала координат"); 
          System.out.println("--------------------------------------------------"); 
     	  String mode = br.readLine();  // читаем строку из буфера ввода 
   	  if (mode.isEmpty()) break; // прерываем цикл, если строка пустая 
          boolean sortUp = mode.equals("2")||mode.equals("4")||mode.equals("6"); 
          int sortMode=0; 
          if (mode.equals("3")||mode.equals("4")) sortMode=1; 
          else if (mode.equals("5")||mode.equals("6")) sortMode=2; 
          Collections.sort(list,new SortMode(sortUp,sortMode)); 
          for(Point p: list){  
             System.out.println(p); 
          } 
       } 
    }
}
