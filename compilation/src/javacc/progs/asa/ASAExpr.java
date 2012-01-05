/*
 * ASAExpr.java
 * Daniel Diaz - 2007
 * Arbre Syntaxe Abstraite pour les expressions.
 */

package javacc.progs.asa;

/**
 * Cette classe représente une expression sous la forme d'un arbre de syntaxe abstraite (ASA).
 */
public abstract class ASAExpr
{

	/**
	 * Access au premier fils
	 * 
	 * @return le premier fils
	 */
	public ASAExpr getExpr1()
	{
		return null;
	}

	/**
	 * Access au second fils.
	 * 
	 * @return le second fils.
	 */
	public ASAExpr getExpr2()
	{
		return null;
	}

	/**
	 * Accès à la valeur entière.
	 * 
	 * @return la valeur entière.
	 */
	public int getValeur()
	{
		return -1;
	}

	/**
	 * le calcul de la valeur de l'arbre
	 * 
	 * @return l'Žvaluation de l'arbre
	 */
	public abstract int evalue();

	/**
	 * simplifie l'arbre
	 * 
	 * @return
	 */
	public ASAExpr simplifie()
	{
		return this;
	}

	/**
	 * Méthode devant être définie dans chaque classe fille
	 * doit retourner la chaîne pour la notation explorateur.
	 */
	public abstract String getLabelExplorateur();

	/**
	 * Calcule la notation explorateur de l'ASA.
	 * 
	 * @return la chaîne contenant la notation explorateur.
	 */

	public String notationExplorateur()
	{
		return notationExplorateur("");
	}

	private String notationExplorateur(String prefixe)
	{
		String res = prefixe + getLabelExplorateur() + "\n";
		String prefixeSuiv = prefixe + "   ";
		ASAExpr e1 = getExpr1();
		ASAExpr e2 = getExpr2();
		if(e1 != null)
			res += e1.notationExplorateur(prefixeSuiv);
		if(e2 != null)
			res += e2.notationExplorateur(prefixeSuiv);
		return res;
	}
}
