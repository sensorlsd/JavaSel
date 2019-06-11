package src;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

import javax.swing.plaf.basic.BasicTextUI;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class ApiRequest {

    public static String arg = System.getProperty("game");


    private static String GetAdminToken() throws IOException {

        String urlParameters = "secretKey=MASTER_KEY-swftest_ENTITY-swftest_BRAND&username=swftest_USER&password=swftest_QaZ321!";
        String request = "http://api.cd2.d.skywind-tech.com/v1/login";
        URL url = new URL(request);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        return conn.getHeaderField("x-access-token");

    }

}
