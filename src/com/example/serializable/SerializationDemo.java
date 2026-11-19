package com.example.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		Employee e = new Employee(101, "Khushal", 50000);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.txt"));
		oos.writeObject(e);
		oos.close();

		System.out.println("Serialization completed");
	}
}
