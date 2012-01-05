package javacc.progs.asa;

public class ASAExprPlus extends ASAExprBinaire
{

	public ASAExprPlus(ASAExpr e1, ASAExpr e2)
	{
		super(e1, e2);
	}

	@Override
	public int evalue()
	{
		return getExpr1().evalue() + getExpr2().evalue();
	}

	public ASAExpr simplifie()
	{
		ASAExpr sup = super.simplifie();
		if(sup instanceof ASAExprEntier)
			return sup;
		return null;
	}

	public String getLabelExplorateur()
	{
		return "PLUS";
	}
}