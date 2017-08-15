package com.example.mhassan.gson;

/**
 * Created by M.Hassan on 8/1/2017.
 */

/*public class CurrencyActivity {
}*/

//package com.example.abdul_wahab.networkingsummer17;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;

//import com.example.abdul_wahab.networkingsummer17.models.ClsCountryCurrency;
        import com.google.gson.Gson;

        import java.io.IOException;
        import java.util.List;

        import okhttp3.Call;
        import okhttp3.Callback;
        import okhttp3.OkHttpClient;
        import okhttp3.Request;
        import okhttp3.Response;

public class CurrencyActivity extends AppCompatActivity {

    private static final String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

    /*    OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.myjson.com/bins/g8ihh")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, "onFailure: ");

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                Log.d(TAG, "onResponse: " + response.body().string());
            }
        });*/


        String s = "[\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"c_name\": \"Brazil\",\n" +
                "        \"c_code\": \"BR\",\n" +
                "        \"currencyrate\": \"Real\",\n" +
                "        \"flag\": \"http://dummyimage.com/155x124.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2,\n" +
                "        \"c_name\": \"Poland\",\n" +
                "        \"c_code\": \"PL\",\n" +
                "        \"currencyrate\": \"Zloty\",\n" +
                "        \"flag\": \"http://dummyimage.com/188x134.png/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 3,\n" +
                "        \"c_name\": \"Philippines\",\n" +
                "        \"c_code\": \"PH\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/121x101.jpg/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 4,\n" +
                "        \"c_name\": \"Portugal\",\n" +
                "        \"c_code\": \"PT\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/135x154.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 5,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/178x201.png/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 6,\n" +
                "        \"c_name\": \"Indonesia\",\n" +
                "        \"c_code\": \"ID\",\n" +
                "        \"currencyrate\": \"Rupiah\",\n" +
                "        \"flag\": \"http://dummyimage.com/171x111.bmp/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 7,\n" +
                "        \"c_name\": \"Indonesia\",\n" +
                "        \"c_code\": \"ID\",\n" +
                "        \"currencyrate\": \"Rupiah\",\n" +
                "        \"flag\": \"http://dummyimage.com/204x207.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 8,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/119x147.png/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 9,\n" +
                "        \"c_name\": \"Vietnam\",\n" +
                "        \"c_code\": \"VN\",\n" +
                "        \"currencyrate\": \"Dong\",\n" +
                "        \"flag\": \"http://dummyimage.com/132x215.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 10,\n" +
                "        \"c_name\": \"Argentina\",\n" +
                "        \"c_code\": \"AR\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/211x128.jpg/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 11,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/236x145.bmp/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 12,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/164x248.jpg/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 13,\n" +
                "        \"c_name\": \"Canada\",\n" +
                "        \"c_code\": \"CA\",\n" +
                "        \"currencyrate\": \"Dollar\",\n" +
                "        \"flag\": \"http://dummyimage.com/208x172.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 14,\n" +
                "        \"c_name\": \"Slovenia\",\n" +
                "        \"c_code\": \"SI\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/205x203.png/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 15,\n" +
                "        \"c_name\": \"Sweden\",\n" +
                "        \"c_code\": \"SE\",\n" +
                "        \"currencyrate\": \"Krona\",\n" +
                "        \"flag\": \"http://dummyimage.com/237x112.png/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 16,\n" +
                "        \"c_name\": \"Costa Rica\",\n" +
                "        \"c_code\": \"CR\",\n" +
                "        \"currencyrate\": \"Colon\",\n" +
                "        \"flag\": \"http://dummyimage.com/104x203.png/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 17,\n" +
                "        \"c_name\": \"Indonesia\",\n" +
                "        \"c_code\": \"ID\",\n" +
                "        \"currencyrate\": \"Rupiah\",\n" +
                "        \"flag\": \"http://dummyimage.com/201x235.png/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 18,\n" +
                "        \"c_name\": \"Mexico\",\n" +
                "        \"c_code\": \"MX\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/168x148.jpg/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 19,\n" +
                "        \"c_name\": \"Sweden\",\n" +
                "        \"c_code\": \"SE\",\n" +
                "        \"currencyrate\": \"Krona\",\n" +
                "        \"flag\": \"http://dummyimage.com/192x207.bmp/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 20,\n" +
                "        \"c_name\": \"Czech Republic\",\n" +
                "        \"c_code\": \"CZ\",\n" +
                "        \"currencyrate\": \"Koruna\",\n" +
                "        \"flag\": \"http://dummyimage.com/242x209.bmp/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 21,\n" +
                "        \"c_name\": \"Russia\",\n" +
                "        \"c_code\": \"RU\",\n" +
                "        \"currencyrate\": \"Ruble\",\n" +
                "        \"flag\": \"http://dummyimage.com/113x175.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 22,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/195x135.png/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 23,\n" +
                "        \"c_name\": \"Philippines\",\n" +
                "        \"c_code\": \"PH\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/231x190.bmp/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 24,\n" +
                "        \"c_name\": \"Portugal\",\n" +
                "        \"c_code\": \"PT\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/127x122.bmp/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 25,\n" +
                "        \"c_name\": \"Portugal\",\n" +
                "        \"c_code\": \"PT\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/214x246.bmp/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 26,\n" +
                "        \"c_name\": \"France\",\n" +
                "        \"c_code\": \"FR\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/225x193.jpg/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 27,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/133x103.jpg/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 28,\n" +
                "        \"c_name\": \"Indonesia\",\n" +
                "        \"c_code\": \"ID\",\n" +
                "        \"currencyrate\": \"Rupiah\",\n" +
                "        \"flag\": \"http://dummyimage.com/179x204.bmp/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 29,\n" +
                "        \"c_name\": \"Brazil\",\n" +
                "        \"c_code\": \"BR\",\n" +
                "        \"currencyrate\": \"Real\",\n" +
                "        \"flag\": \"http://dummyimage.com/206x174.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 30,\n" +
                "        \"c_name\": \"Philippines\",\n" +
                "        \"c_code\": \"PH\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/136x167.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 31,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/167x104.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 32,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/136x213.png/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 33,\n" +
                "        \"c_name\": \"Nigeria\",\n" +
                "        \"c_code\": \"NG\",\n" +
                "        \"currencyrate\": \"Naira\",\n" +
                "        \"flag\": \"http://dummyimage.com/242x200.jpg/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 34,\n" +
                "        \"c_name\": \"Russia\",\n" +
                "        \"c_code\": \"RU\",\n" +
                "        \"currencyrate\": \"Ruble\",\n" +
                "        \"flag\": \"http://dummyimage.com/148x191.jpg/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 35,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/244x105.png/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 36,\n" +
                "        \"c_name\": \"Russia\",\n" +
                "        \"c_code\": \"RU\",\n" +
                "        \"currencyrate\": \"Ruble\",\n" +
                "        \"flag\": \"http://dummyimage.com/180x128.bmp/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 37,\n" +
                "        \"c_name\": \"Indonesia\",\n" +
                "        \"c_code\": \"ID\",\n" +
                "        \"currencyrate\": \"Rupiah\",\n" +
                "        \"flag\": \"http://dummyimage.com/102x102.png/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 38,\n" +
                "        \"c_name\": \"Georgia\",\n" +
                "        \"c_code\": \"GE\",\n" +
                "        \"currencyrate\": \"Lari\",\n" +
                "        \"flag\": \"http://dummyimage.com/166x134.jpg/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 39,\n" +
                "        \"c_name\": \"Colombia\",\n" +
                "        \"c_code\": \"CO\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/175x198.png/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 40,\n" +
                "        \"c_name\": \"Palestinian Territory\",\n" +
                "        \"c_code\": \"PS\",\n" +
                "        \"currencyrate\": \"Shekel\",\n" +
                "        \"flag\": \"http://dummyimage.com/154x224.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 41,\n" +
                "        \"c_name\": \"Japan\",\n" +
                "        \"c_code\": \"JP\",\n" +
                "        \"currencyrate\": \"Yen\",\n" +
                "        \"flag\": \"http://dummyimage.com/116x174.jpg/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 42,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/228x145.bmp/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 43,\n" +
                "        \"c_name\": \"Russia\",\n" +
                "        \"c_code\": \"RU\",\n" +
                "        \"currencyrate\": \"Ruble\",\n" +
                "        \"flag\": \"http://dummyimage.com/122x222.bmp/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 44,\n" +
                "        \"c_name\": \"Indonesia\",\n" +
                "        \"c_code\": \"ID\",\n" +
                "        \"currencyrate\": \"Rupiah\",\n" +
                "        \"flag\": \"http://dummyimage.com/203x185.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 45,\n" +
                "        \"c_name\": \"Honduras\",\n" +
                "        \"c_code\": \"HN\",\n" +
                "        \"currencyrate\": \"Lempira\",\n" +
                "        \"flag\": \"http://dummyimage.com/117x209.jpg/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 46,\n" +
                "        \"c_name\": \"Angola\",\n" +
                "        \"c_code\": \"AO\",\n" +
                "        \"currencyrate\": \"Kwanza\",\n" +
                "        \"flag\": \"http://dummyimage.com/218x138.jpg/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 47,\n" +
                "        \"c_name\": \"Indonesia\",\n" +
                "        \"c_code\": \"ID\",\n" +
                "        \"currencyrate\": \"Rupiah\",\n" +
                "        \"flag\": \"http://dummyimage.com/193x231.png/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 48,\n" +
                "        \"c_name\": \"Iran\",\n" +
                "        \"c_code\": \"IR\",\n" +
                "        \"currencyrate\": \"Rial\",\n" +
                "        \"flag\": \"http://dummyimage.com/224x170.bmp/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 49,\n" +
                "        \"c_name\": \"Indonesia\",\n" +
                "        \"c_code\": \"ID\",\n" +
                "        \"currencyrate\": \"Rupiah\",\n" +
                "        \"flag\": \"http://dummyimage.com/181x127.jpg/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 50,\n" +
                "        \"c_name\": \"France\",\n" +
                "        \"c_code\": \"FR\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/130x228.png/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 51,\n" +
                "        \"c_name\": \"Philippines\",\n" +
                "        \"c_code\": \"PH\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/144x161.bmp/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 52,\n" +
                "        \"c_name\": \"Philippines\",\n" +
                "        \"c_code\": \"PH\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/160x100.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 53,\n" +
                "        \"c_name\": \"Poland\",\n" +
                "        \"c_code\": \"PL\",\n" +
                "        \"currencyrate\": \"Zloty\",\n" +
                "        \"flag\": \"http://dummyimage.com/102x214.png/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 54,\n" +
                "        \"c_name\": \"United States\",\n" +
                "        \"c_code\": \"US\",\n" +
                "        \"currencyrate\": \"Dollar\",\n" +
                "        \"flag\": \"http://dummyimage.com/152x139.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 55,\n" +
                "        \"c_name\": \"France\",\n" +
                "        \"c_code\": \"FR\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/157x230.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 56,\n" +
                "        \"c_name\": \"Russia\",\n" +
                "        \"c_code\": \"RU\",\n" +
                "        \"currencyrate\": \"Ruble\",\n" +
                "        \"flag\": \"http://dummyimage.com/226x148.bmp/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 57,\n" +
                "        \"c_name\": \"Israel\",\n" +
                "        \"c_code\": \"IL\",\n" +
                "        \"currencyrate\": \"Shekel\",\n" +
                "        \"flag\": \"http://dummyimage.com/114x116.jpg/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 58,\n" +
                "        \"c_name\": \"Poland\",\n" +
                "        \"c_code\": \"PL\",\n" +
                "        \"currencyrate\": \"Zloty\",\n" +
                "        \"flag\": \"http://dummyimage.com/146x204.jpg/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 59,\n" +
                "        \"c_name\": \"Argentina\",\n" +
                "        \"c_code\": \"AR\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/148x237.bmp/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 60,\n" +
                "        \"c_name\": \"Peru\",\n" +
                "        \"c_code\": \"PE\",\n" +
                "        \"currencyrate\": \"Sol\",\n" +
                "        \"flag\": \"http://dummyimage.com/217x173.png/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 61,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/191x233.png/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 62,\n" +
                "        \"c_name\": \"Chile\",\n" +
                "        \"c_code\": \"CL\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/157x148.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 63,\n" +
                "        \"c_name\": \"Portugal\",\n" +
                "        \"c_code\": \"PT\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/125x242.bmp/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 64,\n" +
                "        \"c_name\": \"Libya\",\n" +
                "        \"c_code\": \"LY\",\n" +
                "        \"currencyrate\": \"Dinar\",\n" +
                "        \"flag\": \"http://dummyimage.com/131x146.png/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 65,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/226x140.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 66,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/186x123.jpg/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 67,\n" +
                "        \"c_name\": \"Portugal\",\n" +
                "        \"c_code\": \"PT\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/146x178.jpg/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 68,\n" +
                "        \"c_name\": \"Russia\",\n" +
                "        \"c_code\": \"RU\",\n" +
                "        \"currencyrate\": \"Ruble\",\n" +
                "        \"flag\": \"http://dummyimage.com/126x175.png/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 69,\n" +
                "        \"c_name\": \"Indonesia\",\n" +
                "        \"c_code\": \"ID\",\n" +
                "        \"currencyrate\": \"Rupiah\",\n" +
                "        \"flag\": \"http://dummyimage.com/141x225.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 70,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/147x187.bmp/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 71,\n" +
                "        \"c_name\": \"Uganda\",\n" +
                "        \"c_code\": \"UG\",\n" +
                "        \"currencyrate\": \"Shilling\",\n" +
                "        \"flag\": \"http://dummyimage.com/184x231.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 72,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/127x101.bmp/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 73,\n" +
                "        \"c_name\": \"Czech Republic\",\n" +
                "        \"c_code\": \"CZ\",\n" +
                "        \"currencyrate\": \"Koruna\",\n" +
                "        \"flag\": \"http://dummyimage.com/209x136.bmp/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 74,\n" +
                "        \"c_name\": \"Greece\",\n" +
                "        \"c_code\": \"GR\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/222x188.jpg/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 75,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/140x170.jpg/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 76,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/160x245.png/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 77,\n" +
                "        \"c_name\": \"France\",\n" +
                "        \"c_code\": \"FR\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/230x135.png/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 78,\n" +
                "        \"c_name\": \"Belarus\",\n" +
                "        \"c_code\": \"BY\",\n" +
                "        \"currencyrate\": \"Ruble\",\n" +
                "        \"flag\": \"http://dummyimage.com/167x246.bmp/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 79,\n" +
                "        \"c_name\": \"Finland\",\n" +
                "        \"c_code\": \"FI\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/167x246.png/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 80,\n" +
                "        \"c_name\": \"North Korea\",\n" +
                "        \"c_code\": \"KP\",\n" +
                "        \"currencyrate\": \"Won\",\n" +
                "        \"flag\": \"http://dummyimage.com/119x106.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 81,\n" +
                "        \"c_name\": \"Norway\",\n" +
                "        \"c_code\": \"NO\",\n" +
                "        \"currencyrate\": \"Krone\",\n" +
                "        \"flag\": \"http://dummyimage.com/217x170.jpg/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 82,\n" +
                "        \"c_name\": \"Portugal\",\n" +
                "        \"c_code\": \"PT\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/128x224.png/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 83,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/240x247.bmp/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 84,\n" +
                "        \"c_name\": \"Nigeria\",\n" +
                "        \"c_code\": \"NG\",\n" +
                "        \"currencyrate\": \"Naira\",\n" +
                "        \"flag\": \"http://dummyimage.com/125x191.png/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 85,\n" +
                "        \"c_name\": \"Sweden\",\n" +
                "        \"c_code\": \"SE\",\n" +
                "        \"currencyrate\": \"Krona\",\n" +
                "        \"flag\": \"http://dummyimage.com/224x169.jpg/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 86,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/114x176.jpg/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 87,\n" +
                "        \"c_name\": \"Poland\",\n" +
                "        \"c_code\": \"PL\",\n" +
                "        \"currencyrate\": \"Zloty\",\n" +
                "        \"flag\": \"http://dummyimage.com/181x158.jpg/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 88,\n" +
                "        \"c_name\": \"Portugal\",\n" +
                "        \"c_code\": \"PT\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/116x175.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 89,\n" +
                "        \"c_name\": \"Indonesia\",\n" +
                "        \"c_code\": \"ID\",\n" +
                "        \"currencyrate\": \"Rupiah\",\n" +
                "        \"flag\": \"http://dummyimage.com/212x177.jpg/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 90,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/180x225.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 91,\n" +
                "        \"c_name\": \"China\",\n" +
                "        \"c_code\": \"CN\",\n" +
                "        \"currencyrate\": \"Yuan Renminbi\",\n" +
                "        \"flag\": \"http://dummyimage.com/198x223.jpg/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 92,\n" +
                "        \"c_name\": \"Philippines\",\n" +
                "        \"c_code\": \"PH\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/124x149.png/dddddd/000000\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 93,\n" +
                "        \"c_name\": \"France\",\n" +
                "        \"c_code\": \"FR\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/231x228.bmp/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 94,\n" +
                "        \"c_name\": \"Philippines\",\n" +
                "        \"c_code\": \"PH\",\n" +
                "        \"currencyrate\": \"Peso\",\n" +
                "        \"flag\": \"http://dummyimage.com/237x212.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 95,\n" +
                "        \"c_name\": \"Slovenia\",\n" +
                "        \"c_code\": \"SI\",\n" +
                "        \"currencyrate\": \"Euro\",\n" +
                "        \"flag\": \"http://dummyimage.com/233x102.jpg/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 96,\n" +
                "        \"c_name\": \"Sweden\",\n" +
                "        \"c_code\": \"SE\",\n" +
                "        \"currencyrate\": \"Krona\",\n" +
                "        \"flag\": \"http://dummyimage.com/130x202.png/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 97,\n" +
                "        \"c_name\": \"Russia\",\n" +
                "        \"c_code\": \"RU\",\n" +
                "        \"currencyrate\": \"Ruble\",\n" +
                "        \"flag\": \"http://dummyimage.com/157x215.bmp/ff4444/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 98,\n" +
                "        \"c_name\": \"United States\",\n" +
                "        \"c_code\": \"US\",\n" +
                "        \"currencyrate\": \"Dollar\",\n" +
                "        \"flag\": \"http://dummyimage.com/104x196.png/5fa2dd/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 99,\n" +
                "        \"c_name\": \"Russia\",\n" +
                "        \"c_code\": \"RU\",\n" +
                "        \"currencyrate\": \"Ruble\",\n" +
                "        \"flag\": \"http://dummyimage.com/224x220.png/cc0000/ffffff\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 100,\n" +
                "        \"c_name\": \"Morocco\",\n" +
                "        \"c_code\": \"MA\",\n" +
                "        \"currencyrate\": \"Dirham\",\n" +
                "        \"flag\": \"http://dummyimage.com/237x187.jpg/dddddd/000000\"\n" +
                "    }\n" +
                "]";


        Gson gson = new Gson();

       /* ClsCountryCurrency c = new ClsCountryCurrency();
        c.setId(1);
        c.setCName("Pakistan");
        c.setCCode("PK");
        c.setCurrencyrate("PKR");

        String cjson =   gson.toJson(c);
        ClsCountryCurrency cobj = gson.fromJson(cjson, ClsCountryCurrency.class);
*/

        ClsCountryCurrency[] obj = gson.fromJson(s, ClsCountryCurrency[].class);

        String s1 = "";

        // jsonschema2pojo
        // mockaroo

    }
}

