package feevale.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Calendar;

import javax.swing.JFileChooser;

import feevale.attendance.Attendance;

public class ReadFile {
	/**
	 *         Como inicio de programa, imaginei que 
	 *     podemos receber a entrada de um dos arquivos 
	 *     de dados, em formato txt ou csv, entao 
	 *     iniciamos a criacao das estimativas do 
	 *     simulador.
	 *     
	**/
	
	private static final String DELIMITADOR = ";";
	
	public ReadFile() {
		BufferedReader leDados = null;
		String linha = null;
		
		try {
			JFileChooser arquivo = new JFileChooser();
			arquivo.setDialogTitle( "Selecione o arquivo de dados" );
			arquivo.setDialogType( JFileChooser.OPEN_DIALOG );
			arquivo.setApproveButtonText( "OK" );
			arquivo.setFileSelectionMode( JFileChooser.FILES_ONLY );
			arquivo.setMultiSelectionEnabled( true );
			arquivo.showOpenDialog( arquivo );
			
			leDados = new BufferedReader( new InputStreamReader( new FileInputStream( arquivo.getSelectedFile() ) ) );
			
			while( ( linha = leDados.readLine() ) != null ) {
				String[] dadosUsuario = linha.split( DELIMITADOR );
				Attendance atendimento = new Attendance();
				atendimento.setProblemaAtendido(dadosUsuario[0]);
				atendimento.setCategoria(dadosUsuario[1]);
				atendimento.setPrioridade(Integer.valueOf(dadosUsuario[2]));
				atendimento.setHoraInicioAtendimento(LocalTime.parse(dadosUsuario[3]));
				atendimento.setHoraFimAtendimento(LocalTime.parse(dadosUsuario[4]));
				atendimento.setTempoTotalAtendimento(LocalTime.parse(dadosUsuario[5]));
				atendimento.setHoraRecebido(LocalTime.parse(dadosUsuario[6]));
				atendimento.setFila(Boolean.getBoolean(dadosUsuario[7]));
				atendimento.setNomeColaborador(dadosUsuario[8]);

//				System.out.println( Arrays.toString( dadosUsuario ) );
                System.out.println(atendimento.toString());
			}

			leDados.close();
			
		} catch( Exception error ) {
			System.out.println( "Erro ao receber arquivo de entrada. " );
			error.printStackTrace();
		}
		
	}
	
}
