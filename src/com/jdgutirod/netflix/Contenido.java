package com.jdgutirod.netflix;

public class Contenido implements IVisualizable
{
	// ATRIBUTOS
	private String titulo;
	private String genero;
	private String creador;
	private int duracion;
	private boolean visto;
	
	
	// CONSTRUCTORES
	public Contenido( )
	{
		this.titulo = "Sin título";
		this.creador = "Creador no encontrado";
		this.genero = "Sin género";
		this.duracion = 0;
		this.visto = false;
	}
		
	public Contenido( String titulo, String creador )
	{
		this.titulo = titulo;
		this.creador = creador;
			
		this.genero = "Sin género";
		this.duracion = 0;
		this.visto = false;
	}
		
	public Contenido( String titulo, String genero, String creador, int duracion )
	{
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		
		this.visto = false;
	}
	
	
	// GETTERS AND SETTERS
	public String getTitulo( ) {
		return titulo;
	}
	public void setTitulo( String titulo ) {
		this.titulo = titulo;
	}

	public String getGenero( ) {
		return genero;
	}
	public void setGenero( String genero ) {
		this.genero = genero;
	}

	public String getCreador( ) {
		return creador;
	}
	public void setCreador( String creador ) {
		this.creador = creador;
	}

	public int getDuracion( ) {
		return duracion;
	}
	public void setDuracion( int duracion ) {
		this.duracion = duracion;
	}
	
	
	// MÉTODOS
	@Override
	public void marcarVisto( ) 
	{
		this.visto = true;
	}

	@Override
	public boolean esVisto( ) 
	{
		return visto;
	}

	@Override
	public int tiempoVisto( ) 
	{
		return duracion;
	}
}
