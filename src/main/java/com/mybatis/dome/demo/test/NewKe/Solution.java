package com.mybatis.dome.demo.test.NewKe;

import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

/**
 * 二维数组中查找
 */
public class Solution {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

    }

    public static void main(String[] args) {
//        Stack stack = new Stack();
//        ArrayList<Integer> t = new ArrayList<>();
//
//        Node node = new Node(67);
//        node.add(0);
//        node.add(24);
//        node.add(58);
//        while (node != null) {
//            stack.push(node.data);
//            node = node.next;
//        }
//        while (!stack.empty()) {
//            t.add((Integer) stack.peek());
//            stack.pop();
//        }
//        System.out.println(t);
        System.out.println("在吗？妹妹");

    }

    public boolean Find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int row = 0;
            int high = array[i].length - 1;
            while (row <= high) {
                int mid = (row + high) / 2;
                if (target > array[i][mid])
                    row = mid + 1;
                else if (target <= array[i][mid])
                    high = mid - 1;
                else
                    return true;
            }

        }
        return false;
    }

    public String replaceSpace(String s) {
        // write code here
        return s.replaceAll(" ", "%20");
    }

    public ArrayList<Integer> frist = new ArrayList<Integer>();
    public ArrayList<Integer> centre = new ArrayList<Integer>();
    public ArrayList<Integer> last = new ArrayList<Integer>();

    /**
     * 二叉树先序排序，中序排序，后序排序
     *
     * @param root
     * @return
     */
    public int[][] threeOrders(TreeNode root) {
        firstOrder(root);
        centerOrder(root);
        lastOrder(root);
        int[][] resule = new int[3][frist.size()];
        resule[0]=ArrayToInt(frist);
        resule[1]=ArrayToInt(centre);
        resule[2]=ArrayToInt(last);
        return resule;

    }
    public int[] ArrayToInt(ArrayList<Integer> list){
        if (list.size()<=1&&list==null) return new int[0];
        int [] resule=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resule [i]=list.get(i);
        }
        return resule;

    }

    //先序遍历   根左右
    public void firstOrder(TreeNode root) {
        if (root == null) return;
        frist.add(root.val);
        firstOrder(root.left);
        firstOrder(root.right);
    }
    //中序遍历  左根右
    public void centerOrder(TreeNode root) {
        if (root == null) return;
        centerOrder(root.left);
        centre.add(root.val);
        centerOrder(root.right);
    }
    //后序遍历 左右根
    public void lastOrder(TreeNode root) {
        if (root==null) return;
        lastOrder(root.left);
        lastOrder(root.right);
        centre.add(root.val);
    }



    ArrayList<ArrayList<Integer>> list=new ArrayList<>();

    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        t(root,0);
        return list;

    }

    public void t(TreeNode root,int count){

        ArrayList<Integer> res=new ArrayList<Integer>();
        if (root==null)return;


       res.add(root.val);
       t(root.left,count+1);
       t(root.right,count+1);

       list.add(count,res);

    }


}
