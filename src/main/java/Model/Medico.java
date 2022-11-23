/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author darloonlino
 */
public class Medico extends Pessoa {
    private String cro;
    private String especializacao;

    public Medico() {
        this.cro = "";
        this.especializacao = "";
    }

    public String imprimir(){
        String saida = "";
        saida = "**********Dados Cliente*********\n"+
                "Nome: "+this.getNome()+"\n"+
                "CPF: "+this.getCpf() + "\n"+
                "Idade: "+this.getIdade() +"\n"+
                "Endereço: "+this.getEndereco() + "\n"+
                "Sexo: "+this.getSexo() +"\n"+
                "Telefone: "+this.getTelefone()+"\n"+
                "CRO: "+this.cro+"\n"+
                "Especialização: "+this.especializacao+"\n"+
                "*************************************\n";
        return saida;   
    }
    
    @Override
    public void setSexo(char sexo) {
        super.setSexo(sexo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char getSexo() {
        return super.getSexo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEndereco() {
        return super.getEndereco(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIdade() {
        return super.getIdade(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCpf() {
        return super.getCpf(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelefone(String telefone) {
        super.setTelefone(telefone); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelefone() {
        return super.getTelefone(); //To change body of generated methods, choose Tools | Templates.
    }


    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    
}
