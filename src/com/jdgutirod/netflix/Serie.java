package com.jdgutirod.netflix;

public class Serie extends Contenido
{
	// ATRIBUTOS
	private int numeroTemporadas;
	
	
	// CONSTRUCTORES
	public Serie( )
	{
		super( );
		this.numeroTemporadas = 1;
	}
		
	public Serie( String titulo, String creador )
	{
		super( titulo, creador );
		this.numeroTemporadas = 1;
	}
	
	public Serie( String titulo, String genero, String creador, int numeroTemporadas, int duracion )
	{
		super( titulo, genero, creador, duracion );
		this.numeroTemporadas = numeroTemporadas;
	}
	
	// GETTERS AND SETTERS
	public int getNumeroTemporadas( ) {
		return numeroTemporadas;
	}
	public void setNumeroTemporadas( int numeroTemporadas ) {
		this.numeroTemporadas = numeroTemporadas;
	}
	
	
	// MÉTODOS
	@Override
	public String toString( )
	{
		String serie = "";
		
		serie += "Título: " + this.getTitulo( ) + "\n";
		serie += "Género: " + this.getGenero( ) + "\n";
		serie += "Creador: " + this.getCreador( ) + "\n";
		serie += "Temporadas: " + this.getNumeroTemporadas( ) + "\n";
		serie += "Duración: " + this.getDuracion( ) + " minutos\n";
		
		if ( this.esVisto() ) {
			serie += "Visto: Si\n";
		}
		else {
			serie += "Visto: No\n";
		}
		
		return serie;
	}
}
