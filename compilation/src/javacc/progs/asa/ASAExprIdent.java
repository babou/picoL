package javacc.progs.asa;

public class ASAExprIdent extends ASAExpr
{

	private String	nom;

	public ASAExprIdent(String nom)
	{
		this.nom = nom;
	}

	@Override
	public int evalue()
	{
		return -1;
	}

	@Override
	public String getLabelExplorateur()
	{
		return "IDENT = Ò" + nom + "Ó";
	}
}
