package com.example.a24270.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit>fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initfruits();//初始化水果数据
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView=(ListView) findViewById(R.id.list_view);//接收一个布局id,并构造一个listview对象
        listView.setAdapter(adapter);//将构造器传给listview对象,进行启动
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        /*ArrayAdapter<String> adapter=new ArrayAdapter<String>
        (MainActivity.this,android.R.layout.simple_list_item_1,data);
        android中的内置布局文件,里面只有一个TextView,可用于显示一段文本*/
    }
    private void initfruits(){
        for (int i=0;i<2;i++)
        {
            Fruit m1=new Fruit("Apple",R.drawable.fruit);
            fruitList.add(m1);
            Fruit m2=new Fruit("Banana",R.drawable.fruit);
            fruitList.add(m2);
            Fruit m3=new Fruit("Orange",R.drawable.fruit);
            fruitList.add(m3);
            Fruit m4=new Fruit("Watermelon",R.drawable.fruit);
            fruitList.add(m4);
            Fruit m5=new Fruit("Pear",R.drawable.fruit);
            fruitList.add(m5);
            Fruit m6=new Fruit("Grape",R.drawable.fruit);
            fruitList.add(m6);
            Fruit m7=new Fruit("Pineapple",R.drawable.fruit);
            fruitList.add(m7);
            Fruit m8=new Fruit("Strawberry",R.drawable.fruit);
            fruitList.add(m8);
        }
    }
}
