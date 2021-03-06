package com.zhizus.forest.client.cluster.lb;

import com.zhizus.forest.client.cluster.FailoverCheckingStrategy;
import com.zhizus.forest.common.ServerInfo;
import com.zhizus.forest.common.codec.Message;
import com.zhizus.forest.common.registry.AbstractServiceDiscovery;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Dempe on 2016/12/7.
 */
public class RandomLoadBalance<T> extends AbstractLoadBalance<T> {

    public RandomLoadBalance(FailoverCheckingStrategy failoverCheckingStrategy, String serviceName, AbstractServiceDiscovery discovery) {
        super(failoverCheckingStrategy, serviceName, discovery);
    }

    @Override
    public ServerInfo<T> select(Message message) {
        List<ServerInfo<T>> availableServerList = getAvailableServerList();
        int idx = (int) (ThreadLocalRandom.current().nextDouble() * availableServerList.size());
        return availableServerList.get((idx) % availableServerList.size());
    }
}
