package com.nsv.jsmbaba.serialization;

import lombok.*;

import java.io.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements Serializable{ //Externalizable{
    private static final long serialVersionUID = 1L;
    private long id;
    private String name;
    private String title;
    private transient String phno;
    public static final String COUNTRY = "INDIA";
    private String designation;

    /*@Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }*/
}
