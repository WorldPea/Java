package Link;

/*今天看Think in java 的GUI这一章的时候，里面的TextArea这个例子在遍历Map时用到了Map.Entry 和 Map.entrySet() ，记得只见过Map.KeySet()和values()这两个方法，于是到API中一看，Map.entrySet() 这个方法返回的是一个Set<Map.Entry<K,V>>，Map.Entry 是一个接口，他的用途是表示一个映射项（里面有Key和Value），而Set<Map.Entry<K,V>>表示一个映射项的Set。
Map.Entry里有相应的getKey和getValue方法，让我们能够从一个项中取出Key和Value。这样就能理解了例子中的写法了。
    for(Map.Entry me : m.entrySet()) {
        t.append(me.getKey() + ": " + me.getValue() + "/n");
    }
这里的t是一个TextArea，m是一个HashMap。
这种遍历Map的方法可以让我们在从Map中取得关键字之后，我们不用每次重复返回到Map中取得相对的值。
如下面是以前的写法：每次都要再从m中读出s所对应的值。
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
	map.put("1", "张三");
	map.put("2", "李四");
	map.put("3", "王五");

	System.out.println("方法一：");
	Iterator<Map.Entry<String,String>> it1 = map.entrySet().iterator();
	while(it1.hasNext()){
		Map.Entry<String,String> entry = it1.next();
		System.out.println("key:"+entry.getKey()+" value"+entry.getValue());
	}
	System.out.println("方法二：");
	for(Map.Entry<String, String> entry : map.entrySet()){
		System.out.println("key:"+entry.getKey()+" value"+entry.getValue());
	}
    System.out.println("方法三：");
    for(String key : map.keySet()){
    	System.out.println("key:"+key+" value"+map.get(key));
    }
    System.out.println("方法四：");
    for(String value : map.values()){
    	System.out.println(value);
    }
  }
}
/*结果：

[html] view plaincopyprint?
1.方法一： 
2.key:3 value王五 
3.key:2 value李四 
4.key:1 value张三 
5.方法二： 
6.key:3 value王五 
7.key:2 value李四 
8.key:1 value张三*/