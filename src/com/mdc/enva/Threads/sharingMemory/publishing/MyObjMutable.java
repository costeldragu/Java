package com.mdc.enva.Threads.sharingMemory.publishing;

// Do not share this with other threads
public final class MyObjMutable
{
	// Since we don't share, we don't need volatile here
	private int field1;
	private String field2;
				
	public MyObjMutable(int field1, String field2)
	{
		this.field1 = field1;
		this.field2 = field2;
	}

	// If writing all this boilerplate is getting you down
	// you might want to check out Project Lombok
	public int getField1()
	{
		return field1;
	}
	
	public String getField2()
	{
		return field2;
	}
	
	public void setField1(int field1)
	{
		this.field1 = field1;
	}
	
	public void setField2(String field2)
	{
		this.field2 = field2;
	}
	
	// equals and hashCode methods and so on...
}
