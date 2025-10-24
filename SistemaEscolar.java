import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] notas = new double[8];
        
        // Entrada das notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }
        
        // Cálculo das médias bimestrais
        double[] mediasBimestrais = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i*2] + notas[i*2 + 1]) / 2.0;
        }
        
        // Cálculo das médias semestrais
        double primeiroSemestre = (mediasBimestrais[0] + mediasBimestrais[1]) / 2.0;
        double segundoSemestre = (mediasBimestrais[2] + mediasBimestrais[3]) / 2.0;
        
        // Média final
        double mediaFinal = (primeiroSemestre + segundoSemestre) / 2.0;
        
        // Saída formatada
        System.out.println("\nResultados:");
        System.out.println("1º Bimestre: " + mediasBimestrais[0]);
        System.out.println("2º Bimestre: " + mediasBimestrais[1]);
        System.out.println("1º Semestre: " + primeiroSemestre);
        System.out.println("-----------------------");
        System.out.println("3º Bimestre: " + mediasBimestrais[2]);
        System.out.println("4º Bimestre: " + mediasBimestrais[3]);
        System.out.println("2º Semestre: " + segundoSemestre);
        System.out.println("\nMédia Final: " + mediaFinal);
        
        sc.close();
    }
}