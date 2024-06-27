/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesafiosPOODio.folder;

/**
 *
 * @author Diogo
 */
public class Curso extends Conteudo {

        
     
      private int cargahoraria;

      public Curso(){}
      
      
    

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso" + "\n"+"\n"+
                "titulo=" + 
                getTitulo() + "\n" +
                "descricao=" 
                + getDescricao() + "\n"
                + "cargahoraria=" 
                + cargahoraria;
    }

    @Override
    public double calculoxp() {return XP *cargahoraria;}
}
        
    
    
      
     
    


    
    

