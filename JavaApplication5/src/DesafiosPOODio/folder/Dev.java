/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesafiosPOODio.folder;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class Dev {
    
    private String nome; 
    private Set<Conteudo> inscritos = new LinkedHashSet<>();
    private Set<Conteudo> concluidos = new LinkedHashSet<>();
    
    public void inscreverBootcamp(Bootcamp bootcamp){
    
    this.inscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsinscritos().add(this);
    
    }
    public void progeção(){
    
        Optional<Conteudo> conteudo = this.inscritos.stream().findFirst();
    if(conteudo.isPresent()){this.concluidos.add(conteudo.get());
    this.inscritos.remove(conteudo.get());} 
    else 
    {JOptionPane.showMessageDialog(null, "ERRO, a inscrição não tem matricula em nenhuma aera!");}
    
    
    
    
    
    }
    public double calculototal(){
    
    return this.concluidos.stream().mapToDouble(conteudo -> conteudo.calculoxp()).sum();
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getInscritos() {
        return inscritos;
    }

    public void setInscritos(Set<Conteudo> inscritos) {
        this.inscritos = inscritos;
    }

    public Set<Conteudo> getConcluidos() {
        return concluidos;
    }

    public void setConcluidos(Set<Conteudo> concluidos) {
        this.concluidos = concluidos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.inscritos);
        hash = 47 * hash + Objects.hashCode(this.concluidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev other = (Dev) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.inscritos, other.inscritos)) {
            return false;
        }
        return Objects.equals(this.concluidos, other.concluidos);
    }
    
    
}
