package fr.pantheonsorbonne.miage;

public class FileException extends Exception {

	private static final long serialVersionUID = 1564651651984L;
	
	public FileException(String message, Exception e) {
		super(message, e);
	}
}
