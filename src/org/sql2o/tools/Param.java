package org.sql2o.tools;

/**
 * Created by IntelliJ IDEA.
 * User: lars
 * Date: 5/25/11
 * Time: 11:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Param {

    public Param(int type, String name, String complexName, int index) {
        this.type = type;
        this.name = name;
        this.complexName = complexName;
        this.index = index;
    }

    public Param(int type, String name, int index) {
        this(type, name, null, index);
    }

    public int type;
    public String name;
    public String complexName;
    public int index;


    /************ types **************/
    public static final int TYPE_SIMPLE = 0;
    public static final int TYPE_COMPLEX = 1;
}
