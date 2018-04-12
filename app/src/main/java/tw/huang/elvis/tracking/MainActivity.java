package tw.huang.elvis.tracking;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CheckBox chk1,chk2,chk3,chk4,chk5,chk6,chk7,chk8;
    Button btn;
    TextView tv;
    ListView lv;
    ArrayList<String> report;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1 = findViewById(R.id.checkBox);
        chk2 = findViewById(R.id.checkBox2);
        chk3 = findViewById(R.id.checkBox3);
        chk4 = findViewById(R.id.checkBox4);
        chk5 = findViewById(R.id.checkBox5);
        chk6 = findViewById(R.id.checkBox6);
        btn = findViewById(R.id.button2);
        tv= findViewById(R.id.textView);
//        report = new ArrayList<>();
//        lv = findViewById(R.id.listview);
//        adapter = new ArrayAdapter<String>(MainActivity.this,
//                android.R.layout.simple_list_item_1,report);
//
//        adapter.notifyDataSetChanged();
    }

    public void click1(View v)
    {
        Intent it = new Intent(Intent.ACTION_VIEW);
        StringBuilder sb = new StringBuilder();

        if (chk1.isChecked())
        {
            sb.append("ME/PCBA Test\n");
        }
        if (chk2.isChecked())
        {
            sb.append("Thermal Test\n");
        }
        if (chk3.isChecked())
        {
            sb.append("Derating Test\n");
        }
        if (chk4.isChecked())
        {
            sb.append("Precision Test\n");
        }
        if (chk5.isChecked())
        {
            sb.append("DDR window Size\n");
        }
        if (chk6.isChecked())
        {
            sb.append("DIP test\n");
        }
//        lv.setAdapter(adapter);
//        String i = sb.toString();
        it.setData(Uri.parse("mailto:elvis.huang1983@gmail.com"));
        it.putExtra(Intent.EXTRA_SUBJECT, "尚缺報告");  //設定主旨
        it.putExtra(Intent.EXTRA_TEXT,"尚缺以下報告\n"+sb.toString());   //設定內容
        startActivity(it);
    }

}
