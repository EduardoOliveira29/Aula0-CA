import java.util.Scanner;

public class Exercicio2 {
    static final int N = 30;

    public static void main(String[] args) {
        int rm[] = new int[N];
        double nota1[] = new double[N];
        double nota2[] = new double[N];
        int rmAprovado[]= new int[N];
        double media[] = new double[N];


        int n=entradaDados(rm, nota1, nota2);
        for (int i = 0; i <n ; i++) {
            System.out.println(rm[i]);

        }
        calculaMedia(n, nota1, nota2,media);
        for (int i=0;i<n;i++){
            System.out.println("------------------------------------");

            System.out.println("rm"+rm[i]+" Média:"+media[i]);
        }
        int nAp=geraListaAprovados(n,rm,media,rmAprovado);
        System.out.println("------------------------------------");
        for (int i=0;i<nAp;i++){
            System.out.println("Aprovados: "+rmAprovado[i]);
        }
    }

    public static int entradaDados(int rm[], double nota1[], double nota2[]){
        Scanner le = new Scanner(System.in);
        System.out.print("Rm do aluno (negativo para encerrar): ");
        int rmLido = le.nextInt();
        int n=0;
        while (n<N && rmLido>0){
            rm[n] = rmLido;
            System.out.print("Nota1: ");
            nota1[n] = le.nextDouble();
            System.out.print("Nota2: ");
            nota2[n] = le.nextDouble();
            n++;
            System.out.print("Rm do aluno (negativo para encerrar): ");
            rmLido = le.nextInt();
        }
        return n;
    }

    public static void calculaMedia(int n,double nota1[], double nota2[], double media[]) {

        for (int i = 0; i < n; i++) {
            media[i] = (nota1[i] + nota2[i]) / 2;
        }

    }

    public static int geraListaAprovados(int n,int rm[],double media[],int rmAprovado[]){
        int nAp = 0;
        for (int i = 0; i < n; i++) {
            if (media[i]>=6){
                rmAprovado[nAp] = rm[i];
                nAp++;
            }
        }
        return nAp;

    }
}
