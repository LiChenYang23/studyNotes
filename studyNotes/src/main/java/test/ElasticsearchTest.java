package test;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

public class ElasticsearchTest {

    @Test
    public void test1(){
        Client client = null;
        Settings settings = Settings.builder()
                //集群名称
                .put("cluster.name", "cluster-es-test")
                //自动嗅探
                .put("client.transport.sniff", true)
                .put("discovery.type", "zen")
                .put("discovery.zen.minimum_master_nodes", 1)
                .put("discovery.zen.ping_timeout", "500ms")
                .put("discovery.initial_state_timeout", "500ms")
                .build();
        try {
            client = new PreBuiltTransportClient(settings)
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("172.18.6.203"), 9300));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        Map<String, Object> map = new HashMap<String, Object>();
        // map.put("name", "Smith Wang");
        map.put("name", "Smith Chen");
        // map.put("age", 20);
        map.put("age", 5);
        // map.put("interests", new String[]{"sports","film"});
        map.put("interests", new String[] { "reading", "film" });
        // map.put("about", "I love to go rock music");
        map.put("about", "I love to go rock climbing");

        IndexResponse response = client.prepareIndex("test", "employee", "1")
                .setSource(map).get();
        System.out.println("写入数据结果=" + response.status().getStatus() + "！id=" + response.getId());
    }
}
