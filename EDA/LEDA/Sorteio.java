/*
 * 3935 - Sorteio
 
 * Descrição
    Dois sorteios serão realizados em uma cidade do interior. 
    Um vai sortear um carro e o outro uma moto. Para realização do sorteio, os organizadores coletaram os nomes dos participantes em uma lista e os ordenaram em ordem alfabética. Depois, sortearam dois números n1 e n2 representando a posição na lista ordenada dos ganhadores do carro e da moto, respectivamente.
    Porém, algumas pessoas gastaram um pouco mais e se inscreveram nos dois sorteios e agora possuem maior chance de ganhar algum prêmio.
    Mostre o resultado do sorteio.

 * Formato de entrada
    N => Quantidade de pessoas inscritas para o sorteio do carro.
    As próximas N linhas contém os nomes dos participantes do sorteio do carro. Os nomes não tem mais que 10 caracteres e todos os nomes são diferentes.
    M => Quantidade de pessoas inscritas para o sorteio da moto.
    As próximas M linhas contém os nomes dos participantes do sorteio de moto. Os nomes não tem mais que 10 caracteres e todos os nomes são diferentes.
    Na última linha dois números (n1 e n2) indicando os valores sorteados para os sorteios do carro e da moto, respectivamente.

 * Formato de saída
    Se uma pessoa só foi sortuda e ganhou tudo, mostre:
    "Quem ganhou tudo hoje foi [nome]"
    Se os prêmios foram para duas pessoas diferentes, mostre:
    "Quem ganhou o carro foi: [vencedor_carro]"
    "Quem ganhou a moto foi: [vencedor_moto]"
 */
import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] participantesCarro = new String[n];
        for (int i = 0; i < n; i++) {
            participantesCarro[i] = sc.nextLine();
        }
        Arrays.sort(participantesCarro);

        int m = sc.nextInt();
        sc.nextLine();
        String[] participantesMoto = new String[m];
        for (int i = 0; i < m; i++) {
            participantesMoto[i] = sc.nextLine();
        }
        
        Arrays.sort(participantesMoto);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        String vencedorCarro = participantesCarro[n1-1];
        String vencedorMoto = participantesMoto[n2-1];

        if (vencedorCarro.equals(vencedorMoto)) {
            System.out.println("Quem ganhou tudo hoje foi " + vencedorCarro);
        } else {
            System.out.println("Quem ganhou o carro foi: " + vencedorCarro);
            System.out.println("Quem ganhou a moto foi: " + vencedorMoto);
        }
    }
    
}