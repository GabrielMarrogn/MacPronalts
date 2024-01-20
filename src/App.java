import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int a = sc.nextInt();
    

        for(int i =0; i< a; i++){
            int produto = sc.nextInt();
            int qtd = sc.nextInt();

            if(produto == 1001){
                soma += qtd * 1.50;
            }else if(produto == 1002){
                soma += qtd *2.50;
            }else if(produto == 1003){
                soma += qtd * 3.50;
            }else if(produto == 1004){
                soma += qtd *4.50;
            }else if(produto == 1005){
                soma += qtd * 5.50;
            }
        }

        sc.close();

        System.out.printf("%.2f\n", soma);
    }
}
