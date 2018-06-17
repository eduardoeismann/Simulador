package feevale;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import feevale.entities.Attendance;
import feevale.entities.Categoria;
import feevale.entities.Collaborator;
import feevale.util.ReadFile;

public class Start {

    public static void main(String args[]) throws InterruptedException {
        final Categoria[] CAT_COLAB_C = {Categoria.COMPUTADOR, Categoria.IMPRESSORA, Categoria.INTERNET, Categoria.SERVIDOR_INFRA, Categoria.SEM_CATEGORIA};
        final Categoria[] CAT_COLAB_G = {Categoria.COMPUTADOR, Categoria.EMAIL, Categoria.IMPRESSORA, Categoria.RELATORIOS, Categoria.SERVIDOR_INFRA};

        Collaborator colaboradorC = new Collaborator("A", LocalTime.of(8, 0), CAT_COLAB_C);

        Collaborator colaboradorG = new Collaborator("B", LocalTime.of(8, 0), CAT_COLAB_G);

        /**
         * Cenário 1: <br/>
         * Dois colaboradores de 8hrs diarias com categorias diferentes
         */
		simular(colaboradorC, colaboradorG);
		simularSemFor(colaboradorC, colaboradorG);
	}

	private static void simular(Collaborator... collaborators) {
		System.out.println("----- Iniciando simulação com for --------");
		ReadFile readFile = new ReadFile();
		List<Attendance> listFila = new ArrayList<>();
        int tarefasAtendidasCount = 0;
        int min = 0;

        for (Attendance task : readFile.getListAtendimento()) {
//            Thread.sleep(Long.valueOf(task.getHoraRecebido().getMinute()));
        	boolean tarefaAceita = false;
			for (Collaborator collaborator : collaborators) {
				if (!tarefaAceita && collaborator.getTarefaAtual() == null && collaborator.getEspecialidades().contains(task.getCategoria())) {
					System.out.println("Entrou " + collaborator.getNome() + " " + task.toString());
					collaborator.setTarefaAtual(task);
					tarefasAtendidasCount++;
					tarefaAceita = true;
				}
			}
			if (!tarefaAceita) {
                task.setFila(Boolean.TRUE);
                System.out.println("Não entrou " + task.toString());
                listFila.add(task);
            } 
        }

        System.out.println("Finalizou simulação");
        System.out.println("2 Colaboradores:");
		for (Collaborator collaborator : collaborators) {
			System.out.println("Colaborador " + collaborator.getNome() + " - " + collaborator.getJornadaDiaria());
		}
        System.out.println(readFile.getListAtendimento().size() + " tarefas no totatl");
        System.out.println(tarefasAtendidasCount + " tarefas atendidas");
        System.out.println(readFile.getListAtendimento().size() - tarefasAtendidasCount + " tarefas não atendidas");
        System.out.println(listFila.size() + " tarefas empilhadas em fila");
		System.out.println("----- Finalizada simulação com for --------");
	}

	private static void simularSemFor(Collaborator colaboradorC, Collaborator colaboradorG) {
		System.out.println("----- Iniciando simulação sem for --------");
		ReadFile readFile = new ReadFile();
		List<Attendance> listFila = new ArrayList<>();
		int tarefasAtendidasCount = 0;
		int min = 0;

		for (Attendance task : readFile.getListAtendimento()) {
			// Thread.sleep(Long.valueOf(task.getHoraRecebido().getMinute()));
			if (colaboradorC.getTarefaAtual() == null && colaboradorC.getEspecialidades().contains(task.getCategoria())) {
				System.out.println("Entrou A " + task.toString());
				colaboradorC.setTarefaAtual(task);
				tarefasAtendidasCount++;
			} else if (colaboradorG.getTarefaAtual() == null && colaboradorG.getEspecialidades().contains(task.getCategoria())) {
				System.out.println("Entrou B " + task.toString());
				colaboradorG.setTarefaAtual(task);
				tarefasAtendidasCount++;
			} else {
				task.setFila(Boolean.TRUE);
				System.out.println("Não entrou " + task.toString());
				listFila.add(task);
			}

		}

		System.out.println("Finalizou simulação");
		System.out.println("2 Colaboradores:");
		System.out.println("Colaborador " + colaboradorC.getNome() + " - " + colaboradorC.getJornadaDiaria());
		System.out.println("Colaborador " + colaboradorG.getNome() + " - " + colaboradorG.getJornadaDiaria());
		System.out.println(readFile.getListAtendimento().size() + " tarefas no totatl");
		System.out.println(tarefasAtendidasCount + " tarefas atendidas");
		System.out.println(readFile.getListAtendimento().size() - tarefasAtendidasCount + " tarefas não atendidas");
		System.out.println(listFila.size() + " tarefas empilhadas em fila");
		System.out.println("----- Finalizada simulação sem for --------");
	}

}
