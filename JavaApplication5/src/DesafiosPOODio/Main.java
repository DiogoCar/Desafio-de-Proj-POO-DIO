/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DesafiosPOODio;
import DesafiosPOODio.folder.Conteudo;
import DesafiosPOODio.folder.Curso;
import DesafiosPOODio.folder.Mentoria;
import DesafiosPOODio.folder.Bootcamp;
import DesafiosPOODio.folder.Dev;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Curso cursoA = new Curso();
        Curso cursoB = new Curso();
        Mentoria mentoria = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();
        Dev devFulano = new Dev();
        Dev devCiclano = new Dev();
        
        Conteudo conteudoA = new Curso();
        Conteudo conteudoB = new Mentoria();
        
        cursoA.setTitulo("X");
        cursoA.setDescricao("[...]");
        cursoA.setCargahoraria(1);
        
        cursoB.setTitulo("Y");
        cursoB.setDescricao("[...]");
        cursoB.setCargahoraria(2);
        
        mentoria.setTitulo("Z");
        mentoria.setDescricao("[...]");
        mentoria.setData(LocalDate.now());
        
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("[...]");
        bootcamp.getConteudos().add(cursoA);
        bootcamp.getConteudos().add(cursoB);
        bootcamp.getConteudos().add(mentoria);
        
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        
        
        devCiclano.setNome("Ciclano");
        devCiclano.inscreverBootcamp(bootcamp);
        
        
        /*JOptionPane.showMessageDialog(null, cursoA);
        JOptionPane.showMessageDialog(null, cursoB);
        JOptionPane.showMessageDialog(null, mentoria);*/
        
        
        JOptionPane.showMessageDialog(null, "Fulano"+"\n"+"Conteudos inscritos: "+devFulano.getInscritos());
        devFulano.progeção();
        JOptionPane.showMessageDialog(null, "Conteudos concluidos: "+devFulano.getConcluidos());
        JOptionPane.showMessageDialog(null, "XP: "+devFulano.calculototal());
        
        JOptionPane.showMessageDialog(null, "Ciclano"+"\n"+"Conteudos inscritos: "+devCiclano.getInscritos());
        devCiclano.progeção();
        devCiclano.progeção();
        JOptionPane.showMessageDialog(null, "Conteudos concluidos: "+devCiclano.getConcluidos());
        JOptionPane.showMessageDialog(null, "XP: "+devCiclano.calculototal());
        
// enviar pro github
      
        
    }
    
}
