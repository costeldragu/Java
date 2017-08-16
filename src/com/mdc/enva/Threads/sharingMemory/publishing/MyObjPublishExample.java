package com.mdc.enva.Threads.sharingMemory.publishing;

public class MyObjPublishExample
{
	public static void publishObj(MyObjImmutable obj)
	{
		// Some mechanism to tell other threads about this object
		// Perhaps store in a ConcurrentHashMap, pass via a queue
		// or even simply a static volatile variable
	}
	
	public static void main(String[] args)
	{
		// Create a mutable object
		MyObjMutable obj = new MyObjMutable(1, "hi");
		
		// Maybe mutable it here
		
		publishObj(new MyObjImmutable(obj)); // Publish it
		
		// And replace with a different object
		MyObjMutable obj2 = new MyObjMutable(2, "there");
		publishObj(new MyObjImmutable(obj2));
	}
}
