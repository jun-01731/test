
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Person3 taro=new Person3();
		taro.name="taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person3 jiro=new Person3("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);


		Person3 saburo=new Person3("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);


		Person3 name=new Person3(25);
		System.out.println(name.name);
		System.out.println(name.age);


		Person3 hanako=new Person3(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);

	}

}