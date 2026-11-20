package com.example.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		Employee e = new Employee(101, "Khushal", 50000);
		// serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.txt"));
		oos.writeObject(e);
		oos.close();

		System.out.println("Serialization completed");

		// deseiralization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.txt"));
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp);
		ois.close();
	}
}
