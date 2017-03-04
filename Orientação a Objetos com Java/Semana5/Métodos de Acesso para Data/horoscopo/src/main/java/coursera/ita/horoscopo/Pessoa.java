package coursera.ita.horoscopo;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	private Date dataDeNascimento;

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getIdade() {
		return calculaIdade();
	}

	private int calculaIdade() {
		Calendar dataAtual = Calendar.getInstance();
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(dataDeNascimento);
		int idade = dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
		return idade;
	}

	public String getSigno() {
		return verificaSigno();
	}

	private String verificaSigno() {
		Calendar dataNasciment = Calendar.getInstance();
		dataNasciment.setTime(dataDeNascimento);

		int mes = dataNasciment.get(Calendar.MONTH)+1;
		int dia = dataNasciment.get(Calendar.DAY_OF_MONTH);

		if ((mes == 1 && dia > 20) || (mes == 2 && dia < 19))
			return "aquario";
		else if (mes == 2 && dia > 18 || (mes == 3 && dia < 20))
			return "peixe";
		else if ((mes == 3 && dia > 19) || (mes == 4 && dia < 21))
			return "áries";
		else if ((mes == 4 && dia > 20) || (mes == 5 && dia < 21))
			return "Touro";
		else if ((mes == 5 && dia > 20) || (mes == 6 && dia < 21))
			return "gêmios";
		else if ((mes == 6 && dia > 20) || (mes == 7 && dia < 21))
			return "cancêr";
		else if ((mes == 7 && dia > 20) || (mes == 8 && dia < 23))
			return "leão";
		else if ((mes == 8 && dia > 22) || (mes == 9 && dia < 23))
			return "virgem";
		else if ((mes == 9 && dia > 22) || (mes == 10 && dia < 23))
			return "libra";
		else if ((mes == 10 && dia > 22) || (mes == 11 && dia < 22))
			return "escorpião";
		else if ((mes == 11 && dia > 21) || (mes == 12 && dia < 22))
			return "sagitario";
		else if ((mes == 12 && dia > 21) || (mes == 1 && dia < 21))
			return "capricornio";
		return null;

	}
}
