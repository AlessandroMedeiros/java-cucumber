import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = Integer.parseInt(ler.nextLine());
        double b = Double.parseDouble(ler.nextLine());
        calculaConsumo(a, b);
    }

    public static String calculaConsumo(int km, double litros){
        Double resultado = km / litros;
        DecimalFormat df = new DecimalFormat("###.###");
        df.setRoundingMode(RoundingMode.UP);
        System.out.println(df.format(resultado) + " km/l");
        return df.format(resultado) + " km/l";
    }
}
