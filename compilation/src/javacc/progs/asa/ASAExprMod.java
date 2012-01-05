package javacc.progs.asa;

public class ASAExprMod extends ASAExprBinaire
{

	public ASAExprMod(ASAExpr e1, ASAExpr e2)
	{
		super(e1, e2);
	}

	@Override
	public int evalue()
	{
		return getExpr1().evalue() % getExpr2().evalue();
	}

	@Override
	public String getLabelExplorateur()
	{
		return "MOD";
	}

}
