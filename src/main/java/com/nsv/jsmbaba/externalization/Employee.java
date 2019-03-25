package com.nsv.jsmbaba.externalization;

import lombok.*;

import java.io.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements Externalizable {
    private static final long serialVersionUID = 1L;
    private long id;
    private String name;
    private String title;
    private String phno;
    public static final String COUNTRY = "INDIA";
    private String designation;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(title);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name= (String)in.readObject();
        title = (String)in.readObject();

    }

    /*@Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }*/
}
