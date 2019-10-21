package practice;

public class PracticeMain {
	public static void main(String[] args) {
		FuncList mainFunction = new FuncList();

		Func1 func1 = FuncList::isOdd;
		Func2 func2 = mainFunction::addNamePrefix;


		Func1 funcA = x -> (x % 2 == 1);
		Func2 funcB = (boolean male, String name) -> {
			if (male == true) { return "Mr." + name; }
			else {
				return "Ms." + name;
			}
		};

		System.out.println(funcA.func1(13));
		System.out.println(funcB.func2(false, "田中"));

	}


}
