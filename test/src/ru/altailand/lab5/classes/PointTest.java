package ru.altailand.lab5.classes;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {
    
    @Test
    public void testDistance() {
        System.out.println("Проверка метода distance()");
	Point p = new Point(3,4);
        assertEquals(5, p.distance(0,0),0.000000001);
    }
 }
