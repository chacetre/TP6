package fr.esilv.tp6;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Set;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mSearch;
    private EditText mSearchText;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    ///private HistoricItemAdapter mAdapter;

    private Set<String> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearch = (Button) findViewById(R.id.b_search);
        mSearch.setOnClickListener(this);

        mSearchText = (EditText) findViewById(R.id.keyword);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, VideoResult.class);
        String searchText = mSearchText.getText().toString();
        i.putExtra("search", searchText);
        startActivity(i);
    }
}

