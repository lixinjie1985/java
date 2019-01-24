package org.eop.java.lambda;

import java.util.function.Consumer;

/**
 * @author lixinjie
 * @since 2019-01-24
 */
public class Program {

	public void foo(int a) {
        System.out.println("foo: " + a);
    }

    public void bar(int a) {
    	System.out.println("bar: " + a);
    }

    public Consumer<Integer> fb;

    public void testFunctionalInterface() {
        fb = this::foo;
        fb.accept(1);
        fb = this::bar;
        fb.accept(2);
    }

    public void testFunctionalInterface(Consumer<Integer> fb, int a) {
        fb.accept(a);
    }

    public void testLambda() {
        fb = (Integer a) -> System.out.println("lambda 1: " + a);
        fb.accept(1);
        fb = (a) -> {
            System.out.println("lambda 2: " + a); 
        };
        fb.accept(2);
    }

    public void testLambda(Consumer<Integer> fb, int a) {
        fb.accept(a);
    }

    public void testAnonymousClass() {
        fb = new Consumer<Integer>() {

			@Override
			public void accept(Integer a) {
				System.out.println("anonymous class: " + a);
				
			}
		};

        fb.accept(1);
        fb.accept(2);
    }

    public void testAnonymousClass(Consumer<Integer> fb, int a) {
        fb.accept(a);
    }
    
	public static void main(String[] args) {
		Program p = new Program();
        p.testFunctionalInterface();
        System.out.println(p.fb.getClass().getName());
        System.out.println(p.fb.getClass().isAnonymousClass());
        System.out.println(p.fb.getClass().getInterfaces()[0].getName());
        System.out.println(p.fb instanceof Consumer);
        System.out.println(p.fb.getClass().isSynthetic());
        //foo: 1
        //bar: 2
        p.testFunctionalInterface(p::foo, 1);
        //foo: 1
        p.testFunctionalInterface(p::bar, 2);
        //bar: 2

        p.testLambda();
        System.out.println(p.fb.getClass().getName());
        System.out.println(p.fb.getClass().isAnonymousClass());
        System.out.println(p.fb.getClass().getInterfaces()[0].getName());
        System.out.println(p.fb instanceof Consumer);
        System.out.println(p.fb.getClass().isSynthetic());
        //lambda 1: 1
        //lambda 2: 2
        p.testLambda((Integer a) -> System.out.println("lambda 1: " + a), 1);
        //lambda 1: 1
        p.testLambda((a) -> { System.out.println("lambda 2: " + a); }, 2);
        //lambda 2: 2

        p.testAnonymousClass();
        System.out.println(p.fb.getClass().getName());
        System.out.println(p.fb.getClass().isAnonymousClass());
        System.out.println(p.fb.getClass().getInterfaces()[0].getName());
        System.out.println(p.fb instanceof Consumer);
        System.out.println(p.fb.getClass().isSynthetic());
        //anonymous class: 1
        //anonymous class: 2
        p.testAnonymousClass(new Consumer<Integer>() {

			@Override
			public void accept(Integer a) {
				System.out.println("anonymous class: " + a);
			}
		}, 1);
        //anonymous class: 1
        p.testAnonymousClass(new Consumer<Integer>() {

			@Override
			public void accept(Integer a) {
				System.out.println("anonymous class: " + a);
			}
		}, 2);
        //anonymous class: 2
	}

}
