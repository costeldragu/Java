package com.mdc.codingame.Graph;

import java.util.HashMap;
import java.util.Map;

public class Node {
    public static String path;
    private int name;
    private Node parent;
    private String parentName;
    private Map<Integer, Node> connections = new HashMap<>();

    public Node(int name) {
        this.name = name;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * get the name
     *
     * @return String
     */
    public int getName() {
        return name;
    }

    /**
     * Set the name
     *
     * @param name
     */
    public void setName(int name) {
        this.name = name;
    }

    /**
     * Add new connection
     *
     * @param node
     */
    public void addConnection(Node node) {
        System.out.println("Add connection  :" + node.getName() +" to node:" + getName());
        connections.put(node.getName(), node);
    }

    /**
     * Get node name
     *
     * @param name
     * @return
     */
    public Node getNode(String name) {
        if (!connections.isEmpty() && connections.containsKey(name)) {
            return connections.get(name);
        }
        return null;
    }


    public Node findNode(int name) {
        Node found = null;
        for (Map.Entry<Integer, Node> entry : connections.entrySet()) {
            found = entry.getValue();
            path +="/" + found.getName();
            if(found.getName() == name ) {
                break;
            }else{
                found = found.findNode(name);
            }
        }
        return found;
    }
}
