package strategy;
import java.util.Scanner;

public class AplicativoHarryPotter {
    public static void main(String[] args) {
        // Criar objeto de bruxo.
        Bruxo harryPotter = new Bruxo();

        // Ler o feitiço desejado a partir da entrada do usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do feitiço desejado  usando as aspas as ('') ");
        String nomeFeitiço = scanner.nextLine();

        if (nomeFeitiço.equals("Avada Kedavra")) {
            harryPotter.setFeitiço(new AvadaKedavra());
        } else if (nomeFeitiço.equals("Expelliarmus")) {
            harryPotter.setFeitiço(new Expelliarmus());
        } else if (nomeFeitiço.equals("Wingardium Leviosa")) {
            harryPotter.setFeitiço(new WingardiumLeviosa());
        } else {
            System.out.println("Feitiço lançado!");
            scanner.close();
            return;
        }

        harryPotter.lançarFeitiço();

        scanner.close();
    }
}

