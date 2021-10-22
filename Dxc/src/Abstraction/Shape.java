package Abstraction;

public abstract class Shape {
	abstract void Draw();
}
class Rectangle extends Shape{
	void Draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle extends Shape{  
	void Draw(){
		System.out.println("drawing circle");
	}  
}