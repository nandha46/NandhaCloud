package corejava;
/**
 * @author Nandhakumar Subramanian
 */
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;

import util.Loggr;

public class LRUCache {
	private static final String CLASS_NAME = LRUCache.class.getName();
	private Deque<Integer> doublyQueue;
	private HashSet<Integer> hashSet;
	private final int CACHE_SIZE;

LRUCache (int capacity){
	final String methodName = "No Arg Constructor";
	Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
	doublyQueue = new LinkedList<Integer>();
	hashSet = new HashSet<Integer>();
	CACHE_SIZE = capacity;
	Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
	}

public void refer(int page){
	final String methodName = "refer";
	Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		if(!hashSet.contains(page)){
			if(doublyQueue.size()==CACHE_SIZE){
				int last = doublyQueue. removeLast();
				hashSet.remove(last);
			}
			else {
			doublyQueue.remove(page);
		}
		doublyQueue.push(page);
		hashSet.add(page);
		}
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
			}

public void display (){
	final String methodName = "display";
	Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
	Iterator<Integer> itr = doublyQueue.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next()+"  ");
		}
	Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
	}

public static void main(String[] args){
	LRUCache cache = new LRUCache(4);
	cache.refer(2);
	cache.refer(4);
	cache.refer(5);
	cache.refer(2);
	cache.refer(1);
	cache.refer(3);
	cache.refer(5);
	cache.display();

}
}
