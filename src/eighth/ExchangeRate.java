package eighth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class ExchangeRate {

    public static void main(String[] args) throws IOException {
        exchangeRate("USD", "EUR");
    }

    public static void exchangeRate(String from, String to) throws IOException {
        String url = "http://www.nbg.ge/rss.php";

        double fromRate = 0;
        double toRate = 0;

        URL rssUrl = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(rssUrl.openStream()));
        String line;
        while ((line = in.readLine()) != null) {
            if (line.contains(from) || line.contains(to)) {
                String geoName = in.readLine();
                String nextLine = in.readLine();
                int firstPos = nextLine.indexOf("<td>");
                int lastPos = nextLine.indexOf("</td>");
                double v = Double.parseDouble(geoName.substring(geoName.indexOf("<td>") + 4, geoName.indexOf(" ")));
                if (line.contains(from)) {
                    fromRate = Double.parseDouble(nextLine.substring(firstPos + 4, lastPos)) /
                            v;
                } else {
                    toRate = Double.parseDouble(nextLine.substring(firstPos + 4, lastPos)) /
                            v;
                }
            }
        }

        System.out.printf("%-5s %-5s %-5s %-5s", fromRate, from, toRate, to);
        in.close();
    }
}
