// Вариант 2

import java.io.*;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String[] statistics(String url) throws IOException {
        URL u = new URL(url);
        BufferedReader bf = new BufferedReader(new InputStreamReader(u.openStream()));
        String line = bf.readLine();
        Pattern p = Pattern.compile("January|February|March|April|May|June|July|August|September|October|November|December");
        Pattern p2 = Pattern.compile("(19|20)[0-9][0-9]");

        while ((line = bf.readLine()) != null) {
            Matcher m = p.matcher(line);
            if (m.find()) {
                String[] lineArray = line.split(" ");
                String month = "";
                String year = "";

                for (String s : lineArray) {
                    Matcher m1 = p.matcher(s);
                    Matcher m2 = p2.matcher(s);

                    if (m1.find()) {
                        month = s;
                    }
                    if (m2.find()) {
                        year = s;
                    }
                    if (!month.equals("") && !year.equals("")) {
                        System.out.println(month + " " + year);
                        break;
                    }
                }
                return new String[]{month, year};
            }
        }
        bf.close();
        return new String[0];
    }

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 8031; i++) {
            try {
                System.out.println(i);
                String[] date = statistics("https://www.rfc-editor.org/rfc/rfc" + i + ".txt");

                //!TODO ДОДЕЛАТЬ СТАТИСТИКУ 
//                System.out.println();
//                if (date.length == 0) {
//                    break;
//                }
//                String currentYear = "";
//                String year = date[1];
//                int rfcs = 0;
//                if (!currentYear.equals(year)) {
//                    currentYear = year;
//                    System.out.println(rfcs + "RFC");
//                    rfcs = 0;
//                }
//                rfcs += 1;

            } catch (IOException ignored) {
            }

        }
    }
}
