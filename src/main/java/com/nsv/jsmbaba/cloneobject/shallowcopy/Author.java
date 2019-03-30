package com.nsv.jsmbaba.cloneobject.shallowcopy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Author implements Cloneable{
    private String name;
    private String id;

    @Override
    protected Author clone() throws CloneNotSupportedException {
        return (Author)super.clone();
    }
}
