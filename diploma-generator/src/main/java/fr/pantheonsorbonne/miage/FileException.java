package fr.pantheonsorbonne.miage;

public class FileException extends Exception {

	private static final long serialVersionUID = 654987491651L;
	
	public FileException(String string, Exception e) {
		super(string, e);
	}
}
