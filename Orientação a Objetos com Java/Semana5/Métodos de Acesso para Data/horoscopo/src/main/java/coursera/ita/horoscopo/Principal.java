package coursera.ita.horoscopo;

import java.text.ParseException;

public class Principal {

	public static void main(String[] args) throws ParseException {

		DataUtil dataUtil = new DataUtil();
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		pessoa.setDataDeNascimento(dataUtil.StringToDate("21/05/1996"));
		System.out.println("idade: " + pessoa.getIdade() + " signo:" + pessoa.getSigno());

		pessoa1.setDataDeNascimento(dataUtil.StringToDate("23/12/1979"));
		System.out.println("idade: " + pessoa1.getIdade() + " signo:" + pessoa1.getSigno());

		pessoa2.setDataDeNascimento(dataUtil.StringToDate("22/07/1961"));
		System.out.println("idade: " + pessoa2.getIdade() + " signo:" + pessoa2.getSigno());

	}
}
