package com.jdgutirod.netflix;

import java.util.ArrayList;

public class Main 
{
	public static void main( String[] args )
	{
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>( );
		ArrayList<Serie> series = new ArrayList<Serie>( );
		
		try 
		{
			peliculas.add( new Pelicula() );
			peliculas.add( new Pelicula("Halloween", "Terror", "Adam Sandler", 1998, 106) );
			peliculas.add( new Pelicula("Vacaciones tranquilas", "Raúl Veraniego") );
			peliculas.add( new Pelicula("Locos de amor", "Romance", "Victor Aristizabal", 2021, 98) );
			peliculas.add( new Pelicula("Caparazón sin dientes", "Comedia", "Radamel Falcao", 2014, 151) );
				
			series.add( new Serie("Los valientes", "Victor Aristizabal") );
			series.add( new Serie("El templo perdido", "Aventura", "Adam Sandler", 10, 1080) );
			series.add( new Serie() );
			series.add( new Serie("Ella y yo", "Romance", "Pedro Sarmiento", 2, 106) );
			series.add( new Serie("Lo que ganamos los pobres", "Comedia", "James Rodriguez", 3, 240) );
			series.add( new Serie("Buscandote", "Tragedia", "Andres Lopez", 40, 240) );
		} 
		catch ( Exception e ) {
			System.out.println( "Error al manipular las listas." );
		}
		
		try 
		{
			peliculas.add( new Pelicula("Pelicula errónea", "Error", "Desconocido", -485, 1) );
		}
		catch ( IllegalArgumentException e ) {
			System.out.println( e.getMessage() );
		}
		
		try 
		{
			series.add( new Serie("Serie errónea", "Error", "Desconocido", -8, 1) );
		}
		catch ( IllegalArgumentException e ) {
			System.out.println( e.getMessage() );
		}
		
		peliculas.get( 1 ).marcarVisto( );
		peliculas.get( 2 ).marcarVisto( );
		peliculas.get( 3 ).marcarVisto( );
		series.get( 0 ).marcarVisto( );
		series.get( 4 ).marcarVisto( );
		
		
		Serie serieMasTemporadas = series.get( 0 );
		Pelicula peliculaMasReciente = peliculas.get( 0 );
		
		System.out.println( "PELÍCULAS VISTAS..." );
		for ( Pelicula pelicula : peliculas )
		{
			if ( pelicula.esVisto() ) {
				System.out.println( "   + " + pelicula.getTitulo() + ": Visto por " + pelicula.tiempoVisto() + " minutos." );
			}
			
			if ( pelicula.getAño() > peliculaMasReciente.getAño() ) {
				peliculaMasReciente = pelicula;
			}
		}
		
		System.out.println( "\nSERIES VISTAS..." );
		for ( Serie serie : series )
		{
			if ( serie.esVisto() ) {
				System.out.println( "   + " + serie.getTitulo() + ": Visto por " + serie.tiempoVisto() + " minutos." );
			}
			
			if ( serie.getNumeroTemporadas() > serieMasTemporadas.getNumeroTemporadas() ) {
				serieMasTemporadas = serie;
			}
		}
		
		
		System.out.println( "\n**********PELÍCULA MÁS RECIENTE**********" );
		System.out.println( peliculaMasReciente.toString() );
		System.out.println( "**********SERIE CON MÁS TEMPORADAS**********" );
		System.out.println( serieMasTemporadas.toString() );
	}
}
