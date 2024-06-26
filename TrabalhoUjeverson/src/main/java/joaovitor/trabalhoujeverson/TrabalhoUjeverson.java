package joaovitor.trabalhoujeverson;

import java.util.ArrayList;
import java.util.Scanner;
import joaovitor.trabalhoujeverson.Entities.CalculadoraVetorial;
import joaovitor.trabalhoujeverson.Entities.Vetor;

public class TrabalhoUjeverson {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        CalculadoraVetorial calculadora = new CalculadoraVetorial();
        System.out.println("CONHECEDORES DO OCULTO! SA");
        int responseMainMenu = 0;
        
        do{
            int responseSubMenu = 0;
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("Olá, bem vindo a calculadora de vetores matemáticos!");
            System.out.println("Você tem as seguintes opções: ");
            System.out.println("1- Registrar um novo vetor");
            System.out.println("2- Mostrar todos vetores registrados");
            System.out.println("3- Fazer operações com os vetores (necessários ter registrado ao menos dois vetores)");
            System.out.println("4- Sair");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println();
            responseSubMenu = readInt();
            
            switch(responseSubMenu){
                
                case 1: 
                    int responseRegistrarVetor = 0;
                    do{
                        if(calculadora.listaVetor.size() < 2){
                            System.out.println("Registre ao mínimo dois vetores");
                            for(int i = 0; i < 2; i++){
                                
                                Vetor a = new Vetor(); //instancia um vetor vazio 
                                a.registrarVetor(); //coloca o x,y,z do vetor
                                //listaVetor.add(a); //adiciona o vetor na lista
                                calculadora.listaVetor.add(a); //adiciona o vetor na lista da calculadora
                                int tamanho = calculadora.listaVetor.size();
                                System.out.println("Vetor "+ tamanho +" registrado!");
                                System.out.println(a.dadosVetor());
                                
                            }
                        }else{
                            System.out.println("Registrando um vetor!");
                            
                            Vetor a = new Vetor(); //instancia um vetor vazio 
                            a.registrarVetor(); //coloca o x,y,z do vetor
                            calculadora.listaVetor.add(a); //adiciona o vetor na lista

                            int tamanho = calculadora.listaVetor.size();
                            System.out.println("Vetor "+ tamanho +" registrado!");
                            System.out.println(a.dadosVetor());
                        }
                        
                        System.out.println("Deseja registrar mais vetores? (1-SIM/2-NÃO)");
                        responseRegistrarVetor = readInt();
                        
                    }while(responseRegistrarVetor == 1);
                    responseMainMenu = 2;
                    break;
                    
                case 2:
                    for(int i = 0; i < calculadora.listaVetor.size(); i++){
                        
                        System.out.println("Vetor na Posição " +(i+1)+": "+ calculadora.listaVetor.get(i).dadosVetor());
                    }
                    responseMainMenu = 2;
                    break;
                    
                case 3:
                    if(calculadora.listaVetor.isEmpty()){
                        System.out.println("Sua lista está vazia, operações com ela são impossíveis, preencha com pelo menos 2 vetores");
                        responseMainMenu = 2;
                        break;
                    }
                    //CalculadoraVetorial calculadora = new CalculadoraVetorial(listaVetor);
                    int operation = 0;
                    System.out.println("Qual operação desejas fazer?");
                    System.out.println("1- Calcular Magnitude/Módulo");
                    System.out.println("2- Produto Escalar");
                    System.out.println("3- Ângulo entre Vetores");
                    System.out.println("4- Ortogonalidade");
                    System.out.println("5- Produto Vetorial");
                    System.out.println("6- Sair");
                    operation = readInt();
                    
                    switch(operation){
                        
                        case 1: calculadora.Magnitude();
                                break;
                                
                        case 2: calculadora.ProdutoEscalar();
                                break;
                                
                        case 3: calculadora.AnguloEntreVetores();
                                break;
                                
                        case 4: calculadora.isOrtogonal();
                                break;
                        
                        case 5: calculadora.ProdutoVetorial();
                                break;
                        
                        case 6: System.out.println("Sair!");
                                break;
                                
                    }
                    responseMainMenu = 2;
                    break;
       
                case 4: 
                        responseSubMenu = 2;
                        responseMainMenu =1;
                    break;
            }
            
           
            //System.out.println("Deseja Encerrar o programa? (1-SIM/2-NÃO)");
            //responseMainMenu = readInt();
            
        }while(responseMainMenu == 2);
       
        
        
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