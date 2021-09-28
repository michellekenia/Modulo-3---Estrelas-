package Funcionarios_Universidade;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionarios {

    private List<Professor> professoresSupervisionados;

    public Coordenador(String nome, String cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, List<Professor> professoresSupervisionados) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public List<Professor> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<Professor> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    @Override
    public double AumentaSalario() {
        double salarioComAumento = (0.05 * this.getSalario() + this.getSalario());
        this.setSalario(salarioComAumento);
        return salarioComAumento;
    }

    public List<Professor> AdicionaProfessor(Professor adicionaProfessor) {
        professoresSupervisionados.add(adicionaProfessor);
        return professoresSupervisionados;

    }

    public void percorrerLista() {
        System.out.println("Lista de professores supervisionados pelo coordenador " + getNome() + ": ");
        for (Professor referencia : professoresSupervisionados) {
            System.out.println("Nome: " + referencia.getNome());
            System.out.println("Disciplina" + referencia.getDisciplinaMinistrada());
        }
    }

}
