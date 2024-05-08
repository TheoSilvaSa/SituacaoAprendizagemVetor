package joaovitor.trabalhoujeverson.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraVetorial {
    
    List<Vetor> listaVetor;
    
    public CalculadoraVetorial(ArrayList<Vetor> listaVetor){
        this.listaVetor = listaVetor;
    }
    
    //LUIZ
    public void Magnitude(){
        
        /*
        ESCREVER A SOLUÇÃO NESSA FUNÇÃO, PEDINDO PRO USUÁRIO QUAL O VETOR QUE ELE DESEJA
        SABER A MAGNITUDE, PODE-SE ALTERAR DA MANEIRA QUE DESEJAR ESSA FUNÇÃO
        E USANDO OS VETORES DA listaVetor que está aqui nesse objeto ali mais acima
        ESCREVER NA TELA A PARTIR DESSA FUNÇÃO, POR ISSO VOID
        */
        
    }
    
    //THEO
    public void ProdutoEscalar(){
        
        int a,b;
        
        System.out.println("Selecione 2 vetores da lista de vetores que será apresentada");
        for(int i = 0; i < listaVetor.size(); i++){
            System.out.println("Vetor na Posição " +(i+1)+": "+ listaVetor.get(i).dadosVetor());
        }
        
        System.out.println("Informe o primeiro vetor que deseja utilizar");
        a = readInt();
        
        System.out.println("Informe o segundo vetor que deseja utilizar");
        b = readInt();
        
        Vetor vetor1 = listaVetor.get(a-1);
        Vetor vetor2 = listaVetor.get(b-1);
        
        double produtoEscalar = (vetor1.coordenadaX*vetor2.coordenadaX)+
                                (vetor1.coordenadaY*vetor2.coordenadaY)+
                                (vetor1.coordenadaZ*vetor2.coordenadaZ);
        System.out.println("O produto escalar é: " + produtoEscalar);
    }
    
    //GUSTAVO
    public void AnguloEntreVetores(){
        /*
        ESCREVER A SOLUÇÃO NESSA FUNÇÃO, PEDINDO PRO USUÁRIO QUAL O VETOR QUE ELE DESEJA
        SABER A MAGNITUDE, PODE-SE ALTERAR DA MANEIRA QUE DESEJAR ESSA FUNÇÃO
        E USANDO OS VETORES DA listaVetor que está aqui nesse objeto ali mais acima
        ESCREVER NA TELA A PARTIR DESSA FUNÇÃO, POR ISSO VOID
        */
    }
    
    //BIER
    public boolean isOrtogonal(){
        
        int a,b;
        
        System.out.println("Selecione 2 vetores da lista de vetores que será apresentada");
        for(int i = 0; i < listaVetor.size(); i++){
            System.out.println("Vetor na Posição " +(i+1)+": "+ listaVetor.get(i).dadosVetor());
        }
        
        System.out.println("Informe o primeiro vetor que deseja utilizar");
        a = readInt();
        
        System.out.println("Informe o segundo vetor que deseja utilizar");
        b = readInt();
        
        Vetor vetor1 = listaVetor.get(a-1);
        Vetor vetor2 = listaVetor.get(b-1);
        
        double produtoEscalar = (vetor1.coordenadaX*vetor2.coordenadaX)+
                                (vetor1.coordenadaY*vetor2.coordenadaY)+
                                (vetor1.coordenadaZ*vetor2.coordenadaZ);
        System.out.println("O produto escalar é: " + produtoEscalar);
        
        if(produtoEscalar == 0){
            return true;
        }else return false;     
    }
    
    //BIER
    public void ProdutoVetorial(){
        /*
        ESCREVER A SOLUÇÃO NESSA FUNÇÃO, PEDINDO PRO USUÁRIO QUAL O VETOR QUE ELE DESEJA
        SABER A MAGNITUDE, PODE-SE ALTERAR DA MANEIRA QUE DESEJAR ESSA FUNÇÃO
        E USANDO OS VETORES DA listaVetor que está aqui nesse objeto ali mais acima
        ESCREVER NA TELA A PARTIR DESSA FUNÇÃO, POR ISSO VOID
        */
    }
    
    static Scanner scanner = new Scanner(System.in);
    static int readInt() {
		while(true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.print("Informe apenas números inteiros: ");
			}
			
		}
		
    }
    
}
