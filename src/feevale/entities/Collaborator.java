package feevale.entities;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collaborator {

    private String nome;

    private List<Categoria> especialidades;

    private LocalTime jornadaDiaria;

    private Attendance tarefaAtual;

    /**
     * Constructor of Collaborator
     *
     * @param nome          the name of collaborator
     * @param jornadaDiaria total daily working time. Example, to 8h 30min, put <code>LocalTime.of(8,30)</code>
     * @param categorias    optional, add a list of Categoria (skills)
     */
    public Collaborator(String nome, LocalTime jornadaDiaria, Categoria... categorias) {
        this.nome = nome;
        this.jornadaDiaria = jornadaDiaria;
        if (categorias == null) {
            this.especialidades = new ArrayList<>();
        } else {
            this.especialidades = Arrays.asList(categorias);
        }
    }

    public void novaEspecialidade(Categoria categoria) {
        this.especialidades.add(categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getJornadaDiaria() {
        return jornadaDiaria;
    }

    public void setJornadaDiaria(LocalTime jornadaDiaria) {
        this.jornadaDiaria = jornadaDiaria;
    }

    public List<Categoria> getEspecialidades() {
        return especialidades;
    }

    public Attendance getTarefaAtual() {
        return tarefaAtual;
    }

    public void setTarefaAtual(Attendance tarefaAtual) {
        this.tarefaAtual = tarefaAtual;
//		System.out.println("Iniciou... - " + getNome() + " : " + getTarefaAtual());
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    long duration = Duration.between(tarefaAtual.getHoraInicioAtendimento(), tarefaAtual.getHoraFimAtendimento()).toMinutes() * 60;
//                System.out.println("Duração: " + duration + " na tarefa " + tarefaAtual);
                    for (int i = 0; i < duration; i++) {
                        //
                    }
//                    Thread.sleep(duration);
                    Collaborator.this.tarefaAtual = null;
//				System.out.println("Terminou... - " + getNome() + " : " + getTarefaAtual());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
