package com.example.aplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.apication.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class GridViewActivity extends Activity {
	GridView gv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gridviewlayout);
		
		gv=(GridView) findViewById(R.id.gridView1);
		//׼�����������������ݣ�
		final SimpleAdapter sa=prepareData();
		//����������
		gv.setAdapter(sa);
		
		//GridViewע���¼�
		gv.setOnItemClickListener(new OnItemClickListener() {
			
			
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent intent = new Intent(GridViewActivity.this,NewsSQLite.class);
				switch (arg2){
				case 0:
					intent.putExtra("value", arg2+"");
					
				break;
				case 1:
					intent.putExtra("value", arg2+"");
				break;
				case 2:
					intent.putExtra("value", arg2+"");
				break;
				case 3:
					intent.putExtra("value", arg2+"");
				break;
				case 4:
					intent.putExtra("value", arg2+"");
				break;
				case 5:
					intent.putExtra("value", arg2+"");
				break;
				case 6:
					intent.putExtra("value", arg2+"");
				break;
				default:

				Toast.makeText(GridViewActivity.this,"������������",Toast.LENGTH_SHORT).show();
				break;
				}
				startActivity(intent);
			}
		});
	}
	
	//����GridView����ʾ������
	private SimpleAdapter prepareData() {
		
		List<Map<String,Object>> data =new ArrayList<Map<String,Object>>();
		
		Map<String, Object> item1=new HashMap<String, Object>();
		item1.put("img", R.drawable.b);
		item1.put("name", "�ȵ��Ƽ�");
		Map<String, Object> item2=new HashMap<String, Object>();
		item2.put("img", R.drawable.c);
		item2.put("name", "��Ƶ�챨");
		Map<String, Object> item3=new HashMap<String, Object>();
		item3.put("img", R.drawable.e);
		item3.put("name", "��Ц����");
		Map<String, Object> item4=new HashMap<String, Object>();
		item4.put("img", R.drawable.g);
		item4.put("name", "�������");
		Map<String, Object> item5=new HashMap<String, Object>();
		item5.put("img", R.drawable.f);
		item5.put("name", "�����챨");
		Map<String, Object> item6=new HashMap<String, Object>();
		item6.put("img", R.drawable.d);
		item6.put("name", "��ʳ����");
		Map<String, Object> item7=new HashMap<String, Object>();
		item7.put("img", R.drawable.a);
		item7.put("name", "��Ƭ����");
		data.add(item1);
		data.add(item2);
		data.add(item3);
		data.add(item4);
		data.add(item5);
		data.add(item6);
		data.add(item7);
		
		SimpleAdapter sa =new SimpleAdapter(
				this,
				data,
				R.layout.gridview_item_1,
				new String[]{"img","name"},
				new int[]{R.id.gv_imageView1,R.id.gv_textView1}
		);
		return sa;
	}
	
}
