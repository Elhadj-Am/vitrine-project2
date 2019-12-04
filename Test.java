package repertoire;

import java.rmi.dgc.Lease;

public class Test {

	public static void main(String[] args) {
		
		Abonne aa = new Abonne("aa", "12345");
		Abonne ab = new Abonne("ab", "12345");
		Abonne ac = new Abonne("ac", "12345");
		Abonne ad = new Abonne("ad", "12345");
		Abonne ae = new Abonne("ae", "12345");
		Abonne af = new Abonne("af", "12345123456");
		Abonne ag = new Abonne("ag", "12345");
		Abonne ai = new Abonne("ai", "12345");
		Abonne aj = new Abonne("aj", "12345");
		Abonne ak = new Abonne("ak", "12345");




		Repertoire repertoire = new Repertoire(10);
		repertoire.addAbone(aa);
		repertoire.addAbone(ac);
		repertoire.addAbone( new  Abonne("ah", "12345"));
		repertoire.addAbone(aj);
		repertoire.addAbone(ad);
		repertoire.addAbone(ae);
		repertoire.addAbone(ab);
		repertoire.addAbone(af);
		repertoire.addAbone(ag);
		repertoire.addAbone(ai);	
		//repertoire.addAbone(ak);	

		
		for ( int i = 0 ; i < repertoire.niveau; i++) {
			System.out.println(repertoire.lesAbonnes[i].nom+" "+repertoire.lesAbonnes[i].numero);
		}
		
		System.out.println( repertoire.getNumero("af"));
		System.out.println("le nombre d'abonné est "+repertoire.getNbAbonne());
		System.out.println("les abonés trie par ordre alphabetique");
		
		Abonne aboTrie  [ ]= repertoire.getAboneeTriee();
		for ( int i = 0 ; i < repertoire.niveau; i++) {
			System.out.println(aboTrie[i].nom+" "+aboTrie[i].numero);
		}

		
	}

	a
}
