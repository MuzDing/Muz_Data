package com.example.aplication;

import java.util.ArrayList;
import java.util.List;
import android.app.AlertDialog.Builder;
import com.example.apication.R;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NewsSQLite extends Activity {

	
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.news);
		 Intent intent = getIntent();
		 final String id = intent.getStringExtra("value");
		//��ȡ�������ϵ�ListView�ؼ�
		lv=(ListView)findViewById(R.id.listView1);
		//���������б�
		final List<String> data=new ArrayList<String>();
		//�����ݿ��ж�����Ӧ�����ݲ����ص�data��	
      	Cursor c;
      	int recCount=0;
      	String str="";
		final DbHelper dbHelper=new DbHelper(this,"News.db");
		c=dbHelper.QueryAllUsesr(id);
      	recCount=c.getCount();//��ȡ�û��ļ�¼��
      	
      	c.moveToFirst();//�Ƶ���һ����¼
      	//ѭ����ȡ�û��˺�
      	for(int i=0;i<recCount;i++ )
      	{
      		//��ȡ���������±�
      		int IDIndex=c.getColumnIndex("title");
      		str=c.getString(IDIndex);
      		data.add(str);
      		c.moveToNext();
      		str="";
      	}		
			//������������������List��ʽ���������������ϵ�ListView�ؼ�����������
			ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);
			//��������
			lv.setAdapter(adapter);	
			

			//��ListView����б�����¼�
			lv.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
						long arg3) {
					Intent intent = new Intent(NewsSQLite.this, NewsContent.class);
					intent.putExtra("num", arg2+"");
					intent.putExtra("id", id);
					startActivity(intent);
					
					
				}	
			}); 
			
	//��ListView��ӳ����¼��������˵�
		lv.setOnItemLongClickListener(new OnItemLongClickListener() {

				public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {				
					registerForContextMenu(lv);				
					return false;
				}
			});
		
	}
	//��������ʽ�˵�
	@Override
	public void onCreateContextMenu(ContextMenu menu,View v,ContextMenuInfo menuInfo)
	{
		super.onCreateContextMenu(menu, v, menuInfo);
		menu.setHeaderIcon(android.R.drawable.ic_menu_manage);
		menu.setHeaderTitle("���������");
		menu.add(Menu.NONE,Menu.FIRST,Menu.FIRST, "����");
		menu.add(Menu.NONE,Menu.FIRST+1,Menu.FIRST+1,"�ղ�");
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

}
