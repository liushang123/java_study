package com.java.HandleInterface;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-30 上午11:07
 */
public class HttpUtil {
    public static byte[] get(String urlString) {
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(urlString);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(3000);

            int responseCode = urlConnection.getResponseCode();
            if (responseCode == 200) {
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                InputStream in = urlConnection.getInputStream();
                byte[] buffer = new byte[4 * 1024];
                int len = -1;
                while ((len = in.read(buffer)) != -1) {
                    bos.write(buffer, 0, len);
                }
                close(in);
                byte[] result = bos.toByteArray();
                close(bos);
                return result;
            }
        } catch (MalformedURLException e) {

        } catch (IOException e) {

        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
        return null;
    }

    public static void close(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
