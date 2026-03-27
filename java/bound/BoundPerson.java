package bound;

import java.beans.*;

public class BoundPerson {
    private String name;
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public void setName(String name) {
        String old = this.name;
        this.name = name;
        pcs.firePropertyChange("name", old, name);
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        pcs.addPropertyChangeListener(l);
    }
}