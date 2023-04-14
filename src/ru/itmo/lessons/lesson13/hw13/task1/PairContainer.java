package ru.itmo.lessons.lesson13.hw13.task1;
/*Объявить класс `PairContainer` со свойствами `key` и `value`. `key` и `value` - generic свойства без ограничений, но
   могут быть разных типов.*/
public class PairContainer<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PairContainer{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
