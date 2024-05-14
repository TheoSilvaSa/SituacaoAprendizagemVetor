package joaovitor.trabalhoujeverson.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraVetorial {
    
    public List<Vetor> listaVetor = new ArrayList<Vetor>();
    
    public CalculadoraVetorial(){}
    
    //LUIZ
    public void Magnitude(){
        
        /*
        ESCREVER A SOLUÇÃO NESSA FUNÇÃO, PEDINDO PRO USUÁRIO QUAL O VETOR QUE ELE DESEJA
        SABER A MAGNITUDE, PODE-SE ALTERAR DA MANEIRA QUE DESEJAR ESSA FUNÇÃO
        E USANDO OS VETORES DA listaVetor que está aqui nesse objeto ali mais acima
        ESCREVER NA TELA A PARTIR DESSA FUNÇÃO, POR ISSO VOID
        */
        
    }
    
    //BIER
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
            System.out.println("São ortogonais");
            return true;
        }else{ 
            System.out.println("Não são ortogonais");
            return false;
        }     
    }
    
    //THEO
    public void ProdutoVetorial(){
        
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
        
        double x = (vetor1.coordenadaY*vetor2.coordenadaZ - vetor1.coordenadaZ*vetor2.coordenadaY);
        double y = (vetor1.coordenadaZ*vetor2.coordenadaX - vetor1.coordenadaX*vetor2.coordenadaZ);
        double z = (vetor1.coordenadaX*vetor2.coordenadaY - vetor1.coordenadaY*vetor2.coordenadaX);
        System.out.println("O produto vetorial é: ("+x+","+y+","+z+")");
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
    
    static double readDouble() {
		while(true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.print("Informe apenas números: ");
			}
			
		}
		
    }    
    
}
