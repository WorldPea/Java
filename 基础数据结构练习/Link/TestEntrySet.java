package Link;

/*���쿴Think in java ��GUI��һ�µ�ʱ�������TextArea��������ڱ���Mapʱ�õ���Map.Entry �� Map.entrySet() ���ǵ�ֻ����Map.KeySet()��values()���������������ǵ�API��һ����Map.entrySet() ����������ص���һ��Set<Map.Entry<K,V>>��Map.Entry ��һ���ӿڣ�������;�Ǳ�ʾһ��ӳ���������Key��Value������Set<Map.Entry<K,V>>��ʾһ��ӳ�����Set��
Map.Entry������Ӧ��getKey��getValue�������������ܹ���һ������ȡ��Key��Value��������������������е�д���ˡ�
    for(Map.Entry me : m.entrySet()) {
        t.append(me.getKey() + ": " + me.getValue() + "/n");
    }
�����t��һ��TextArea��m��һ��HashMap��
���ֱ���Map�ķ��������������ڴ�Map��ȡ�ùؼ���֮�����ǲ���ÿ���ظ����ص�Map��ȡ����Ե�ֵ��
����������ǰ��д����ÿ�ζ�Ҫ�ٴ�m�ж���s����Ӧ��ֵ��
   Set keys = m.keySet( );
   if(keys != null)
      for(String s : keys)
          t.append(s + ": " + m.get(s) + "/n");
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class TestEntrySet {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<String,String>();
	map.put("1", "����");
	map.put("2", "����");
	map.put("3", "����");

	System.out.println("����һ��");
	Iterator<Map.Entry<String,String>> it1 = map.entrySet().iterator();
	while(it1.hasNext()){
		Map.Entry<String,String> entry = it1.next();
		System.out.println("key:"+entry.getKey()+" value"+entry.getValue());
	}
	System.out.println("��������");
	for(Map.Entry<String, String> entry : map.entrySet()){
		System.out.println("key:"+entry.getKey()+" value"+entry.getValue());
	}
    System.out.println("��������");
    for(String key : map.keySet()){
    	System.out.println("key:"+key+" value"+map.get(key));
    }
    System.out.println("�����ģ�");
    for(String value : map.values()){
    	System.out.println(value);
    }
  }
}
/*�����

[html] view plaincopyprint?
1.����һ�� 
2.key:3 value���� 
3.key:2 value���� 
4.key:1 value���� 
5.�������� 
6.key:3 value���� 
7.key:2 value���� 
8.key:1 value����*/