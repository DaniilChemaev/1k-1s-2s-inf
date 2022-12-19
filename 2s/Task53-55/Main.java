import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Random;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.nio.file.Files;


public class Main {
    /*
     0. Сгенерировать(создать) бинарный файл, в котором будет 100 случайных байтов(поток выходной используется)
     */
    public static void createByteFile(String filename, int nBytes) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        Random r = new Random();
        for (int i = 0; i < nBytes; i++) {
            fos.write(r.nextInt(100));
        }
        fos.close();
    }


    /*
    53. Написать метод copy(), который копирует содержимое одного файла в содержимое другого файла параметрами метода являются имена этих файлов. С помощью файлинпут стрим и файлаутпут стрим. Способы решения:
    а) использовать метод ридрайт.
    б) использовать read который над массивом и wright который над массивом.
    (Контролировать сколько байтов мы записываем. Посмотреть в документации)
     */
    public static void copy(String filename1, String filename2) throws IOException {
        FileInputStream fis = new FileInputStream(filename1);
        FileOutputStream fos = new FileOutputStream(filename2);
        int x = fis.read();
        while (x != -1) {
            fos.write(x);
            x = fis.read();
        }
        fis.close();
        fos.close();

    }


    /*
    54. Метод download(), который принимает на вход url файла, затем мы его сохраняем в файл с именем, который мы передаём.
    Как делать? Класс java.net.url импортировать. Есть метод openStream(). Аналогично пункты а и б. По байтово и по массивам.

    2*. Выцепить название файла из этого url - после слеша и взять остаток.
     */
    public static void download(String url) throws IOException {
        URL urlObject = new URL(url);
        InputStream is = urlObject.openStream();
        String[] parsedURL = url.split("/");  // Парсим URl, чтобы сохранить картинку локально с тем же названием
        String filename = parsedURL[parsedURL.length - 1];
        FileOutputStream fos = new FileOutputStream("resources/" + filename);

        int x = is.read();
        while (x != -1) {
            fos.write(x);
            x = is.read();
        }

        is.close();
        fos.close();
    }


    // 55. Со страницы по адресу URL скачать все файлы с расширением EXT.
    // !!!!! ДЛЯ ПРОВЕРКИ РАБОТОСПОСОБНОСТИ Я СКАЧИВАЛ ФАЙЛЫ С РАСШИРЕНИЕМ JPG


    public static void downloadAllEXT(String url) throws IOException {
        URL urlObject = new URL(url);
        String[] parsedURL = url.split("/");  // Парсим URl, чтобы сохранить картинку локально с тем же названием
        String filename = parsedURL[parsedURL.length - 1];
        BufferedReader bf = new BufferedReader(
                new InputStreamReader(
                        urlObject.openStream()
                )
        );


        String line = bf.readLine();
        String regexImgPattern = "<img[^<>]+>";
        Pattern p = Pattern.compile(regexImgPattern);
        Pattern p2 = Pattern.compile("src=\"[^\"]+\"");


        InputStream inputStream = null;


        while (line != null) {
            Matcher m = p.matcher(line);
            while (m.find()) {
                String imgLine = m.group();
                Matcher m2 = p2.matcher(imgLine);
                m2.find();
                String srcLine = m2.group();
                String imgURL = srcLine.substring(5, srcLine.length() - 1);


                String[] parsedFilename = imgURL.split("/");

                String currentFilename = parsedFilename[1];

                if (imgURL.matches(".*.jpg$")){  // ЗДЕСЬ ПОМЕНЯТЬ jpg на ext
                    download("https://" + filename + "/" + imgURL);
                }

                line = line.replace(imgURL, filename);
            }
            line = bf.readLine();
        }
        bf.close();
    }




    public static void main(String[] args) throws IOException {
        // createByteFile("src/resources/1.dat", 100);
        // copy("src/resources/1.dat", "src/resources/2.dat");
        // download("https://kpfu.ru/portal/docs/F1818801066/IMG_0092.jpg");
        downloadAllEXT("https://www.theworldsworstwebsiteever.com/");
        download("https://www.theworldsworstwebsiteever.com/");
    }
}
