package entity;

import java.io.Serializable;

public class Movie implements Serializable {
	
	/**
	 * Used during deserialization to verify that the sender and receiver of a serialized object have loaded 
	 * classes for that object that are compatible with respect to serialization 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String cast;
	private String director;
	private String plot;
	private String rating;
	private float userRate;
	private String status;

	
	/**
	 * Constructor to instantiate the Movie object with the following inputs
	 * @param name	
	 * @param cast		
	 * @param director	
	 * @param plot
	 * @param rating
	 * @param status
	 */
	public Movie(String name, String cast, String director, String plot,
			String rating, String status) {
		this.name = name;
		this.cast = cast;
		this.director = director;
		this.plot = plot;
		this.rating = rating;
		this.status = status;
	}

	// All the gets methods
	public String getMovieName() {
		return name;
	}

	public String getCast() {
		return cast;
	}

	public String getDirector() {
		return director;
	}

	public String getPlot() {
		return plot;
	}

	public String getMovieRating() {
		return rating;
	}

	public float getUserRate() {
		return userRate;
	}

	public String getStatus() {
		return status;
	}

	// All the set methods
	public void setName(String name) {
		this.name = name;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setUserRating(float userRate) {
		this.userRate = userRate;
	}

	public void setMovieStatus(String movieStatus) {
		this.status = movieStatus;
	}

	public boolean equals(Object o) {
		if (o instanceof Movie) {
			Movie p = (Movie) o;
			return (getMovieName().equals(p.getMovieName()));
		}
		return false;
	}
}
