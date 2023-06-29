package Esercizio1;

public class Esercizio1 {
	
	public static void main(String[] args) {
		
		Dipendente giacomo = new Dipendente(46789, Dipartimento.PRODUZIONE);
        giacomo.stampaDatiDipendente();
        
        
        Dipendente giovanni = new Dipendente(55113, Dipartimento.VENDITE, 1000, 1400, 30, Livello.IMPIEGATO);
        giovanni.calcolaPaga();		
	}

	
	   
}









this.matricola =_matricola;
this.dipartimento =_dipartimento;
this.stipendioBase = _stipendioBase;
this.stipendio = _stipendio;
this.importoOrarioStraordinario = _importoOrarioStraordinario;
this.livello = _livello;