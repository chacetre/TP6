package fr.esilv.tp6.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import fr.esilv.tp6.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mSearch;
    private EditText mSearchText;

   // private RecyclerView mRecyclerView;
    //private RecyclerView.LayoutManager mLayoutManager;
    ///private HistoricItemAdapter mAdapter;

   // private Set<String> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearch = (Button) findViewById(R.id.b_search);
        mSearch.setOnClickListener(this);

        mSearchText = (EditText) findViewById(R.id.ed_search);

       // SharedPreferences prefs = getPreferences(Context.MODE_PRIVATE);
        //data = prefs.getStringSet("historic", new HashSet<String>());

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, VideoResult.class);
        String searchText = mSearchText.getText().toString();
        i.putExtra("search", searchText);
        startActivity(i);
    }
}

