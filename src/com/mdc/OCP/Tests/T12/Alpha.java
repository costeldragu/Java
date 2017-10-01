package com.mdc.OCP.Tests.T12;

public class Alpha {
    static int s;
    int ns;
    Alpha(int ns) {
        if(s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}
