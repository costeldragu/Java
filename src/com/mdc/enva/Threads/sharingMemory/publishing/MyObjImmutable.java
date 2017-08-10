package com.mdc.enva.Threads.sharingMemory.publishing;

public final class MyObjImmutable
{
	private final int field1;
	private final String field2;
			
	public MyObjImmutable(int field1, String field2)
	{
		this.field1 = field1;
		this.field2 = field2;
		// Important, do not let 'this' escape during construction
		// otherwise no guarantees of correct visibility
	}
		
	// Construct an immutable copy from a mutable one
	public MyObjImmutable(MyObjMutable obj)
	{
		this(obj.getField1(), obj.getField2());
	}
	
	public int getField1()
	{
		return field1;
	}
	
	public String getField2()
	{
		return field2;
	}
	
	// equals and hashCode methods and so on...
}
