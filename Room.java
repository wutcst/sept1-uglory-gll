package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

/**
 * 这个类是对方向和房间的描述，对于用户走到哪的描述
 */
public class Room
{
    private String description;
    private HashMap<String, Room> exits;
    private String product;
    private String descrip;
    private double weight;

    public Room() {
        super();
    }

    public void look()
    {
        System.out.println("产品名称为：" + product);
        System.out.println("产品描述为：" + descrip);
        System.out.println("产品重量为：" + weight);
    }
    /**
     * 构造函数，传入每个房间对象对应的描述
     * @param description
     */
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }
    public Room(String description,String product,String descrip,double weight)
    {
        this.description = description;
        exits = new HashMap<>();
        this.product = product;
        this.descrip = descrip;
        this.weight = weight;
    }

    /**
     * 确定方向和对应方向的邻居
     * @param direction
     * @param neighbor
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * 返回对应的描述
     * @return
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * 展示用户目前位置和可以走的方向
     * @return
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    /**
     *描述用户目前所处位置有哪些方向可以走
     * @return
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * 存入方向
     * @param direction
     * @return
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}


