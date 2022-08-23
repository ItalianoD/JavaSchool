import java.util.Scanner;

public class criptoiniciar2 {
    public static void main(String[] args) {
        String palavra;
        int contNum = 0;
        int vog = 0, cons = 0;

        char alfabeto[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w',
                'x', 'y'};
        int contAux = 0;

        System.out.print("Digite a palavra a ser criptografada: ");
        Scanner ler = new Scanner(System.in);
        palavra = ler.nextLine().toLowerCase();
        System.out.print("Resultado: ");
        for (int cont = 0; cont < palavra.length(); cont++) {
            for (int contConsoantes = 0; contConsoantes < 20; contConsoantes++) {
                if (palavra.charAt(cont) == alfabeto[contConsoantes]) {
                    System.out.print(alfabeto[contConsoantes + 1]);
                    contAux++;
                }
            }
            if (contAux == 0) {
                System.out.print(palavra.charAt(cont));
            }
            contAux = 0;

        }
        for (int i = 0; i < palavra.length(); ++i) {
            char c = palavra.charAt(i);
            if (c == 32) continue;
            if (c == 97 | c == 101 | c == 105 | c == 111 | c == 117) {
                vog++;
                continue;
            }
            if (c >= 98 && c <= 122) cons++;

        }for (int i = 0; i < palavra.length(); ++i) {
            char c = palavra.charAt(i);
            if (c >= 48 && c <= 57) contNum++;
        }
        System.out.println("\n Na frase \"" + palavra + "\" temos:\nVogais: " + vog + "\nConsoantes: " + cons);
        System.out.println("Foram digitados :" + contNum);
    }
}


