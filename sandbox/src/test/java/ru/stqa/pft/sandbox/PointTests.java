package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testPoint(){
        Point p1 = new Point(1,3);
        Point p2 = new Point(1,5);
        Assert.assertEquals(p1.distanceInClass(p2), 2.0);

    }
    @Test
    public void testPoint2(){
        Point p1 = new Point(1,-3);
        Point p2 = new Point(1,5);
        Assert.assertEquals(p1.distanceInClass(p2), 8.0);

    }

    @Test
    public void testPoint3(){
        Point p1 = new Point(-1,3);
        Point p2 = new Point(1,3);
        Assert.assertEquals(p1.distanceInClass(p2), 2.0);
    }
    @Test
    public void testPoint4(){
        Point p1 = new Point(-2,3);
        Point p2 = new Point(1,3);
        Assert.assertEquals(p1.distanceInClass(p2), 3.0);
    }
    @Test
    public void testPoint5(){
        Point p1 = new Point(-3,8);
        Point p2 = new Point(1,8);
        Assert.assertEquals(p1.distanceInClass(p2), 4.0);
    }
}
