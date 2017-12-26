package zhangxiaofang;

import java.util.ArrayList;
import java.util.List;

public class zz {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		list1.add("关羽");
		list1.add("张飞");
		list1.add("赵云");
		list1.add("黄忠");
		list1.add("马超");
		
		list2.add("关羽");
		list2.add("张辽");
		list2.add("徐晃");
		list2.add("徐褚");
		list2.add("曹仁");
		list2.add("夏侯渊");
		
		for (String string : list1) {
			if(!string.equals("马超")){
				System.out.println(string);
			}
		}
		
		
		list1.addAll(list2);
		
		for (String string : list1) {
			System.out.println(string);
		}
	}

}
