package org.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

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
import org.example.Entity.ClientTransactionEntity;

public class Main {
    public static void main(String[] args) {
        ClientConfiguration cfg = new ClientConfiguration()
                .setAddresses("192.168.1.17");

        //ClientCache<Integer, String> cache;
        ClientCache<UUID, BinaryObject> clientTransactionCache;

        UUID ingiteUUID = UUID.randomUUID();

        try (IgniteClient client = Ignition.startClient(cfg)) {
            ClientTransactionEntity clientTransaction = new ClientTransactionEntity();
            clientTransaction.setTransactionData(
                    ingiteUUID,
                    "123",
                    123 ,
                    "123",
                    "123",
                    "1" ,
                    123 ,
                    LocalDateTime.of(2024,3,30,16,25,0),
                    "123",
                    123,
                    "123",
                    "1",
                    "123",
                    "123",
                    "123",
                    123,
                    "123",
                    "123",
                    "123",
                    "123",
                    "123",
                    "123",
                    "123",
                    123.123,
                    123.123,
                    123.123,
                    "123",
                    "123",
                    UUID.randomUUID(),
                    "12",
                    UUID.randomUUID(),
                    LocalDateTime.of(2024,3,30,16,25,0),
                    123,
                    123.123,
                    true,
                    LocalDateTime.of(2024,3,30,16,25,0),
                    LocalDateTime.of(2024,3,30,16,25,0),
                    UUID.randomUUID(),
                    "123",
                    "123",
                    LocalDateTime.of(2024,3,30,16,25,0)
            );

            System.out.println(clientTransaction.toString());
            //System.out.println(clientTransaction.toBinaryObject(client));

            clientTransactionCache = client
                    .cache("clientTransactionCache")
                    .withKeepBinary();

           clientTransactionCache.put(ingiteUUID, clientTransaction.toBinaryObject(client));

            System.out.println(clientTransactionCache.get(UUID.fromString("27f9887d-3e2a-44b3-b7e3-28306bd5e7b1")));

        } catch (ClientException ce) {
            System.err.println(ce.getMessage());
        }
    }
}

//На завтра: разобраться с логированием, разобраться с конфигурацией