/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joaovitor.trabalhoujeverson.Entities;

/**
 *
 * @author Aluno
 */
public class Vetor {
    
    Ponto a;
    Ponto b;
    
    public Vetor(Ponto a, Ponto b){
        this.a = a;
        this.b = b;
    }
    
    public String dadosVetor(){
        return "-------------------------------------------------" + "\n" +
               "Dados do ponto A: " + a.dadosPonto()+ "\n" +
               "Dados do ponto B: " + b.dadosPonto()+ "\n" +
               "-------------------------------------------------";
    }
    
}
