package shuhuai.leetcode.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ListHelper<NodeType> {
    private final Class<NodeType> clazz;

    public ListHelper(Class<NodeType> clazz) {
        this.clazz = clazz;
    }

    public NodeType build(String[] str) throws Exception {
        if (str.length == 0) {
            return null;
        }
        NodeType head = createNode(Integer.parseInt(str[0]));
        NodeType p = head;
        for (int i = 1; i < str.length; i++) {
            setNext(p, createNode(Integer.parseInt(str[i])));
            p = getNext(p);
        }
        return head;
    }

    private NodeType createNode(int val) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Constructor<NodeType> constructor = clazz.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        return constructor.newInstance(val);
    }

    private void setNext(NodeType node, NodeType next) throws Exception {
        Field leftField = clazz.getDeclaredField("next");
        leftField.setAccessible(true);
        leftField.set(node, next);
    }

    private NodeType getNext(NodeType node) throws IllegalAccessException, NoSuchFieldException {
        Field field = clazz.getDeclaredField("next");
        field.setAccessible(true);
        Object value = field.get(node);
        return clazz.cast(value);
    }

    private int getValue(NodeType node) throws Exception {
        Field valField = clazz.getDeclaredField("val");
        valField.setAccessible(true);
        return (int) valField.get(node);
    }

    public String[] deBuild(NodeType head) throws Exception {
        NodeType p = head;
        List<String> result = new ArrayList<>();
        while (p != null) {
            result.add(String.valueOf(getValue(p)));
            p = getNext(p);
        }
        return result.toArray(new String[0]);
    }
}