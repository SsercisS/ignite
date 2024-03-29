package org.example;

import java.util.Set;

import org.apache.ignite.IgniteBinary;
import org.apache.ignite.Ignition;
import org.apache.ignite.binary.BinaryObject;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.cache.CacheWriteSynchronizationMode;
import org.apache.ignite.client.ClientCache;
import org.apache.ignite.client.ClientCacheConfiguration;
import org.apache.ignite.client.ClientException;
import org.apache.ignite.client.IgniteClient;
import org.apache.ignite.configuration.ClientConfiguration;


public class Main {
    public static void main(String[] args) {
        ClientConfiguration cfg = new ClientConfiguration()
                .setAddresses("192.168.1.19");

//        ClientCacheConfiguration cacheConfiguration = new ClientCacheConfiguration()
//                .setName("testCache")
//                .setCacheMode(CacheMode.REPLICATED)
//                .setWriteSynchronizationMode(CacheWriteSynchronizationMode.FULL_SYNC);

//        Person tom = new Person("Tom", "Maveric", 22);
//        tom.displayInfo();

        ClientCache<Integer, String> cache;
        ClientCache<Integer, BinaryObject> personCache;

        try (IgniteClient client = Ignition.startClient(cfg)) {
//            cache = client.getOrCreateCache(cacheConfiguration);
            personCache = client
                    .cache("personCache")
                    .withKeepBinary();

            IgniteBinary binary = client.binary();
            BinaryObject person = binary
                    .builder("Person")
                    .setField("id", 99, int.class)
                    .setField("name", "Kikdfdiki", String.class)
//                    .setField("Second Name", "Chernov", String.class)
                    .build();

            personCache.put(person.toBuilder().getField("id"), person);

            System.out.println("\n------------------------------------------------------\n");
            System.out.println(personCache.get(1));
//            client
//                    .cache(personCache.getName())
//                    .put(10, "");

            System.out.println("\n------------------------------------------------------\n");
            System.out.println(personCache.get(100));
//            cache.put(1, "123");
//            cache.put(2, "456");
//            cache.put(3, "789");

//            BinaryObject binaryPerson = personCache.get(10);

//            System.out.println(cache.getAll(Set.of(1,2,3,4,5,6)));
//            System.out.printf("\n%s", binaryPerson);

        } catch (ClientException ce) {
            System.err.println(ce.getMessage());
        }
    }
}

//На завтра: разобраться с логированием, разобраться с конфигурацией