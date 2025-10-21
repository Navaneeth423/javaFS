package com.inher.quest3;
import java.util.*;

public class OverMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Figures cube = new Cube();
		System.out.println("Enter side of cube: ");
		int side = sc.nextInt();
		cube.volume(side, 1);
		
		Figures cuboid = new Cuboid();
		System.out.println("Enter sides of cuboid: ");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		cuboid.volume(length, breadth);
		
		Figures oval = new Oval();
		System.out.println("Enter radius of Oval: ");
		int radius = sc.nextInt();
		oval.volume(radius, 1);
		
		Figures cylinder = new Cylinder();
		System.out.println("Enter dimensions of Cylinder: ");
		int cylRadius = sc.nextInt();
		int height = sc.nextInt();
		cylinder.volume(height, cylRadius);
	}
}
