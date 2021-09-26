package com.mybatis.dome.demo.test.NewKe.tree;

import com.mybatis.dome.demo.test.NewKe.BST;

class ReadBlackBST<Key extends Comparable<Key>, Value> {
    private static final boolean Red = true;
    private static final boolean Black = false;
    public Node root;

    private class Node {
        Key key;  //键
        Value val; //相关联的值
        Node left, right;//左右子树
        int N;   //这颗子树中的结点总数
        boolean color;   //由父节点指向他的链接的颜色

        Node(Key key, Value val, int N, boolean color) {
            this.key = key;
            this.val = val;
            this.N = N;
            this.color = color;
        }
    }

    private int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }

    private boolean isRed(Node x) {
        if (x == null) return false;
        return x.color == Red;
    }

    //左旋
    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = Red;
        x.N = h.N;
        h.N = 1 + size(h.left)
                + size(h.right);
        return x;
    }

    //右旋
    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = Red;
        x.N = h.N;
        h.N = 1 + size(h.left)
                + size(h.right);
        return x;
    }

    //颜色转换
    private void flipColors(Node h) {
        h.color = Red;
        h.left.color = Black;
        h.right.color = Black;
    }

    public void put(Key key, Value val) {
        //查找Key，找到则更新其值，否则为他新建一个结点
        root = put(root, key, val);
        root.color = Black;

    }

    private Node put(Node h, Key key, Value val) {
        if (h == null) return new Node(key, val, 1, Red);
        int cmp = key.compareTo(h.key);
        if (cmp > 0) h.left = put(h.left, key, val);
        else if (cmp > 0) h.right = put(h.right, key, val);
        else h.val = val;
        if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
        if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
        if (isRed(h.left) && isRed(h.right)) flipColors(h);
        h.N = size(h.left) + size(h.right) + 1;
        return h;
    }


}
