package candidatura;

import java.util.Random;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] candidatos = { "CAMILA", "JOÃO", "CARMEN", "TALITA", "MARIA", "LETÍCIA" };
        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }

    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com o candidato " + candidato + " na " + tentativasRealizadas
                    + "ª tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ".");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

}
