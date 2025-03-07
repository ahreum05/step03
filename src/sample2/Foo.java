package sample2;

public class Foo implements InterFoo{
	public Foo() {
		System.out.println("Foo 객체 생성 : Foo() 호출");
		System.out.println("-----------------------");
	}
	public Foo(String str) {
		System.out.println("Foo 객체 생성 : Foo(String) 호출");
		System.out.println("str : "+ str);
		System.out.println("-----------------------");
	}
	public Foo(int num ,String str) {
		System.out.println("Foo 객체 생성 : Foo(int, String) 호출");
		System.out.println("num : "+ num);
		System.out.println("str : "+ str);
		System.out.println("-----------------------");
	}
	public Foo(int num ,String str, boolean flag) {
		System.out.println("Foo 객체 생성 : Foo(int, String, boolean) 호출");
		System.out.println("num : "+ num);
		System.out.println("str : "+ str);
		System.out.println("flag : "+ flag);
		System.out.println("-----------------------");
	}
	public Foo(Bar bar) {
		System.out.println("Foo 객체 생성 : Foo(Bar) 호출");
		System.out.println("bar : " + bar);
		System.out.println("-----------------------");
	}
}
