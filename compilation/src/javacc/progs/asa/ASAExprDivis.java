package javacc.progs.asa;

public class ASAExprDivis extends ASAExprBinaire
{

	public ASAExprDivis(ASAExpr e1, ASAExpr e2)
	{
		super(e1, e2);
	}

	public String getLabelExplorateur()
	{
		return "DIVIS";
	}

	@Override
	public int evalue()
	{
		return getExpr1().evalue() / getExpr2().evalue();
	}
}