package constrained;

import java.beans.*;

public class TestConstrained {
    public static void main(String[] args) {
        ConstrainedPerson p = new ConstrainedPerson();

        p.addVetoableChangeListener(evt -> {
            if ((int) evt.getNewValue() < 18)
                throw new PropertyVetoException("Age must be >=18", evt);
        });

        try {
            p.setAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}