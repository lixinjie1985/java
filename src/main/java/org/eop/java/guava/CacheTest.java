package org.eop.java.guava;

import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

/**
 * @author lixinjie
 * @since 2018-03-28
 */
public class CacheTest {

	public static void main(String[] args) throws Exception {
		Cache<String, String> cache = CacheBuilder.newBuilder()
			.expireAfterWrite(1, TimeUnit.MINUTES)
			.maximumSize(1)
			.initialCapacity(1)
			.build();
		cache.put("token", "helloworld!");
		System.out.println(cache.getIfPresent("token"));
		Thread.sleep(30000);
		System.out.println(cache.getIfPresent("token"));
		Thread.sleep(31000);
		System.out.println(cache.getIfPresent("token"));
	}

}
