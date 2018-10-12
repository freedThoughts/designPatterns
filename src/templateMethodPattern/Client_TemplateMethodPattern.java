package templateMethodPattern;

public class Client_TemplateMethodPattern {

	public static void main(String[] args) {
		Home home = new FlatAsHome();
		home.getMeAHome_TemplateMethod(true);
		
		
		Home home2 = new BangalowAsHome();
		home2.getMeAHome_TemplateMethod(false);

	}

}
