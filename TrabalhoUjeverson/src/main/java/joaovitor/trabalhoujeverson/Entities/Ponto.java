/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joaovitor.trabalhoujeverson.Entities;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ponto {
    
    Scanner scanner = new Scanner(System.in);
    int x;
    int y;
    
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Ponto(){}
    
    public String dadosPonto(){
        return "X: " + this.x + " Y: "+ this.y;
    }
    
    public void RegistrarPonto(){
        this.x = 0;
        this.y = 0;
        int x,y;
        
        System.out.println("Registrando um Ponto do Vetor");
        
        System.out.println("X: "); 
        x = scanner.nextInt(); 
        
        System.out.println("Y: "); 
        y = scanner.nextInt();
        
        this.x = x;
        this.y = y;
        System.out.println("Ponto Registrado com Sucesso!");
    }
    
}
