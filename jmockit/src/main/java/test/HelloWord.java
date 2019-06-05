package test;

public class HelloWord {

	public String sayHello(Fruit f) {
		if (f == null) {
			return "只能介绍水果，请传入需要介绍的水果";
		}
		try {
			String result = "下面介绍一种水果：" + f.showSelf();
			return result;
		} catch (Exception e) {
			return "水果坏了";
		}
	}

}
