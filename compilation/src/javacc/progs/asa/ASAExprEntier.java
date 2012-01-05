package javacc.progs.asa;

public class ASAExprEntier extends ASAExpr
{

	private int	valeur;

	public ASAExprEntier(int valeur)
	{
		this.valeur = valeur;
	}

	@Override
	public int getValeur()
	{
		return valeur;
	}

	@Override
	public int evalue()
	{
		return valeur;
	}

	public String getLabelExplorateur()
	{
		return "ENTIER = " + valeur;
	}
}