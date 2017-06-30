import com.iih5.redis.Redis;
import com.iih5.redis.RedisKit;
import redis.clients.jedis.JedisPubSub;

/**
 * ---------------------------------------------------------------------------
 * 类名称 ：TestMain
 * 类描述 ：
 * 创建人 ： king.xue
 * 创建时间： 2017/6/30 15:32
 * 版权拥有：宝力优特JV团队
 * ---------------------------------------------------------------------------
 */

public class TestMain {
    public static void main(String[] args) {
        new RedisKit("172.16.7.30",6379);
        Redis.subscribe(new JedisPubSub() {
            @Override
            public void onMessage(String channel, String message) {
                System.out.println("channel="+channel+" message="+message);
            }
        },"CMD");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10000; i++) {
            Redis.publish("CMD","1111111111111111111111");
        }
    }
}
