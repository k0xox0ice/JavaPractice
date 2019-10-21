package practice;

import practice.Enum.Pokemon2;

public class Generics<E> {

	public enum Pokemon {
		type1, type2, ability;
	}

	//フィールド変数
	private int num = 1;
	private Pokemon type1;
	private Pokemon2 typeA;


	//コンストラクタで渡すための変数
	E variable;

	public Generics(E variable) {
		this.variable = variable;
	}

	public void print() {
		System.out.println(num + "：" + variable);
	}

	public E getVariable() {
		return variable;
	}

}
