package com.yzp.design.递归;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 递归集合生成树
 */
public class RecursionEg1 {
    private static List<Tree> list = new ArrayList<>();
    static {
        Tree top = new Tree().setCode("1").setParentCode(null).setName("1name");
        Tree top2 = new Tree().setCode("2").setParentCode(null).setName("2name");
        Tree top3 = new Tree().setCode("1-1").setParentCode("1").setName("1-1name");
        Tree top4 = new Tree().setCode("1-2").setParentCode("1").setName("1-2name");
        Tree top5 = new Tree().setCode("1-3").setParentCode("1").setName("1-3name");
        Tree top6 = new Tree().setCode("1-3-1").setParentCode("1-3").setName("1-3-1name");
        Tree top7 = new Tree().setCode("2-1").setParentCode("2").setName("2-1name");
        Tree top8 = new Tree().setCode("2-2").setParentCode("2").setName("2-2name");
        List<Tree> trees = new ArrayList<>();
        trees.add(top);
        trees.add(top2);
        trees.add(top3);
        trees.add(top4);
        trees.add(top5);
        trees.add(top6);
        trees.add(top7);
        trees.add(top8);
        list.addAll(trees);
    }

    public static void main(String[] args) {
        List<Tree> tree = new ArrayList<>();

        // 先设置顶层
        Iterator<Tree> iterator = list.iterator();
        while (iterator.hasNext())
        {
            Tree next = iterator.next();
            if(next.getParentCode()==null)
            {
                tree.add(next);
                iterator.remove();
            }
        }
        if(list.size()>0)
        {
            transformTree(list,tree);
        }
        System.out.println("dsf");
    }

    private static void transformTree(List<Tree> list, List<Tree> tree) {
        Iterator<Tree> iterator = list.iterator();
        while (iterator.hasNext())
        {
            Tree next = iterator.next();
            for(Tree parent:tree)
            {
                if(next.getParentCode().equals(parent.getCode()))
                {
                    if (parent.getChildren() == null) {

                        parent.setChildren(new ArrayList<>());
                    }
                    parent.getChildren().add(next);
                    iterator.remove();
                }
            }
        }
        if(list.size()>0)
        {
            List<Tree> treeChildren = new ArrayList<>();
            for(Tree tr:tree)
            {
                if(tr.getChildren() !=null && tr.getChildren().size()>0)
                {
                    treeChildren.addAll(tr.getChildren());
                }
            }
            if(treeChildren.size()>0)
            {
                transformTree(list,treeChildren);
            }
        }
    }

    static class Tree{
        private String code;
        private String parentCode;
        private String name;
        private List<Tree> children;

        public List<Tree> getChildren() {
            return children;
        }

        public Tree setChildren(List<Tree> children) {
            this.children = children;
            return this;
        }

        public String getCode() {
            return code;
        }

        public Tree setCode(String code) {
            this.code = code;
            return this;
        }

        public String getParentCode() {
            return parentCode;
        }

        public Tree setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }

        public String getName() {
            return name;
        }

        public Tree setName(String name) {
            this.name = name;
            return this;
        }
    }
}
