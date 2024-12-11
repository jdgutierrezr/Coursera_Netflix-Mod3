package com.jdgutirod.netflix;

public class Main 
{
	public static void main( String[] args )
	{
		Pelicula[] peliculas = new Pelicula[5];
		Serie[] series = new Serie[5];
		
		peliculas[0] = new Pelicula( );
		peliculas[1] = new Pelicula( "Halloween", "Terror", "Adam Sandler", 1998, 106 );
		peliculas[2] = new Pelicula( "Vacaciones tranquilas", "Raúl Veraniego" );
		peliculas[3] = new Pelicula( "Locos de amor", "Romance", "Victor Aristizabal", 2021, 98 );
		peliculas[4] = new Pelicula( "Caparazón sin dientes", "Comedia", "Radamel Falcao", 2014, 151 );
		
		series[0] = new Serie( "Los valientes", "Victor Aristizabal" );
		series[1] = new Serie( "El templo perdido", "Aventura", "Adam Sandler", 10, 1080 );
		series[2] = new Serie( );
		series[3] = new Serie( "Ella y yo", "Romance", "Pedro Sarmiento", 2, 106 );
		series[4] = new Serie( "Lo que ganamos los pobres", "Comedia", "James Rodriguez", 3, 240 );

		
		peliculas[1].marcarVisto( );
		peliculas[2].marcarVisto( );
		peliculas[3].marcarVisto( );
		series[0].marcarVisto( );
		series[4].marcarVisto( );
		
		
		Serie serieMasTemporadaSerie = series[0];
		Pelicula peliculaMasRecientePelicula = peliculas[0];
		
		System.out.println( "PELÍCULAS VISTAS..." );
		for ( Pelicula pelicula : peliculas )
		{
			if ( pelicula.esVisto() ) {
				System.out.println( "   + " + pelicula.getTitulo() + ": Visto por " + pelicula.tiempoVisto() + " minutos." );
			}
			
			if ( pelicula.getAño() > peliculaMasRecientePelicula.getAño() ) {
				peliculaMasRecientePelicula = pelicula;
			}
		}
		
		System.out.println( "\nSERIES VISTAS..." );
		for ( Serie serie : series )
		{
			if ( serie.esVisto() ) {
				System.out.println( "   + " + serie.getTitulo() + ": Visto por " + serie.tiempoVisto() + " minutos." );
			}
			
			if ( serie.getNumeroTemporadas() > serieMasTemporadaSerie.getNumeroTemporadas() ) {
				serieMasTemporadaSerie = serie;
			}
		}
		
		
		System.out.println( "\n**********PELÍCULA MÁS RECIENTE**********" );
		System.out.println( peliculaMasRecientePelicula.toString() );
		System.out.println( "**********SERIE CON MÁS TEMPORADAS**********" );
		System.out.println( serieMasTemporadaSerie.toString() );
	}
}
