package practice;

public class Exec {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pokemon_DisplaySystem display  = new Pokemon_DisplaySystem();

		//Pokemon_BattleSystem regionName = new Karosu(80);
		//display.run(regionName);

		display.run(new Karosu(60));
		Karosu karosu = new Karosu(60);

		System.out.println("***************************");
		display.run(new Arora(40));
		Arora arora = new Arora(60);

		System.out.println("***************************");
		Houen houen = new Houen(80);
		display.run(houen);

		System.out.println("---------------------------");
		System.out.println(houen.remakeInformation());
		System.out.println(houen.generationNumber());

		System.out.println();
		System.out.println(houen.equals(karosu));
		System.out.println(karosu.equals(arora));
		System.out.println(arora.equals(arora));






	}

}
