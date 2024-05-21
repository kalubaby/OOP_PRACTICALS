Package A:
package apack;

public class A {
    protected int protectedVar = 10;
    private int privateVar = 20;
    public int publicVar = 30;
}

Package B:
package bpack;

import apack.A;

public class B extends A {
    public void display() {
        System.out.println("Protected Variable in Class A (inherited): " + protectedVar);
 	System.out.println("Public Variable in Class A (inherited): " + privateVar);
        System.out.println("Public Variable in Class A (inherited): " + publicVar);
    }
}

Package C:
package cpack;

import apack.A;

public class C {
    public void display() {
        A objA = new A();
        System.out.println("Public Variable in Class A (same package): " + objA.publicVar);
    }
}

Package D:
package dpack;

import bpack.B;
import cpack.C;

public class pract6_8 {
    public static void main(String[] args) {
        // Creating object of class B (inherited from class A)
        B objB = new B();
        objB.display();

        // Creating object of class C
        C objC = new C();
        objC.display();
    }
}
