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

public class Vetor {
    
    double coordenadaX, coordenadaY, coordenadaZ;
    
    public Vetor(double x, double y, double z){
        this.coordenadaX = x;
        this.coordenadaY = y;
        this.coordenadaZ = z;
    }
    
    public Vetor(){}
    
    public void registrarVetor(){
        this.coordenadaX = 0;
        this.coordenadaY = 0;
        this.coordenadaZ = 0;
        double x,y,z;
        
        System.out.println("Registrando o Vetor");
        
        System.out.println("X: "); 
        x = readDouble(); 
        
        System.out.println("Y: "); 
        y = readDouble();
        
        System.out.println("Z: (Coloque ZERO se vc deseja um vetor 2D)"); 
        z = readDouble();
        
        this.coordenadaX = x;
        this.coordenadaY = y;
        this.coordenadaZ = z;
        System.out.println("Ponto Registrado com Sucesso!");
    }
    
    public String dadosVetor(){
        return  "Vetor("+this.coordenadaX+ ","+this.coordenadaY+ ","+ this.coordenadaZ+ ")";
    }
    
    static Scanner scanner = new Scanner(System.in);
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
