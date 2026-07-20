/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon;

/**
 *
 * @author curso
 */
public class Pokemon {
String nome;
String tipo;
int nivel;
int vidaMaxima;
int vidaAtual;

Pokemon (String nome, String tipo, int nivel, int vidaMaxima){
    this.nome = nome;
    this.tipo = tipo;
    this.nivel = nivel;
    this.vidaMaxima = 100;
    this.vidaAtual = 100;
    
    
}
    void exibirFicha(){
        System.out.println("Nome: %s \n Tipo: %s \n Nivel: %f \n VidaMax: %f \n VidaAtual: %f \n"  + nome + tipo + nivel + vidaMaxima + vidaAtual);
        
    }
   void receberDano(int quantidade){
       if(vidaAtual > 0){
           return vidaAtual - quantidade;
       }else{
           System.out.println("Seu Pokemon esta morto");
       }
   }
   void recuperarTotal(){
       return vidaAtual = vidaMaxima;
   }
   void exibirEquipe(Pokemon[] equipe){
         for(int i = 0; i < equipe.length; i ++){
             return exibirFicha();
         }
     }
    void curarEquipe(Pokemon[] equipe){
         for(int i = 0; i < equipe.length; i ++){
             return recuperarTotal();
             System.out.println("Enfermeira Joy curou sua equipe\n");
         }
}
}
