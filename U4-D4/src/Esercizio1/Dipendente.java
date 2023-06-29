package Esercizio1;

public class Dipendente {
	
 private double stipendioBase = 1000.00;
 private int matricola;
 private double stipendio;
 private double importoOrarioStraordinario;
 private Livello livello;
 private Dipartimento dipartimento ;
 
 public Dipendente (int _matricola, Dipartimento _dipartimento) {
	 
	 this.matricola = _matricola;
	 this.dipartimento =_dipartimento;
	 this.stipendio = stipendioBase;
	 this.importoOrarioStraordinario = 30;
	 this.livello = Livello.OPERAIO;
	 
	 
 }
 
 public Dipendente (int _matricola, Dipartimento _dipartimento, double _stipendioBase, double _stipendio, double _importoOrarioStraordinario, Livello _livello ) {
	 
	 this.matricola =_matricola;
	 this.dipartimento =_dipartimento;
	 this.stipendioBase = _stipendioBase;
	 this.stipendio = _stipendio;
	 this.importoOrarioStraordinario = _importoOrarioStraordinario;
	 this.livello = _livello;
	 
 }
 
 public void stampaDatiDipendente () {
	System.out.println("matricola numero:" + " " + matricola);
	System.out.println("Dipartimento:" + " " + dipartimento);
	System.out.println("Stipendio:" + " " + stipendio);
	System.out.println("importo orario Straordinario:" + " " + importoOrarioStraordinario);
	System.out.println("Livello:" + " " + livello);
	 
 }
 
 public void promuovi (Dipendente dipendente) {
	 
	 switch (livello) {
	 case OPERAIO: 
		 dipendente.setLivello(livello.IMPIEGATO);
		 dipendente.setStipendio(stipendio * 1.2);
	     System.out.println(dipendente);
	     break;
	     
	 case IMPIEGATO:
		 dipendente.setLivello(livello.QUADRO);
		 dipendente.setStipendio(stipendio * 1.5);
	     System.out.println(dipendente);
	     break;
	     
	 case QUADRO:
		 dipendente.setLivello(livello.DIRIGENTE);
		 dipendente.setStipendio(stipendio * 2);
	     System.out.println(dipendente);
	     break;
	     
	 case DIRIGENTE:
	     System.out.println("non sono possibili altri scatti di cariera");   
	     break;
	 
	 default:
		 System.out.println("Non ci sono dipendenti da promuovere");
	     break;
	 
	 }
	 
	 
 }
 
 public static void calcolaPaga (Dipendente dipendente) {
	 
	 double stipendio = dipendente.getStipendio();
	 System.out.println(stipendio);
 }
 
public int getMatricola() {
	return matricola;
}

public void setMatricola(int matricola) {
	this.matricola = matricola;
}

public double getStipendio() {
	return stipendio;
}

public void setStipendio(double stipendio) {
	this.stipendio = stipendio;
}

public double getImportoOrarioStraordinario() {
	return importoOrarioStraordinario;
}

public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
	this.importoOrarioStraordinario = importoOrarioStraordinario;
}

public Livello getLivello() {
	return livello;
}

public void setLivello(Livello livello) {
	this.livello = livello;
}

public Dipartimento getDipartimento() {
	return dipartimento;
}

public void setDipartimento(Dipartimento dipartimento) {
	this.dipartimento = dipartimento;
}
 


 

}


