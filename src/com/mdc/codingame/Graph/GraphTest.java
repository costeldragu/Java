package com.mdc.codingame.Graph;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class GraphTest {

    @Test
    public void testOne() {

        Map<Integer, Node> createdNodes = new HashMap<>();
        Map<Integer, Node> noParentNodes = new HashMap<>();

        int[][] nodes = {

                {1, 2},
                {1, 5},
                {2, 3},
                {2, 4},
                {5, 6},
                {5, 7},
                {8, 9},
                {8, 12},
                {9, 10},
                {9, 11},
                {12, 13},
                {12, 14},
                {15, 16},
                {15, 19},
                {16, 17},
                {16, 18},
                {19, 20},
                {19, 21},
                {0, 1},
                {0, 8},
                {0, 15},

        };
        Node RootNode = new Node(-1);
        for (int x = 0; x < nodes.length; ++x) {
            Node node1;
            Node node2;
            if (!createdNodes.containsKey(nodes[x][0])) {
                node1 = new Node(nodes[x][0]);
                createdNodes.put(nodes[x][0], node1);
            } else {
                node1 = createdNodes.get(nodes[x][0]);
            }
            if (!createdNodes.containsKey(nodes[x][1])) {
                node2 = new Node(nodes[x][1]);

            } else {
                node2 = createdNodes.get(nodes[x][1]);
            }

            node2.setParent(node1);
            node1.addConnection(node2);
            createdNodes.put(nodes[x][1], node2);
            if (noParentNodes.containsKey(node2.getName())) {
                noParentNodes.remove(node2.getName());
            }

            if (node1.getParent() == null && !noParentNodes.containsKey(node1.getName())) {
                noParentNodes.put(nodes[x][0], node1);
            }
            if (node2.getParent() == null && !noParentNodes.containsKey(node2.getName())) {
                noParentNodes.put(nodes[x][1], node2);
            }

        }
        Map.Entry<Integer, Node> entry = noParentNodes.entrySet().iterator().next();
        RootNode = entry.getValue();
        System.out.println(RootNode.getName());

        System.out.println(Arrays.deepToString(nodes));

    }


}
