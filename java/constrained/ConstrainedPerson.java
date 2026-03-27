package constrained;

import java.beans.*;

public class ConstrainedPerson {
    private int age;
    private VetoableChangeSupport vcs = new VetoableChangeSupport(this);

    public void setAge(int age) throws PropertyVetoException {
        vcs.fireVetoableChange("age", this.age, age);
        this.age = age;
    }

    public void addVetoableChangeListener(VetoableChangeListener l) {
        vcs.addVetoableChangeListener(l);
    }
}