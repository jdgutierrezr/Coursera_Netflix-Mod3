package com.jdgutirod.netflix;

public class Pelicula extends Contenido
{
	// ATRIBUTOS
	private int año;
	
	
	// CONSTRUCTORES
	public Pelicula( )
	{
		super( );
		this.año = 0;
	}
	
	public Pelicula( String titulo, String creador )
	{
		super( titulo, creador );
		this.año = 0;
	}
	
	public Pelicula( String titulo, String genero, String creador, int año, int duracion )
	{
		super( titulo, genero, creador, duracion );
		
		if ( año < 0 ) {
			this.año = 0;
			
			throw new IllegalArgumentException( "El año no puede ser negativo." );
		}
		else {
			this.año = año;
		}
	}
	
	
	// GETTERS AND SETTERS
	public int getAño( ) {
		return año;
	}
	public void setAño( int año ) {
		this.año = año;
	}
	
	
	// MÉTODOS
	@Override
	public String toString( )
	{
		String pelicula = "";
		
		pelicula += "Título: " + this.getTitulo( ) + "\n";
		pelicula += "Género: " + this.getGenero( ) + "\n";
		pelicula += "Creador: " + this.getCreador( ) + "\n";
		pelicula += "Año: " + this.getAño( ) + "\n";
		pelicula += "Duración: " + this.getDuracion( ) + " minutos\n";
		
		if ( this.esVisto() ) {
			pelicula += "Visto: Si\n";
		}
		else {
			pelicula += "Visto: No\n";
		}
		
		return pelicula;
	}
}
