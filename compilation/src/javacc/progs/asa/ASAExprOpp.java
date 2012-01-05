package javacc.progs.asa;

public class ASAExprOpp extends ASAExpr
{

	private ASAExpr	fils;

	public ASAExprOpp(ASAExpr ex)
	{
		fils = ex;
	}

	@Override
	public ASAExpr getExpr1()
	{
		return fils;
	}

	@Override
	public int evalue()
	{
		return -fils.evalue();
	}

	@Override
	public String getLabelExplorateur()
	{
		return "OPPOSƒ";
	}

}
