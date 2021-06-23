package br.com.joselucianorc.useful.snipets.designpatterns.gof.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SingletonThreadSafeTest {

	@Test
	public void whenMultipleThreadsGetInstance() {
		SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
		SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();
		
		assertTrue( instance1 != null && (instance1 == instance2));
		
		List<SingletonThreadSafe> singletonList = new ArrayList<>();
		
		singletonList.add(null);
		singletonList.add(null);
		singletonList.add(null);
		singletonList.add(null);
		
		boolean firstExec = true;
		SingletonThreadSafe aux = null;
		
		for (SingletonThreadSafe singleton: singletonList) {
			if (firstExec) {
				aux = SingletonThreadSafe.getInstance();
				assertTrue(aux == instance1);
				assertTrue(aux == instance2);
			} else {
				singleton = SingletonThreadSafe.getInstance();
				assertTrue(aux == singleton);
				aux = singleton;
			}
		}
	}
	
	@Test
	public void getInstanceGotSameInstance() throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		List<Callable<SingletonThreadSafe>> tasks = List.of(
				SingletonThreadSafe::getInstance,
				SingletonThreadSafe::getInstance,
				SingletonThreadSafe::getInstance,
				SingletonThreadSafe::getInstance,
				SingletonThreadSafe::getInstance
			);
		
		List<Future<SingletonThreadSafe>> resultList = pool.invokeAll(tasks);
		SingletonThreadSafe firstSingletonItem = resultList.get(0).get();
		
		for (Future<SingletonThreadSafe> futureSingleton: resultList) {
			var tempSingleton = futureSingleton.get();
			assertEquals(firstSingletonItem, tempSingleton);
		}
	}
}
