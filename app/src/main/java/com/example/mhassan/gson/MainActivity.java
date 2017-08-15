package com.example.mhassan.gson;

/*import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRequest = (Button) findViewById(R.id.btnRequest);

        btnRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                OkHttpClient client = new OkHttpClient();

                Request request = new Request.Builder()
                        .url("https://api.myjson.com/bins/1d3ei7")
                        .build();

                // Response response = client.newCall(request).execute();

                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Log.d(TAG, "onFailure: ");
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        Log.d(TAG, "onResponse: " + response.body().string());

                        // String res = "[{\"id\":1,\"first_name\":\"Neile\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":2,\"first_name\":\"Nicholle\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":3,\"first_name\":\"Adelaida\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":4,\"first_name\":\"Oates\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":5,\"first_name\":\"Agathe\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":6,\"first_name\":\"Kermie\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":7,\"first_name\":\"Bjorn\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":8,\"first_name\":\"Aldin\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":9,\"first_name\":\"Reuben\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":10,\"first_name\":\"Way\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":11,\"first_name\":\"Yardley\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":12,\"first_name\":\"Leland\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":13,\"first_name\":\"Trixi\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":14,\"first_name\":\"Marcellus\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":15,\"first_name\":\"Wally\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":16,\"first_name\":\"Darbie\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":17,\"first_name\":\"Al\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":18,\"first_name\":\"Leia\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":19,\"first_name\":\"Leticia\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":20,\"first_name\":\"Kai\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":21,\"first_name\":\"Lamar\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":22,\"first_name\":\"Natalee\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":23,\"first_name\":\"Peter\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":24,\"first_name\":\"Bethanne\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":25,\"first_name\":\"Chrisse\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":26,\"first_name\":\"Erin\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":27,\"first_name\":\"Fleurette\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":28,\"first_name\":\"Turner\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":29,\"first_name\":\"Cos\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":30,\"first_name\":\"Jackquelin\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":31,\"first_name\":\"Alexandrina\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":32,\"first_name\":\"Cliff\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":33,\"first_name\":\"Gustav\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":34,\"first_name\":\"Nicolai\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":35,\"first_name\":\"Andrus\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":36,\"first_name\":\"Joellen\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":37,\"first_name\":\"Tatum\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":38,\"first_name\":\"Micheal\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":39,\"first_name\":\"Hansiain\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":40,\"first_name\":\"Rikki\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":41,\"first_name\":\"Lawrence\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":42,\"first_name\":\"Rayshell\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":43,\"first_name\":\"Daffi\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":44,\"first_name\":\"Reginald\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":45,\"first_name\":\"Orv\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":46,\"first_name\":\"Avivah\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":47,\"first_name\":\"Manya\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":48,\"first_name\":\"Daile\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":49,\"first_name\":\"Babs\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":50,\"first_name\":\"Morgen\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":51,\"first_name\":\"Manolo\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":52,\"first_name\":\"Carmelia\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":53,\"first_name\":\"Armin\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":54,\"first_name\":\"Duffie\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":55,\"first_name\":\"Carmelia\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":56,\"first_name\":\"Gabey\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":57,\"first_name\":\"Bianka\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":58,\"first_name\":\"Carmita\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":59,\"first_name\":\"Vergil\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":60,\"first_name\":\"Rooney\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":61,\"first_name\":\"Thornton\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":62,\"first_name\":\"Malvina\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":63,\"first_name\":\"Burton\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":64,\"first_name\":\"Urson\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":65,\"first_name\":\"Abdul\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":66,\"first_name\":\"Kimberley\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":67,\"first_name\":\"Athena\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":68,\"first_name\":\"Cart\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":69,\"first_name\":\"Caryl\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":70,\"first_name\":\"Abbye\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":71,\"first_name\":\"Danny\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":72,\"first_name\":\"Earle\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":73,\"first_name\":\"Kordula\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":74,\"first_name\":\"Stern\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":75,\"first_name\":\"Bondie\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":76,\"first_name\":\"Lynn\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":77,\"first_name\":\"Bryn\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":78,\"first_name\":\"Estrellita\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":79,\"first_name\":\"Ashlen\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":80,\"first_name\":\"Goldia\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":81,\"first_name\":\"Onfre\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":82,\"first_name\":\"Abbot\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":83,\"first_name\":\"Lolly\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":84,\"first_name\":\"Frederigo\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":85,\"first_name\":\"Haley\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":86,\"first_name\":\"Keith\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":87,\"first_name\":\"Irina\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":88,\"first_name\":\"Rogers\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":89,\"first_name\":\"Pen\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":90,\"first_name\":\"Buddie\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":91,\"first_name\":\"Izak\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"},{\"id\":92,\"first_name\":\"Gerianne\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":93,\"first_name\":\"Madlen\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":94,\"first_name\":\"Clementia\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":95,\"first_name\":\"Jerrie\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/cc0000/ffffff\"},{\"id\":96,\"first_name\":\"Eduardo\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":97,\"first_name\":\"Blythe\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":98,\"first_name\":\"Evangeline\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/5fa2dd/ffffff\"},{\"id\":99,\"first_name\":\"Danni\",\"gender\":\"Female\",\"photourl\":\"http://dummyimage.com/100x100.png/ff4444/ffffff\"},{\"id\":100,\"first_name\":\"Godfree\",\"gender\":\"Male\",\"photourl\":\"http://dummyimage.com/100x100.png/dddddd/000000\"}]";

                    }
                });


                // Log.d(TAG, "onClick: " + response.body().string());




            }
        });

    }
}
