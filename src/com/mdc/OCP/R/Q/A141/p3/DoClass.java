package com.mdc.OCP.R.Q.A141.p3;

import com.mdc.OCP.R.Q.A141.p1.DoInterface;

public class DoClass implements DoInterface {
    int x1,x2;
    DoClass() {
        this.x1 = 0;
        this.x2 = 10;
    }
    public void m1(int p1) { x1+=p1; System.out.println(x1); } //line n2
    public void m2(int p1) { x1+=p1; System.out.println(x1); }
}
