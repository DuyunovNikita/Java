package Converter;

import java.io.*;
import java.math.BigDecimal;
import java.net.URL;
import java.util.*;

import org.json.*;

public class Converter {
    public static Map<String, BigDecimal> ValuteArr = new HashMap<String, BigDecimal>();

    static {
        try {
            JSONObject Obj = new JSONObject(getJsonStr());
            JSONObject Valute = Obj.getJSONObject("Valute");

            Valute.getJSONObject("USD").getDouble("Value");

            Iterator keys = Valute.sortedKeys();

            String valuteName;
            BigDecimal valueNominalOne = new BigDecimal(0);

            double value;
            double nominal;

            while (keys.hasNext()) {
                valuteName = keys.next().toString();

                value = Valute.getJSONObject(valuteName).getDouble("Value");
                nominal = Valute.getJSONObject(valuteName).getDouble("Nominal");
                valueNominalOne = BigDecimal.valueOf(value);

                if (nominal != 1) {
                    valueNominalOne = valueNominalOne.divide(BigDecimal.valueOf(nominal));
                } else {
                    valueNominalOne = BigDecimal.valueOf(
                            Double.parseDouble(
                                    String.format("%.2f", valueNominalOne).replace(',', '.')
                            )
                    );
                }

                ValuteArr.put(valuteName, valueNominalOne);
            }
        } catch (Exception ex) {

        }
    }

    public static String getJsonStr() throws Exception {
        String line;
        StringBuilder jsonStr = new StringBuilder("");
        URL url = new URL("https://www.cbr-xml-daily.ru/daily_json.js");

        InputStream in = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        while ((line = reader.readLine()) != null) {
            jsonStr.append(line).append(System.lineSeparator());
        }

        return jsonStr.toString();
    }

    public static BigDecimal converter(double value, BigDecimal valuteValue) {
        return valuteValue.multiply(BigDecimal.valueOf(value));
    }
}

