package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {
	this.valeur = n;
    }

    public String en_romain() {
    	String[] nombreRomain = new String[10];
    	nombreRomain[0] = "";
    	nombreRomain[1] = "I";
    	nombreRomain[2] = "II";
    	nombreRomain[3] = "III";
    	nombreRomain[4] = "IV";
    	return nombreRomain[valeur];
    }
}
