package coursera.ita.horoscopo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public Date StringToDate(String data) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {

			date = formatter.parse(data);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return date;
	}

}
