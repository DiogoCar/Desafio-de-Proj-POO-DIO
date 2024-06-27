/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesafiosPOODio.folder;
import java.time.LocalDate;
/**
 *
 * @author Diogo
 */
public class Mentoria extends Conteudo{
   
     
      private LocalDate data;

      public Mentoria(){
      }
      
      


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria" + "\n"+ "\n"+
                "titulo=" + getTitulo() + "\n"+
                "descricao=" + getDescricao() + "\n"+
                "data=" + data ;
    }

    @Override
    public double calculoxp() {return XP * 2;}
      
      
    
    }
    
