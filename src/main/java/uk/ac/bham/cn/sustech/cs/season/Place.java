/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.bham.cn.sustech.cs.season;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco Ramirez
 */
public class Place
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("One tree");
        Tree tree = new Tree();
        tree.add(5, Leaf.GREEN);
        tree.add(15, Leaf.PURPLE);
        tree.printCounterLeaves();
        System.out.println();
        System.out.println();
        System.out.println("Autumn is over");
        tree.autumnIsOver();
        tree.printCounterLeaves();
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Now more trees");
        List<Tree> place = new ArrayList<>();
        for (int i=0; i<Math.round(Math.random()*10); i++)
        {
            tree = new Tree();
            tree.add(Math.toIntExact(Math.round(Math.random()*15)+1), Leaf.GREEN);
            tree.add(Math.toIntExact(Math.round(Math.random()*15)+1), Leaf.PURPLE);
            place.add(tree);
        }
        System.out.println("During autumn");
        for (Tree t: place)
        {
            t.printCounterLeaves();
            t.autumnIsOver();
        }
        System.out.println("Autumn is over");
        for (Tree t: place)
        {
            t.printCounterLeaves();
        }
        
    }
}
