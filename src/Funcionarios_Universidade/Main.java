package Funcionarios_Universidade;

import Pessoa_Fornecedor_Colaborador.Administrador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Professor> lista = new ArrayList<>();

        Professor professor = new Professor("Luiz", "99999999", 1, "Docentes Feusp", 5000, "Doutorado", "Educação 1", 60, 1);
        Professor professor1 = new Professor("Antonio", "99999999", 2, "Docentes Feusp", 5000, "Doutorado", "Educação 1", 120, 2);
        Professor professor2 = new Professor("Felipe", "99999999", 3, "Docentes Feusp", 5000, "Doutorado", "Educação 1", 100, 3);
        Professor professor3 = new Professor("Mariana", "99999999", 3, "Docentes Feusp", 5000, "Doutorado", "Educação 1", 100, 3);
        Administrativo adm = new Administrativo("Luiza", "77777777", 4, "Seção de alunos Feusp", 2000, "Auxiliar", "Júnior");

        lista.add(professor);
        lista.add(professor1);
        lista.add(professor2);

        Coordenador coordenador = new Coordenador("Maria", "10101010", 5, "Feusp", 10000, lista);

        coordenador.percorrerLista();
        coordenador.AdicionaProfessor(professor3);
        coordenador.percorrerLista();


    }
}
