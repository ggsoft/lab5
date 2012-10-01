package ru.altailand.lab5.classes;

import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {
    
    @Test
    public void testInCircle() {
        System.out.println("Проверка метода inCircle()");
	Circle c = new Circle(3,4,5);
        assertEquals(false, c.inCircle(new Point(0,0)));
        assertEquals(true, c.inCircle(new Point(1,1)));
        assertEquals(false, c.inCircle(new Point(-1,-1)));
    }
 }
