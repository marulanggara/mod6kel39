package converter.ejb;

import java.text.DecimalFormat;
import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;

@Stateless
@LocalBean
public class ConverterBean implements ConverterBeanLocal {

    private DecimalFormat twoDigits = new DecimalFormat("0.00");

    public String rtok(double r) {
        String result = twoDigits.format(((r * 1.25) + 273.15));
        return result;
    }

    public String ktor(double k) {
        String result = twoDigits.format((k - 273.15) * 0.8);
        return result;
    }
}
