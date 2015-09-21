package com.heymysweetheart.test;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * Created by leo on 15/9/21.
 */
public class HttpClientExample {
    @Test
    public void testGetRequest() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8080/rest.do");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        System.out.println(EntityUtils.toString(response.getEntity()));
        System.out.println(response.getProtocolVersion());
        System.out.println(response.getStatusLine());
        httpClient.close();
    }

    @Test
    public void testPostRequest() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://localhost:8080/post.do");

        ArrayList<BasicNameValuePair> nameValuePairs = new ArrayList<BasicNameValuePair>();
        nameValuePairs.add(new BasicNameValuePair("name", "tom"));
        nameValuePairs.add(new BasicNameValuePair("gender", "female"));
        nameValuePairs.add(new BasicNameValuePair("age", "25"));
        nameValuePairs.add(new BasicNameValuePair("weight", "65.5"));
        nameValuePairs.add(new BasicNameValuePair("height", "165.5"));

        httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

        CloseableHttpResponse response = httpClient.execute(httpPost);
        System.out.println(response.getStatusLine());
        System.out.println(EntityUtils.toString(response.getEntity()));

        httpClient.close();
    }
}
