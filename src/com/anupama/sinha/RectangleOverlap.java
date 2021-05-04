package com.anupama.sinha;

import java.awt.*;

//Given (l1,r1) of rectangle as top leftmost and bottom rightmost coordinates of 2 rectangles.Finds it it overlaps
class Point{
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Rectangle{
    public Point l1r1;
    public Point l2r2;

    public Rectangle(Point l1r1,Point l2r2){
        this.l1r1 = l1r1;
        this.l2r2 = l2r2;
    }



    public boolean isIntersecting(Rectangle rect2) {
        if(this.l1r1.x>rect2.l2r2.x || this.l2r2.x < rect2.l1r1.x || this.l1r1.y > rect2.l1r1.y || this.l2r2.y < rect2.l1r1.y )
            return false;
        return true;
    }
}
public class RectangleOverlap {
    public static void main(String[] args) {
        Point l1 = new Point(0,10);
        Point r1 = new Point(10,0);

        Point l2 = new Point(0,10);
        Point r2 = new Point(10,0);

        Rectangle rect1 = new Rectangle(l1,r1);
        Rectangle rect2 = new Rectangle(l2,r2);

        if(rect1.isIntersecting(rect2))
            System.out.println("Intersects");
        else
            System.out.println("Doesn't intersect");



    }
}
