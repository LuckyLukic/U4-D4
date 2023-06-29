package Esercizio1;

public class Esercizio1 {
	
	public static void main(String[] args) {
		
		Dipendente giacomo = new Dipendente(46789, Dipartimento.PRODUZIONE);
        giacomo.stampaDatiDipendente();
        
		System.out.println("---------------------------");
        
        
        Dipendente giovanni = new Dipendente(55113, Dipartimento.VENDITE, 1000, 1400, 30, Livello.IMPIEGATO);
		giovanni.promuovi();

		System.out.println("---------------------------");

		System.out.println(Dipendente.calcolaPaga(giovanni));

		System.out.println("---------------------------");

		System.out.println(Dipendente.calcolaPaga(giovanni, 9));

	}

	

	   
}






