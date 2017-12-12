import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Request;

public class GoogleAPI {


    public GoogleAPI() {
    }


    public String Call() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://www.googleapis.com/customsearch/v1?key=AIzaSyDXZcf749KFywTPbBH6TgNJe1c_GVRqkFU&cx=017576662512468239146%3Aomuauf_lfve&q=lectures")
                .get()
                .addHeader("cache-control", "no-cache")

                .build();

        Response response = client.newCall(request).execute();
        return null;
    }
}
