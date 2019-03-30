package com.nsv.jsmbaba.cloneobject.deepcopy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Employee implements Cloneable {
private String name;
private String id;
private Address address;

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee clonedEmployee = new Employee();
        clonedEmployee.setId(this.id);
        clonedEmployee.setName(this.name);
        Address address = new Address();
        address.setCity(this.getAddress().getCity());
        address.setState(this.getAddress().getState());
        clonedEmployee.setAddress(address);
        return clonedEmployee;
    }
}
