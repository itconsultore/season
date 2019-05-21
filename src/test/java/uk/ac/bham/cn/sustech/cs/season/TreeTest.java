/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.bham.cn.sustech.cs.season;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Francisco Ramirez
 */
public class TreeTest
{

    /**
     * Test of Tree constructors
     */
    @Test
    public void testNew()
    {
        Tree tree0 = new Tree();
        Assert.assertEquals(0, tree0.countLeaves().size());

        Tree tree1 = new Tree(5);
        Assert.assertEquals(1, tree1.countLeaves().size());
        Assert.assertEquals(5, 1 * tree1.countLeaves().get(Leaf.GREEN));

        Tree tree2 = new Tree(5, Leaf.PURPLE);
        Assert.assertEquals(1, tree2.countLeaves().size());
        Assert.assertEquals(5, 1 * tree2.countLeaves().get(Leaf.PURPLE));

        tree0.add(5, Leaf.GREEN);
        tree0.add(5, Leaf.PURPLE);
        Assert.assertEquals(2, tree0.countLeaves().size());
        Assert.assertEquals(5, 1 * tree0.countLeaves().get(Leaf.GREEN));
        Assert.assertEquals(5, 1 * tree0.countLeaves().get(Leaf.PURPLE));
    }

    @Test
    public void testAuttumOnlyGreen()
    {
        Tree tree1 = new Tree(5);
        Assert.assertEquals(1, tree1.countLeaves().size());
        Assert.assertEquals(5, 1 * tree1.countLeaves().get(Leaf.GREEN));
        
        tree1.autumnIsOver();
        Assert.assertEquals(1, tree1.countLeaves().size());
        Assert.assertEquals(5, 1 * tree1.countLeaves().get(Leaf.YELLOW));
    }

    @Test
    public void testAuttumOnlyPurple()
    {
        Tree tree2 = new Tree(5, Leaf.PURPLE);
        Assert.assertEquals(1, tree2.countLeaves().size());
        Assert.assertEquals(5, 1 * tree2.countLeaves().get(Leaf.PURPLE));

        tree2.autumnIsOver();
        Assert.assertEquals(1, tree2.countLeaves().size());
        Assert.assertEquals(5, 1 * tree2.countLeaves().get(Leaf.FRUIT));
    }

    @Test
    public void testAuttumGreenAndPurple()
    {
        Tree tree0 = new Tree(5, Leaf.GREEN);
        tree0.add(15, Leaf.PURPLE);
        Assert.assertEquals(2, tree0.countLeaves().size());
        Assert.assertEquals(5, 1 * tree0.countLeaves().get(Leaf.GREEN));
        Assert.assertEquals(15, 1 * tree0.countLeaves().get(Leaf.PURPLE));

        tree0.autumnIsOver();
        Assert.assertEquals(2, tree0.countLeaves().size());
        Assert.assertEquals(5, 1 * tree0.countLeaves().get(Leaf.YELLOW));
        Assert.assertEquals(15, 1 * tree0.countLeaves().get(Leaf.FRUIT));
    }
}
