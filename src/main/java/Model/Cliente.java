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
public class Cliente extends Pessoa{
    private String alergias;

    public Cliente() {
        this.alergias = "";
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
                "Alergias: "+this.alergias+"\n"+
                "*************************************\n";
        return saida;   
    }
    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    @Override
    public void setSexo(char sexo) {
        super.setSexo(sexo); 
    }

    @Override
    public char getSexo() {
        return super.getSexo(); 
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco); 
    }

    @Override
    public String getEndereco() {
        return super.getEndereco(); 
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade); 
    }

    @Override
    public int getIdade() {
        return super.getIdade(); 
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf); 
    }

    @Override
    public String getCpf() {
        return super.getCpf(); 
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); 
    }

    @Override
    public String getNome() {
        return super.getNome(); 
    }

    @Override
    public void setTelefone(String telefone) {
        super.setTelefone(telefone); 
    }

    @Override
    public String getTelefone() {
        return super.getTelefone();
    }
    
}
