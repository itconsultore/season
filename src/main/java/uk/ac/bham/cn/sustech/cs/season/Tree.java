/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.bham.cn.sustech.cs.season;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Francisco Ramirez
 */
public class Tree
{

    private final List<Leaf> leaves = new ArrayList<>();

    public Tree()
    {
    }

    public Tree(int numberLeaves)
    {
        this(numberLeaves, Leaf.GREEN);
    }

    public Tree(int numberLeaves, Leaf leaf)
    {
        for (int i = 0; i < numberLeaves; i++)
        {
            leaves.add(leaf);
        }
    }

    public void add(int numberLeaves, Leaf leaf)
    {
        for (int i = 0; i < numberLeaves; i++)
        {
            leaves.add(leaf);
        }
    }

    public void autumnIsOver()
    {
        int n = leaves.size();
        for (int i = 0; i < n; i++)
        {
            Leaf leaf = leaves.get(i);
            if (leaf == Leaf.GREEN)
            {
                Leaf newLeaf = Leaf.YELLOW;
                leaves.set(i, newLeaf);
            }
            else if (leaf == Leaf.PURPLE)
            {
                Leaf newLeaf = Leaf.FRUIT;
                leaves.set(i, newLeaf);
            }
        }
    }

    public Map<Leaf, Integer> countLeaves()
    {
        Map<Leaf, Integer> counter = new TreeMap<>();
        int n = leaves.size();
        for (int i = 0; i < n; i++)
        {
            Leaf leaf = leaves.get(i);
            Integer c = counter.get(leaf);
            if (c == null)
            {
                counter.put(leaf, 1);
            }
            else
            {
                counter.put(leaf, c + 1);
            }
        }
        return counter;
    }

    public Map<Leaf, Integer> printCounterLeaves()
    {
        Map<Leaf, Integer> counter = countLeaves();
        System.out.println("The tree with id " + this.hashCode() + " has:");
        for (Map.Entry<Leaf, Integer> entry : counter.entrySet())
        {
            Leaf key = entry.getKey();
            Integer value = entry.getValue();
            if (value > 1)
            {
                System.out.println(value + " leaves are " + key.toString());
            }
            else
            {
                System.out.println(value + " leaf is " + key.toString());
            }
        }
        return counter;
    }

}
