package com.over.quest3;

public class ProcessMain {
	public static void main(String[] args) {
		Processor processor = new Processor();
		
		processor.calculate(4.0);
		processor.calculate(10);
		processor.calculate(10.0, 20.0);
		processor.calculate(2.0, 3);
		processor.calculate(5, 10);
	}
}
