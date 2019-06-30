import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class Httpreq {
     void httppost(String text) throws Exception {
        String payload = "{" +
                "\"text\": \"" + text + "\"," +
                "}";
        StringEntity entity = new StringEntity(payload,
                ContentType.APPLICATION_JSON);

        HttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost request = new HttpPost("https://hooks.slack.com/services/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");
        request.addHeader("Content-Type","application/json;charset=UTF-8");
        request.setEntity(entity);

        HttpResponse response = httpClient.execute(request);
        System.out.println(response.getStatusLine().getStatusCode());
    }}
