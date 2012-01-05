package javacc.progs.asa;

public abstract class ASAExprBinaire extends ASAExpr
{
	private ASAExpr	e1;
	private ASAExpr	e2;

	public ASAExprBinaire(ASAExpr e1, ASAExpr e2)
	{
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public ASAExpr getExpr1()
	{
		return e1;
	}

	@Override
	public ASAExpr getExpr2()
	{
		return e2;
	}

}
