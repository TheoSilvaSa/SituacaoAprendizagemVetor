package joaovitor.trabalhoujeverson;

import java.util.ArrayList;
import java.util.Scanner;
import joaovitor.trabalhoujeverson.Entities.CalculadoraVetorial;
import joaovitor.trabalhoujeverson.Entities.Ponto;
import joaovitor.trabalhoujeverson.Entities.Vetor;

public class TrabalhoUjeverson {

    public static void main(String[] args) {
       
        ArrayList<Vetor> listaVetor = new ArrayList<Vetor>();
        Scanner scanner = new Scanner(System.in);
        
        int responseMainMenu = 0;
        
        do{
            int responseSubMenu = 0;
            System.out.println("Olá, bem vindo a calculadora de vetores matemáticos!");
            System.out.println("Você tem as seguintes opções: ");
            System.out.println("1- Registrar um novo vetor");
            System.out.println("2- Mostrar todos vetores registrados");
            System.out.println("3- Fazer operações com os vetores (necessários ter registrado ao menos dois vetores)");
            System.out.println("4- Sair");
            responseSubMenu = scanner.nextInt();
            
            switch(responseSubMenu){
                
                case 1: 
                    int responseRegistrarVetor = 0;
                    do{
                        if(listaVetor.size() < 2){
                            System.out.println("Registre ao mínimo dois vetores");
                            for(int i = 0; i < 2; i++){
                                Ponto a = new Ponto();
                                a.RegistrarPonto();

                                Ponto b = new Ponto();
                                b.RegistrarPonto();

                                Vetor vetor = new Vetor(a,b);
                                listaVetor.add(vetor);

                                System.out.println("Vetor " + i + " registrado!");
                                
                            }
                        }else{
                            System.out.println("Registrando um vetor!");
                            Ponto a = new Ponto();
                            a.RegistrarPonto();

                            Ponto b = new Ponto();
                            b.RegistrarPonto();

                            Vetor vetor = new Vetor(a,b);
                            listaVetor.add(vetor);

                            System.out.println("Vetor registrado!");
                            
                        }
                        
                        System.out.println("Deseja registrar mais vetores? (1-SIM/2-NÃO)");
                        responseRegistrarVetor = scanner.nextInt();
                        
                    }while(responseRegistrarVetor != 2);
                    break;
                    
                case 2:
                    for(int i = 0; i < listaVetor.size(); i++){
                        System.out.println(listaVetor.get(i).dadosVetor());
                    }
                    break;
                    
                case 3:
                    if(listaVetor.isEmpty()){
                        System.out.println("Sua lista está vazia, operações com ela são impossíveis, preencha com pelo menos 2 vetores");
                        break;
                    }
                    CalculadoraVetorial calculadora = new CalculadoraVetorial(listaVetor);
                    int operation = 0;
                    System.out.println("Qual operação desejas fazer?");
                    System.out.println("1- Calcular Magnitude");
                    System.out.println("2- Produto Escalar");
                    System.out.println("3- Ângulo entre Vetores");
                    System.out.println("4- Ortogonalidade");
                    System.out.println("5- Produto Vetorial");
                    System.out.println("6- Sair");
                    operation = scanner.nextInt();
                    
                    switch(operation){
                        
                        case 1: calculadora.Magnitude();
                                break;
                                
                        case 2: calculadora.ProdutoEscalar();
                                break;
                                
                        case 3: calculadora.AnguloEntreVetores();
                                break;
                                
                        case 4: boolean result = (calculadora.Ortogonalidade());
                                System.out.println(result);
                                break;
                        
                        case 5: calculadora.ProdutoVetorial();
                                break;
                        
                        case 6: System.out.println("Sair!");
                                break;
                                
                    }
                    break;
       
                case 4: 
                    break;
            }
            
           
            System.out.println("Deseja Encerrar o programa? (1-SIM/2-NÃO)");
            responseMainMenu = scanner.nextInt();
            
            
            
        }while(responseMainMenu != 1);
        
    }
}
