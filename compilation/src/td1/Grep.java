package td1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Grep
{

	public static List<String> grep(String regex, String fichier) throws IOException
	{
		BufferedReader b = new BufferedReader(new FileReader(fichier));

		Pattern p = Pattern.compile(regex);

		List<String> res = new ArrayList<String>();
		String s;
		while((s = b.readLine()) != null)
		{
			if(p.matcher(s).find())
				res.add(s);
		}
		return res;
	}

	public static List<String> rep(String reg, String rep, String fichier) throws IOException
	{
		BufferedReader b = new BufferedReader(new FileReader(fichier));

		Pattern p = Pattern.compile(reg);

		List<String> res = new ArrayList<String>();
		String s;
		while((s = b.readLine()) != null)
		{
			String n = p.matcher(s).replaceAll(rep);
			if(!n.equals(s))
				res.add(n);
		}
		return res;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		String fichier, regex;

		switch(args.length)
		{
			case 3:
				fichier = "feries";
				regex = "";
				break;
			case 2:
				fichier = "dico";
				// au moins 5 i
				//			regex = "\\b\\w*(i\\w*){5,}\\b";
				// 5 i
				//			regex = "\\b\\w*(i\\w*){5}\\b";
				// gras, gris, gros
				//			regex = "gr[aio]s";
				// même 3 lettres au début et à la fin
				//			regex = "\\b(\\w\\w\\w).*\\1\\b";
				// commençant pars m, b, p et finissant par la même lettre
				regex = "\\b([mbp])\\w*\\1\\b";
				break;
			default:
				fichier = args[1];
				regex = args[0];
				break;
		}
		try
		{
			for(String s : grep(regex, fichier))
				System.out.println(s);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
}
