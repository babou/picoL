package javacc.progs.asa;

public class ASAExprMult extends ASAExprBinaire
{

	public ASAExprMult(ASAExpr e1, ASAExpr e2)
	{
		super(e1, e2);
	}

	@Override
	public int evalue()
	{
		return getExpr1().evalue() * getExpr2().evalue();
	}

	public String getLabelExplorateur()
	{
		return "MULT";
	}
}