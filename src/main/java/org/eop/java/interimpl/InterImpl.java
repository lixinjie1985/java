package org.eop.java.interimpl;

/**
 * @author lixinjie
 * @since 2019-02-27
 */
public class InterImpl {
	
	public static void main(String[] args) {
		C c = new C();
		c.a();
		c.b();
		c.f();
		c.c();
		A a = c;
		a.a();
		a.f();
		a.c();
		B b = c;
		b.b();
		b.f();
		b.c();
	}

}

interface A {
	void a();
	void f();
	void c();
}

interface B {
	void b();
	void f();
	void c();
}

class C implements A, B {
	
	@Override
	public void a() {
		System.out.println("a");
	}
	
	@Override
	public void f() {
		System.out.println("f");
	}
	
	@Override
	public void c() {
		System.out.println("c");
	}
	
	@Override
	public void b() {
		System.out.println("b");
	}
	
}