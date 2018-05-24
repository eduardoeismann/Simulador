package feevale.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.swing.JFileChooser;

public class ReadFile {
	/**
	 *         Como inicio de programa, imaginei que 
	 *     podemos receber a entrada de um dos arquivos 
	 *     de dados, em formato txt ou csv, entao 
	 *     iniciamos a criacao das estimativas do 
	 *     simulador.
	 *     
	**/
	
	private static final String DELIMITADOR = ",";
	
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
				System.out.println( Arrays.toString( dadosUsuario ) );
				
			}
			
			leDados.close();
			
		} catch( Exception error ) {
			System.out.println( "Erro ao receber arquivo de entrada. " );
			error.printStackTrace();
			
		}
		
	}
	
}
