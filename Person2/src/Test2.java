
public class Test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person2 taro=new Person2();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);

		taro.talk();
		taro.walk();
		taro.run();


		Person2 jiro=new Person2();
		jiro.name="木村次郎";
		jiro.age=18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);



		Person2 hanako=new Person2();
		hanako.name="鈴木花子";
		hanako.age=16;
		System.out.println(hanako.name);
		System.out.println(hanako.age);



	    Robot aibo=new Robot();
	    aibo.name="あいぼ";
	    aibo.talk();
	    aibo.walk();
	    aibo.run();

	    Robot asimo=new Robot();
	    asimo.name="アシモ";
	    asimo.talk();
	    asimo.walk();
	    asimo.run();

	    Robot pepper=new Robot();
	    pepper.name="ペッパー";
	    pepper.talk();
	    pepper.walk();
	    pepper.run();
	    
	    Robot doraemon=new Robot();
	    doraemon.name="ドラえもん";
	    doraemon.talk();
	    doraemon.walk();
	    doraemon.run();



	}

}