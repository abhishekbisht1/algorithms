package competitiveProgrammimg;

import java.util.LinkedList;
import java.util.List;

public class HashSet_Design {
	
	 private static final int SIZE = 769;
	    private List<Integer>[] bucket;

	    public HashSet_Design() {
	        bucket = new List[SIZE];
	        for(int i = 0; i < SIZE; i++){
	            bucket[i] = new LinkedList<>();
	        }
	    }
	    
	    public int hash(int key){
	        return key % SIZE;
	    }

	    public void add(int key) {
	        int idx = hash(key);
	        if(!bucket[idx].contains(key))
	            bucket[idx].add(key);
	    }
	    
	    public void remove(int key) {
	        int idx = hash(key);
	        bucket[idx].remove((Integer)key);
	        
	    }
	    
	    public boolean contains(int key) {
	        int idx = hash(key);
	        return bucket[idx].contains(key);
	        
	    }

}
