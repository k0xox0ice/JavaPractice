package practice;

//引数: ジェネリクス<T>   戻り値: ジェネリクス<R>
import java.util.function.Function;
//引数: int型、int型   戻り値: int型
import java.util.function.IntBinaryOperator;
//引数: int型  戻り値: void
import java.util.function.IntConsumer;
//引数: int型   戻り値: ジェネリクス
import java.util.function.IntFunction;
//引数: int型   戻り値: boolean型
import java.util.function.IntPredicate;
//引数: int型   戻り値: long型
import java.util.function.IntToLongFunction;
//引数: int型   戻り値: int型
import java.util.function.IntUnaryOperator;


public class Lambda {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int x = 123456789;

		Pokemon rukario = new Pokemon(1, 1, 1, "ルカリオ");

		//変数に関数(Pokemonクラスのメソッド)を格納する
		IntPredicate function = rukario::isCheakParameter;
		//変数から関数を呼び出す
		boolean result = function.test(35);
		//関数の実行結果を出力
		System.out.println("結果：" + result);

		System.out.println();
		//関数の処理内容を定義し変数に格納する(ただし、その場で記述する)
		IntBinaryOperator function2 = (int a, int b) -> {
			int c = a * b + (a + b) - a * 2;
			return c;
		};
		//関数を実行する
		int result2 = function2.applyAsInt(3, 7);
		//function2の実行結果を出力する
		System.out.println("result2：" + result2);

		System.out.println();
		//関数に与える引数の記述を省略する
		IntBinaryOperator function3 = (a, b) -> {
			return a * a * b - a + (a * 2 + b);
		};
		//関数を実行する
		int result3 = function3.applyAsInt(84, 52);
		System.out.println("result3：" + result3);

		System.out.println();
		//引数が1つだけの関数の処理内容を定義する場合、引数の()を省略できる
		IntToLongFunction function4 = a -> { return a * 999999999 * 55555 * 47854 * a + 546213; };
		//関数の処理結果を出力する
		long result4 = function4.applyAsLong(8945);
		System.out.println("result4：" + result4);

		System.out.println();
		//関数外部の値を使用して定義する
		IntUnaryOperator function5 = a -> { return a * x + x * x;};
		System.out.println(function5.applyAsInt(55));
		//関数の実行結果を出力する
		int result5 = function5.applyAsInt(55);
		System.out.println("result5：" +  result5);

		System.out.println();
		//戻り値が無いインタフェースを使用する
		IntConsumer function6 = a -> {
			int b = a * x + a * a;
			System.out.println(b);
			};

		function6.accept(42);

		System.out.println();
		//ジェネリクスを使用しているインタフェースを使用する
		IntFunction<String> function7 = a -> { return String.valueOf(a + x * x); };
		System.out.println(function7.apply(36));

		System.out.println();
		Function<String, Long> function8 = a -> { return Long.parseLong(a);};
		Long result8 = function8.apply("5546");
		System.out.println("result8：" + result8);


		System.out.println();
		//ラムダ式を使用しない
		Calculation cal = new Calculation() {
			@Override
			public int calculation(int a, int b) {
				return a + b * b;
			}
		};

		System.out.println(cal.calculation(55, 82));

		//ラムダ式に書き直す
		Calculation calFunction = (a, b) -> { return a + b * b; };
		System.out.println(calFunction.calculation(55, 82));

	}

}
