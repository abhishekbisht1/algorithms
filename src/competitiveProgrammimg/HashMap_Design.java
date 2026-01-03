package competitiveProgrammimg;

import java.util.LinkedList;
import java.util.List;

public class HashMap_Design {
	
	private static final int SIZE = 769;
    private  List<Node>[] bucket;

    public static class Node{
        int key, value;
        Node(int k, int v){
            key = k;
            value = v;
        }
    }

    public int hash(int key){
        return key % SIZE;
    }

    public HashMap_Design() {
        bucket = new List[SIZE];
        for(int i=0; i< SIZE ; i++){
            bucket[i] = new LinkedList<>();
        }
    }
    
    public void put(int key, int value) {
        int idx = hash(key);
        for(Node node: bucket[idx]){
            if(node.key == key){
                node.value = value;
                return;
            }
        }
        bucket[idx].add(new Node(key, value));
    }
    
    public int get(int key) {
        int idx = hash(key);
        for(Node node : bucket[idx]){
           if(node.key == key)
           return node.value;
        }
        return -1;
    }
    
    public void remove(int key) {
        int idx = hash(key);
        List<Node> bucket_ = bucket[idx];

        for (int i = 0; i < bucket_.size(); i++) {
            if (bucket_.get(i).key == key) {
                bucket_.remove(i); 
                return;
            }
        }   
    }

}
