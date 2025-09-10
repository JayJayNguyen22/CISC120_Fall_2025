import java.text.DecimalFormat;
public class WindChill{
	public static void main(String[] args) {
		double temperature = Double.parseDouble(args[0]);
		double speed = Double.parseDouble(args[1]);
		double w = 35.74 + 0.6215 * temperature + (0.4275*temperature -35.75)*Math.pow(speed,0.16);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(w));
} 
}