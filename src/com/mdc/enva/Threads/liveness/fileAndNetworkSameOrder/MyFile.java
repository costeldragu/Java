package com.mdc.enva.Threads.liveness.fileAndNetworkSameOrder;

public class MyFile
{
	public void access()
	{
		System.out.println("File is being accessed by " + Thread.currentThread().getName());
	}
}
