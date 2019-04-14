import java.util.HashMap;
import java.util.Map;

public class CharCount {


	public void charChount(String input)
	{
		Map<Character,Integer> hashmap = new HashMap<Character,Integer>();
		for (int i = 0; i < input.length(); i++) {
			if(hashmap.containsKey(input.charAt(i)))			
			{
				int count = hashmap.get(input.charAt(i));
				System.out.println(count);
				hashmap.put(input.charAt(i),count+1);
			}else {
				hashmap.put(input.charAt(i),1);
			}
         
		}
		System.out.println(hashmap);
	}

	public static void main(String[] args) {

     CharCount obj=new CharCount();
     obj.charChount("fayyyyaaaff");
	}

}
