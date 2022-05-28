
package carrosano;
import java.util.Scanner;
/**
 *
 * @author a13838986
 */
 
public class CarrosAno {
   static class carro{
        int ano;
        String nome;
        String cor;

        public carro(int ano, String nome, String cor) {
            this.ano = ano;
            this.nome = nome;
            this.cor = cor;
        }

       

       

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }
        
        
    }
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int ano = 0;
        String vazio="";
        String nome = null;
        String cor = null;
        System.out.println("digite qtd de carros");
       int n = in.nextInt();
       carro[] a = new carro[n];
       int[] vetor = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Ano do carro");
            ano = in.nextInt();
            vazio = in.nextLine();
            System.out.println("nome do carro");
            nome = in.nextLine();
            System.out.println("cor do carro");
            cor = in.nextLine();
            a[i] = new carro(ano, nome, cor);
            vetor[i] = a[i].getAno();
        }
        
          int cont = 0;
		while(cont<n){
			for(int i = 0; i<(n-1); i++){
				if(vetor[i]>vetor[i+1]){
					int t = vetor[i];
                                       // a[i] = new carro(vetor[i+1], a[i].getNome(), a[i].getCor());
                                        
					vetor[i] = vetor[i+1];
                                        vetor[i+1] = t;
                                        a[i].setAno(vetor[i-1]);
				}
			}
			cont++;
		}
		for(int i = 0; i<n; i++){
                    
			System.out.println("Ano: "+a[i].getAno()+", Nome: "+a[i].getNome()+", Cor: "+a[i].getCor());
                        
		}
        
    }
    
}
