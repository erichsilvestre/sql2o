package org.sql2o;

import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: lars
 * Date: 5/21/11
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestEntity {

    public long id;
    public String text;
    public Date time;
    public Timestamp ts;
    public Integer aNumber;
    public Long aLongNumber;


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }

    public Integer getaNumber() {
        return aNumber;
    }

    public void setaNumber(Integer aNumber) {
        this.aNumber = aNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        if (!o.getClass().equals(TestEntity.class)){
            return false;
        }

        TestEntity other = (TestEntity) o;
        return  this.id == other.id &&
                this.text.equals(other.text) &&
                this.time.equals(other.time) &&
                this.ts.equals(other.ts) &&
                this.aNumber.equals(other.aNumber) &&
                this.aLongNumber.equals(other.aLongNumber);
    }
}
