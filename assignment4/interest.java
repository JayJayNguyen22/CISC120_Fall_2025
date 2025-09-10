import java.text.DecimalFormat;
public class interest {
	public static void main(String[] args) {
		float money = Float.parseFloat(args[0]);
		int years = Integer.parseInt(args[1]);
		float interest = Float.parseFloat(args[2]);
		for ( int i = 0; i < years; i++) {
			money = money + money * interest;
			}
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(money));
} 
}