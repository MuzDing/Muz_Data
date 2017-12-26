package com.example.dbfile;

import java.util.ArrayList;
import java.util.List;

import cn.czu.db.DbHelper;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;

public class first extends Activity {

	
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.first);
		 
		 
		//��ȡ�������ϵ�ListView�ؼ�
			lv=(ListView)findViewById(R.id.listView1);
			//���������б�
			final List<String> data=new ArrayList<String>();
			//=======�����ݿ��ж�����Ӧ�����ݲ����ص�data��===========
			
	    	
      	Cursor c;
      	int recCount=0;
      	String str="";

		DbHelper dbHelper=new DbHelper(this,"NewsData.db");
		c=dbHelper.QueryAllUsesr();
      	recCount=c.getCount();//��ȡ�û��ļ�¼��
      	
      	c.moveToFirst();//�Ƶ���һ����¼
      	//ѭ����ȡ�û��˺�
      	for(int i=0;i<recCount;i++ )
      	{
      		//��ȡ���������±�
      		int userIDIndex=c.getColumnIndex("newsTitle");
      		str=c.getString(userIDIndex);
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
					// TODO Auto-generated method stub
					
					setTitle("��"+arg2+"������");
					
				}	
			}); 
			
			//��ListView��ӳ����¼�
			lv.setOnItemLongClickListener(new OnItemLongClickListener() {

				@Override
				public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					Builder builder=new Builder(first.this);
					builder.setTitle("�������ݣ�");
					builder.setIcon(android.R.drawable.ic_dialog_info);
					builder.setMessage(data.get(arg2).toString());	
					builder.setPositiveButton("ȷ��", null);
					builder.show();
					return false;
				}
			});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

}
