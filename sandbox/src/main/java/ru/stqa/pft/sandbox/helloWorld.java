package ru.stqa.pft.sandbox;

public class helloWorld {
	
	public static void main(String[] args) {

		System.out.println("Let's start");

		Point p1 = new Point(1,5);
		Point p2 = new Point(1,3);
		System.out.println("Вычисляем с помощью функции, расстояние = " +  distance(p1,p2));
		System.out.println("Вычисляем с помощью метогда класса, расстояние = " +  p1.distanceInClass(p2));
	}

	public static double distance(Point p1, Point p2){
		return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));
	}

}