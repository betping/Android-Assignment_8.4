package mr_auspicious.shivam_kr_shiv.com.preferences4;


import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Details> arrayList;
    DetailsAdapter detailsAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       arrayList = new ArrayList<>(); //ArrayList

        listView = (ListView) findViewById(R.id.listView); //Listview where we will be showing the array List values..

        detailsAdapter = new DetailsAdapter(getApplicationContext(),arrayList); //Custom Adapter...

        listView.setAdapter(detailsAdapter); //Setting up listview with custom adapter..
        

    }


    public void add(){

        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.dialog_layout,null);

        final AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setView(view);

        final EditText editText = (EditText) view.findViewById(R.id.editText1);


        final EditText editText1 = (EditText) view.findViewById(R.id.editText2);


        final EditText editText2 = (EditText) view.findViewById(R.id.editText3);


        Button button = (Button) view.findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //handling add button click event by adding the values into arrayList...


                Details details = new Details(editText.getText().toString(),editText1.getText().toString(),editText2.getText().toString());
                arrayList.add(details);
                detailsAdapter.notifyDataSetChanged();
                alertDialog.dismiss();

            }
        });

        Button button1 = (Button) view.findViewById(R.id.b2);
        button1.setOnClickListener(new View.OnClickListener() { //handling the cancel click event by dismissing the dialog box...
            @Override
            public void onClick(View view) {

                alertDialog.dismiss();

            }
        });


        alertDialog.show(); //Showing the alert Dialog..
    }
 @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu); //inflating the menu layout
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {



            //When we click on add button
            case R.id.item:
                add(); //Add the values to the listView ....
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
