package it.uniroma3.diadia.ambienti;

public class Labirinto{
	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;

//    /**
//     * Crea tutte le stanze e le porte di collegamento
//     */
//    public void creaStanze() {
//
//		/* crea gli attrezzi */
//    	Attrezzo lanterna = new Attrezzo("lanterna",3);
//		Attrezzo osso = new Attrezzo("osso",1);
//		Attrezzo piedediporco = new Attrezzo("piedediporco",2);
//		Attrezzo vanga = new Attrezzo("vanga",1);
//		Attrezzo pala = new Attrezzo("pala",1);
//
//    	
//		/* crea stanze del labirinto */
//		Stanza atrio = new Stanza("Atrio");
//		Stanza aulaN11 = new StanzaMagica("Aula N11");
//		Stanza aulaN10 = new StanzaBloccata("Aula N10", "est", "piedediporco");
//		Stanza laboratorio = new StanzaBuia("Laboratorio Campus", "lanterna");
//		Stanza biblioteca = new Stanza("Biblioteca");
//		
//		/* collega le stanze */
//		atrio.impostaStanzaAdiacente("nord", biblioteca);
//		atrio.impostaStanzaAdiacente("est", aulaN11);
//		atrio.impostaStanzaAdiacente("sud", aulaN10);
//		atrio.impostaStanzaAdiacente("ovest", laboratorio);
//		aulaN11.impostaStanzaAdiacente("est", laboratorio);
//		aulaN11.impostaStanzaAdiacente("ovest", atrio);
//		aulaN10.impostaStanzaAdiacente("nord", atrio);
//		aulaN10.impostaStanzaAdiacente("est", aulaN11);
//		aulaN10.impostaStanzaAdiacente("ovest", laboratorio);
//		laboratorio.impostaStanzaAdiacente("est", atrio);
//		laboratorio.impostaStanzaAdiacente("ovest", aulaN11);
//		biblioteca.impostaStanzaAdiacente("sud", atrio);
//
//        /* pone gli attrezzi nelle stanze */
//		aulaN10.addAttrezzo(lanterna);
//		atrio.addAttrezzo(osso);
//		atrio.addAttrezzo(vanga);
//		atrio.addAttrezzo(pala);
//		aulaN11.addAttrezzo(piedediporco);
//
//		// il gioco comincia nell'atrio
//        stanzaCorrente = atrio;  
//		stanzaVincente = biblioteca;
//    }
    
	public static LabirintoBuilder newBuilder() {
		return new LabirintoBuilder();
	}
	
    public Stanza getStanzaVincente() {
		return stanzaVincente;
	}

	public void setStanzaVincente(Stanza stanzaVincente) {
		this.stanzaVincente = stanzaVincente;
	}
	public void setStanzaIniziale(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}

	public Stanza getStanzaIniziale() {
		return this.stanzaCorrente;
	}
	
}
