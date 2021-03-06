package com.zhaofujun.nest.core;

import java.util.Set;

public interface BeanFinder {
    <T> T getInstance(Class<T> clazz);

    <T> T getInstance(Class<T> clazz, String name);

    <T> Set<T> getInstances(Class<T> clazz);
}
