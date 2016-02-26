package fr.esilv.tp6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Charlotte on 26/02/2016.
 */
public class VideoResult extends AppCompatActivity {

    private static final int RECOVERY_REQUEST = 25;

    private final ObjectMapper mapper = new ObjectMapper();
    private static final String APIKey = "AIzaSyABtFZXw6r6L_X0lY3AMrSpdXDxuLSQKEU";
    private static final String URL_TEXT = "https://www.googleapis.com/youtube/v3/search?part=snippet&key="+APIKey+"&type=video&q=";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Video> videoList;

    private List<YoutubeVideo> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videorecycleview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
      //  mAdapter = new VideoRecylclerView(videoList);
        mRecyclerView.setAdapter(mAdapter);

        Intent i = getIntent();

        String keywords = i.getStringExtra("search").replaceAll(" ", "+");

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest
                (Request.Method.GET, URL_TEXT + keywords,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    Video result = mapper.readValue(response, Video.class);
                                    data.addAll(Arrays.asList(result.items));
                                    mAdapter.notifyDataSetChanged();
                                    Log.d("jackson", " length : " + videoList.size());
                                    Log.d("jackson", "add all contract");
                                }
                                catch (Exception ex) {
                                    Log.d("aaa", ex.getMessage());
                                }

                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) { }
                });
        requestQueue.add(stringRequest);

    }
}





